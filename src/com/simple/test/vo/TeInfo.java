package com.simple.test.vo;

public class TeInfo {
	private int teNum;
	private String teName;
	private String teId;
	private String teDesc;
	public TeInfo() {
		
	}
	public TeInfo(int teNum, String teName, String teId, String teDesc) {
		this.teNum = teNum;
		this.teName = teName;
		this.teId = teId;
		this.teDesc = teDesc;
	}
	public int getTeNum() {
		return teNum;
	}
	public void setTeNum(int teNum) {
		this.teNum = teNum;
	}
	public String getTeName() {
		return teName;
	}
	public void setTeName(String teName) {
		this.teName = teName;
	}
	public String getTeId() {
		return teId;
	}
	public void setTeId(String teId) {
		this.teId = teId;
	}
	public String getTeDesc() {
		return teDesc;
	}
	public void setTeDesc(String teDesc) {
		this.teDesc = teDesc;
	}
	@Override
	public String toString() {
		return "TeInfo [teNum=" + teNum + ", teName=" + teName + ", teId=" + teId + ", teDesc=" + teDesc + "]";
	}
	
	
}
