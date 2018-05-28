package ORMclasses.university;

import java.util.Date;

public class CourseORM 
{
	private Long Id;
	private Long departmentId;
	private Long semesterId;
	private String courseCode;
	private String courseName;
	private Long maxEnrollment;
	private String nonMajors;
	private Date evntTmeStmp;
	private String evntOperId;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	public Long getSemesterId() {
		return semesterId;
	}
	public void setSemesterId(Long semesterId) {
		this.semesterId = semesterId;
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
	public Long getMaxEnrollment() {
		return maxEnrollment;
	}
	public void setMaxEnrollment(Long maxEnrollment) {
		this.maxEnrollment = maxEnrollment;
	}
	public String getNonMajors() {
		return nonMajors;
	}
	public void setNonMajors(String nonMajors) {
		this.nonMajors = nonMajors;
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
