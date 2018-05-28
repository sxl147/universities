package ORMclasses.university;

import java.math.BigDecimal;
import java.util.Date;

public class CourseGradingORM 
{
	private Long Id;	// grade_type_id
	private String courseId; // course_id
	private String gradeTypeId; // grade_type_id
	private BigDecimal pointValue; // point_value
	private Date evntTmeStmp; // evnt_tmestmp
	private String evntOperId; // evnt_oper_id
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getGradeTypeId() {
		return gradeTypeId;
	}
	public void setGradeTypeId(String gradeTypeId) {
		this.gradeTypeId = gradeTypeId;
	}
	public BigDecimal getPointValue() {
		return pointValue;
	}
	public void setPointValue(BigDecimal pointValue) {
		this.pointValue = pointValue;
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
