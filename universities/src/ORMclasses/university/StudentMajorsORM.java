package ORMclasses.university;

import java.util.Date;

public class StudentMajorsORM 
{
	private Long Id;
	private Long studentId;
	private Long majorId;
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
	public Long getMajorId() {
		return majorId;
	}
	public void setMajorId(Long majorId) {
		this.majorId = majorId;
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
