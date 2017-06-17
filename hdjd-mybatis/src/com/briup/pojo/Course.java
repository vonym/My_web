package com.briup.pojo;

public class Course {
	private Integer id;
	private String courseCode; // ¿Î³Ì±àºÅ
	private String courseName;// ¿Î³ÌÃû³Æ

	public Course() {
	}

	public Course(Integer id, String courseCode, String courseName) {
		this.id = id;
		this.courseCode = courseCode;
		this.courseName = courseName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseCode=" + courseCode
				+ ", courseName=" + courseName + ", students=" + "]";
	}
}