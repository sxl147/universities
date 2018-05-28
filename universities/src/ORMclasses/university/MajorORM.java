package ORMclasses.university;

import java.util.Date;

public class MajorORM 
{
	private Long Id;
	private Long departmentId;
	private String majorCode;
	private String majorDescription;
	private String minorFlag;
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
	public String getMajorCode() {
		return majorCode;
	}
	public void setMajorCode(String majorCode) {
		this.majorCode = majorCode;
	}
	public String getMajorDescription() {
		return majorDescription;
	}
	public void setMajorDescription(String majorDescription) {
		this.majorDescription = majorDescription;
	}
	public String getMinorFlag() {
		return minorFlag;
	}
	public void setMinorFlag(String minorFlag) {
		this.minorFlag = minorFlag;
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
