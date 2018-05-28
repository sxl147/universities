package ORMclasses.university;

import java.util.Date;

public class StudentCoursesORM 
{
	private Long Id;
	private Long studentId;
	private Long courseId;
	private Date evntTmeStmp;
	private String evntOperId;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public Date getEvntTmeStmp() {
		return evntTmeStmp;
	}
	public void setEvntTmeStmp(Date evntTmeStmp) {
		this.evntTmeStmp = evntTmeStmp;
	}
	public String getEvntOperId() {
		return evntOperId;
	}
	public void setEvntOperId(String evntOperId) {
		this.evntOperId = evntOperId;
	}
}
