package com.zc.entity;

import java.util.Date;
import java.util.List;

public class Topic {
	private int id;
	private int thesisId;
	private int studentId;
	private Date selectTime;
	
	//以下是我写的
	private List<ThesisTitle> thesisTitles;
	private Integer state;
	private String stateStr;
	
	public Topic() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Integer getState() {
		return state;
	}


	public void setState(Integer state) {
		this.state = state;
	}


	public String getStateStr() {
		if (state == 0) {
			stateStr = "审核不通过";
		}
		if (state == 1) {
			stateStr = "审核中";
		}
		if (state == 2) {
			stateStr = "审核通过";
		}
		return stateStr;
	}


	public void setStateStr(String stateStr) {
		this.stateStr = stateStr;
	}
	

	public List<ThesisTitle> getThesisTitles() {
		return thesisTitles;
	}


	public void setThesisTitles(List<ThesisTitle> thesisTitles) {
		this.thesisTitles = thesisTitles;
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
	/*@Override
	public String toString() {
		return "Topic [id=" + id + ", thesisId=" + thesisId + ", studentId=" + studentId + ", selectTime=" + selectTime
				+ "]";
	}*/


	@Override
	public String toString() {
		return "Topic [id=" + id + ", thesisId=" + thesisId + ", studentId=" + studentId + ", selectTime=" + selectTime
				+ ", thesisTitles=" + thesisTitles + ", state=" + state + ", stateStr=" + stateStr + "]";
	}
	


	
	
}
