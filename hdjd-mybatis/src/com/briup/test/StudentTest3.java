package com.briup.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.briup.one2one.One2OneMapper;
import com.briup.pojo.Student;
import com.briup.utils.MyBatisSqlSessionFactory;

public class StudentTest3 {
	@Test
	public void selectTest() {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		One2OneMapper mapper = session.getMapper(One2OneMapper.class);
		Student student = mapper.findStudentWithAddress(2);
		System.out.println(student);
	}

	@Test
	public void selectTest2() {
		// SqlSession session = MyBatisSqlSessionFactory.openSession();
		// One2OneMapper mapper = session.getMapper(One2OneMapper.class);

	}
}