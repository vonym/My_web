package com.briup.one2one;

import com.briup.pojo.Student;

public interface One2OneMapper {
	Student findStudentWithAddress(int id);
}
