package com.dashboard.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Project {

	private Integer projId;
	private String projName;
	private String projDesc;
	private String projCategory;
	private String projStatus;

	public Integer getProjId() {
		return projId;
	}

	public void setProjId(Integer projId) {
		this.projId = projId;
	}

	public String getProjName() {
		return projName;
	}

	public void setProjName(String projName) {
		this.projName = projName;
	}

	public String getProjCategory() {
		return projCategory;
	}

	public void setProjCategory(String projCategory) {
		this.projCategory = projCategory;
	}

	public String getProjStatus() {
		return projStatus;
	}

	public void setProjStatus(String projStatus) {
		this.projStatus = projStatus;
	}
	
	@XmlElement(name="desc")
	public String getProjDesc() {
		return projDesc;
	}

	public void setProjDesc(String projDesc) {
		this.projDesc = projDesc;
	}


}
