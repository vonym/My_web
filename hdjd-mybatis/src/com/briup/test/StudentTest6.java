package com.briup.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.briup.dynamic.DynamicMapper;
import com.briup.pojo.Course;
import com.briup.pojo.Student;
import com.briup.utils.MyBatisSqlSessionFactory;

/**
 * Dynamic
 *
 */
public class StudentTest6 {
	@Test
	public void test() {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		DynamicMapper mapper = session.getMapper(DynamicMapper.class);
		HashMap<String, Object> map = new HashMap<>();
		map.put("tutorId", 1);
		map.put("courseName", "%Java%");
		map.put("startDate", new Date());
		List<Course> list = mapper.searchCourses(map);
		for (Course course : list) {
			System.out.println(course);
		}
	}

	@Test
	public void test2() {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		DynamicMapper mapper = session.getMapper(DynamicMapper.class);
		HashMap<String, Object> map = new HashMap<>();
		map.put("tutorId", 1);
		map.put("courseName", "%Java%");
		map.put("searchBy", "Tutor");
		List<Course> list = mapper.searchCourses(map);
		for (Course course : list) {
			System.out.println(course);
		}
	}

	@Test
	public void test3() {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		DynamicMapper mapper = session.getMapper(DynamicMapper.class);
		HashMap<String, Object> map = new HashMap<>();
		map.put("tutorId", 1);
		// map.put("courseName", "%Java%");
		List<Course> list = mapper.searchCourses(map);
		for (Course course : list) {
			System.out.println(course);
		}
	}

	@Test
	public void test4() {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		DynamicMapper mapper = session.getMapper(DynamicMapper.class);
		HashMap<String, Object> map = new HashMap<>();
		List<Integer> tutorIds = new ArrayList<Integer>();
		tutorIds.add(1);
		tutorIds.add(3);
		tutorIds.add(5);
		map.put("tutorIds", tutorIds);
		List<Course> courses = mapper.searchCoursesByTutors(map);
		for (Course course : courses) {
			System.out.println(course);
		}
	}

	@Test
	public void test5() {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		DynamicMapper mapper = session.getMapper(DynamicMapper.class);
		Student student=new Student();
		student.setStudId(3);
		student.setName("rose");
		student.setEmail("rose@qq.com");
		mapper.updateStudent(student);
	}
}