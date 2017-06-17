package com.briup.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.briup.annotation.AnnotationMapper;
import com.briup.pojo.Address;
import com.briup.pojo.Person;
import com.briup.utils.MyBatisSqlSessionFactory;

/**
 * Annotaion
 *
 */
public class StudentTest7 {
	@Test
	public void test() {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		AnnotationMapper mapper = session.getMapper(AnnotationMapper.class);
		Address address = new Address();
		address.setAddrId(1);
		Person person = new Person(1, "tom", 20, address);
		mapper.insertStudent(person);
		session.commit();
	}

	@Test
	public void test2() {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		AnnotationMapper mapper = session.getMapper(AnnotationMapper.class);
		Person person = new Person();
		person.setId(1);
		person.setName("jack");
		person.setAge(22);
		mapper.updateStudent(person);
		session.commit();
	}

	@Test
	public void test3() {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		AnnotationMapper mapper = session.getMapper(AnnotationMapper.class);
		Person person = mapper.selectPersonWithAddress(1);
		System.out.println("Student :" + person);
		System.out.println("Address :" + person.getAddress());
	}

}