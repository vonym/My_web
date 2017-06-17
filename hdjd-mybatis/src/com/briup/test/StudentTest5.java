package com.briup.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.briup.many2many.Many2ManyMapper;
import com.briup.pojo.Course2;
import com.briup.pojo.Student2;
import com.briup.utils.MyBatisSqlSessionFactory;

/**
 * Many2Many
 *
 */
public class StudentTest5 {
	@Test
	public void insertTest() {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		Many2ManyMapper mapper = session.getMapper(Many2ManyMapper.class);
		// Student student=new Student(1, "tom", "male", "软件工程", "大三");
		// mapper.insertStudent(student);
		Student2 student = new Student2();
		for (int i = 1; i < 11; i++) {
			student.setId(i);
			student.setName("tom");
			student.setGender("male");
			student.setMajor("软件");
			student.setGrade("大三");
			mapper.insertStudent(student);
		}
		session.commit();
	}

	@Test
	public void insertTestCourse() {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		Many2ManyMapper mapper = session.getMapper(Many2ManyMapper.class);
		Course2 course2 = new Course2(1, "0001", "CoreJava", null);
		Course2 course22 = new Course2(2, "0002", "Oracle", null);
		Course2 course23 = new Course2(3, "0003", "Mybatis", null);
		mapper.insertCourse(course2);
		mapper.insertCourse(course22);
		mapper.insertCourse(course23);
		session.commit();
	}

	@Test
	public void insertTestStudent_Course() {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		Many2ManyMapper mapper = session.getMapper(Many2ManyMapper.class);
		Student2 student2 = mapper.getStudentById(1);
		Course2 course2 = mapper.getCourseById(11);
		mapper.studentSelectCourse(student2, course2);
		session.commit();
	}
}