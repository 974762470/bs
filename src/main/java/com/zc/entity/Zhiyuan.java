package com.zc.entity;

import java.util.Date;

public class Zhiyuan {

	private int id;
	private int thesisId;
	private int studentId;
	private Date selectTime;
	public Zhiyuan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getThesisId() {
		return thesisId;
	}
	public void setThesisId(int thesisId) {
		this.thesisId = thesisId;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public Date getSelectTime() {
		return selectTime;
	}
	public void setSelectTime(Date selectTime) {
		this.selectTime = selectTime;
	}
	
	
}
