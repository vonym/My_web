package com.briup.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.briup.one2many.One2ManyMapper;
import com.briup.pojo.Tutor;
import com.briup.utils.MyBatisSqlSessionFactory;

public class StudentTest4 {
	@Test
	public void one2ManyTest() {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		One2ManyMapper mapper = session.getMapper(One2ManyMapper.class);
		Tutor tutor = mapper.findTutorById(1);
		System.out.println(tutor);
	}
	@Test
	public void one2ManyTest2() {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		One2ManyMapper mapper = session.getMapper(One2ManyMapper.class);
		Tutor tutor = mapper.findTutorById(1);
		System.out.println(tutor);
	}
}