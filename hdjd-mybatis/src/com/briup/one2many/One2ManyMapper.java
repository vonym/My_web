package com.briup.one2many;

import com.briup.pojo.Address;
import com.briup.pojo.Course;
import com.briup.pojo.Tutor;

public interface One2ManyMapper {
	Tutor findTutorById(int id);

	Address findAddressById(int id);

	Course findCoursesByTutor(int id);

}
