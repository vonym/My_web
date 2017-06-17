package com.briup.extend;

import com.briup.pojo.Student;

public interface ExtendMapper {
	Student findStudentById(int id);

	Student selectStudentWithAddress(int id);
}
