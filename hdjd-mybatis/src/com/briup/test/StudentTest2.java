package com.briup.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.briup.extend.ExtendMapper;
import com.briup.pojo.Student;
import com.briup.utils.MyBatisSqlSessionFactory;

public class StudentTest2 {
	@Test
	public void selectTest() {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		ExtendMapper mapper = session.getMapper(ExtendMapper.class);
		Student student = mapper.findStudentById(2);
		System.out.println(student.toString());
	}

	@Test
	public void selectTest2() {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		ExtendMapper mapper = session.getMapper(ExtendMapper.class);
		Student student = mapper.selectStudentWithAddress(2);
		System.out.println(student.toString());
	}
}
