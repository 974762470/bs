package com.zc.entity;

import java.util.Date;

public class ThesisTitle {
	private int id;
	private String thesisName;
	private int teacherId;
	private Date submitTime;
	private int status;
	private String statusStr;
	private String inputMan;
	private String description;
	private String nandu;
	private String liang;
	private String from;
	private String leixing;
	
	private String statusName;
	private int state;
	private String stateStr;
	
	public ThesisTitle() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public int getState() {
		return state;
	}


	public void setState(int state) {
		this.state = state;
	}


	public String getStateStr() {
		return stateStr;
	}


	public void setStateStr(String stateStr) {
		this.stateStr = stateStr;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getThesisName() {
		return thesisName;
	}

	public void setThesisName(String thesisName) {
		this.thesisName = thesisName;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	

	public Date getSubmitTime() {
		return submitTime;
	}

	public void setSubmitTime(Date submitTime) {
		this.submitTime = submitTime;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	
	public String getStatusStr() {
		if(status == 0) {
			statusStr = "未选";
		}
		if (status == 1) {
			statusStr = "已选";
		}
		return statusStr;
	}

	public void setStatusStr(String statusStr) {
		this.statusStr = statusStr;
	}

	public String getInputMan() {
		return inputMan;
	}

	public void setInputMan(String inputMan) {
		this.inputMan = inputMan;
	}
	
	

	public String getNandu() {
		return nandu;
	}

	public void setNandu(String nandu) {
		this.nandu = nandu;
	}

	public String getLiang() {
		return liang;
	}

	public void setLiang(String liang) {
		this.liang = liang;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getLeixing() {
		return leixing;
	}

	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	@Override
	public String toString() {
		return "ThesisTitle [id=" + id + ", thesisName=" + thesisName + ", teacherId=" + teacherId + ", submitTime="
				+ submitTime + ", status=" + status + ", statusStr=" + statusStr + ", inputMan=" + inputMan
				+ ", description=" + description + ", nandu=" + nandu + ", liang=" + liang + ", from=" + from
				+ ", leixing=" + leixing + ", statusName=" + statusName + "]";
	}

	


		
	
}
