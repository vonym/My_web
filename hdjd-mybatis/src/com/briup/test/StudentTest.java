package com.briup.test;

import java.io.InputStream;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.briup.pojo.PhoneNumber;
import com.briup.pojo.Student;
import com.briup.pojo.StudentMapper;
import com.briup.utils.MyBatisSqlSessionFactory;

public class StudentTest {

	@Test
	public void testInsert() {
		try {
			InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			// 第一种方式：执行sql语句的方式。通过xxxMapper接口的实现
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			PhoneNumber phoneNumber = new PhoneNumber("0086", "0797", "12345678");
			Student s = new Student(1, "tom", "123@briup.com", new Date());
			// Student s2 = new Student(2, "jack", "123@briup.com", new Date());
			 Student s3 = new Student(3, "rose", "123@briup.com", new
			 Date(),phoneNumber);
			studentMapper.insertStudent(s3);
			studentMapper.insertStudent(s);
			// int count =
			// sqlSession.insert("com.briup.pojo.StudentMapper.insertStudent",
			// new Student(1, "tom", "123@briup.com", new Date(), phoneNumber));
			// int count = 0;
			// for (int i = 1; i < 100; i++) {
			// sqlSession.insert("com.briup.pojo.StudentMapper.insertStudent",
			// new Student(i, "tom", "123@briup.com", new Date(), phoneNumber));
			// count++;
			// }
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testSelect() {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		Student student = mapper.findStudentById(3);
		Student student1 = session.selectOne("com.briup.pojo.StudentMapper.findStudentById", 4);
		System.out.println(student);
		System.out.println(student1);
		session.commit();
	}

	@Test
	public void testUpdate() {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		Student student = new Student(2, "jack", "jack@briup.com");
		mapper.updateStudent(student);
		session.commit();
	}

	@Test
	public void testDelete() {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		mapper.deleteStudent(1);
		session.commit();
	}
}
