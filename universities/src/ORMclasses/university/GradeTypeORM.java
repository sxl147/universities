package ORMclasses.university;

import java.util.Date;

public class GradeTypeORM 
{
	private Long Id;	// grade_type_id
	private String gradeTypeCode; // grade_type_code
	private String gradeTypeDesc; // grade_type_desc
	private Date evntTmeStmp; // evnt_tmestmp
	private String evntOperId; // evnt_oper_id
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getGradeTypeCode() {
		return gradeTypeCode;
	}
	public void setGradeTypeCode(String gradeTypeCode) {
		this.gradeTypeCode = gradeTypeCode;
	}
	public String getGradeTypeDesc() {
		return gradeTypeDesc;
	}
	public void setGradeTypeDesc(String gradeTypeDesc) {
		this.gradeTypeDesc = gradeTypeDesc;
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
