package com.briup.annotation;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import com.briup.pojo.Address;
import com.briup.pojo.Person;

public interface AnnotationMapper {
	@Insert("insert into person(id,name,age,address) values(#{id},#{name},#{age},#{address})")
	@SelectKey(statement = "select my_seq.nextval from dual", keyProperty = "id", resultType = int.class, before = true)
	int insertStudent(Person person);

	@Update("update person set name=#{name},age=#{age} where id=#{id}")
	int updateStudent(Person person);

	@Delete("delete from person where id=#{id}")
	int deleteStudent(int id);

	// @Select("select id, name, age,address from person where id=#{id}")
	// Person findStudentById(Integer id);

	@Select("select * from students")
	@Results({ @Result(id = true, column = "id", property = "id"),
			@Result(column = "name", property = "name"),
			@Result(column = "address", property = "address") })
	List<Person> findAllStudents();

	// @Select("select * from person where id=#{id}")
	// @Results({ @Result(id = true, column = "id", property = "id"),
	// @Result(column = "name", property = "name"),
	// @Result(column = "address", property = "address") })
	// Person findStudentById(int id);

	@Select("select * from students where stud_id=#{studId}")
	@ResultMap("com.briup.annotation.AnnotationMapper.PersonResult")
	Person findStudentById(int id);

	@Select("select id as addrId, street, city, state, zip, country from addresses where addr_id=#{id}")
	Address findAddressById(int id);

	// @Select("select * from person where id=#{id}")
	// @Results({ @Result(id = true, column = "id", property = "id"),
	// @Result(column = "name", property = "name"),
	// @Result(column = "age", property = "age"),
	// @Result(property = "address", column = "addr_id", one = @One(select =
	// "com.briup.annotation.AnnotaionMapper.findAddressById")) })
	// Person selectPersonWithAddress(int id);

	@Select("select id, name, age, a.addr_id, country, province, city, zip"
			+ " FROM person s left outer join addresses a on s.addr_id=a.addr_id"
			+ " where id=#{id} ")
	@ResultMap("com.briup.annotation.AnnotationMapper.PersonWithAddressResult")
	Person selectPersonWithAddress(int id);
}
