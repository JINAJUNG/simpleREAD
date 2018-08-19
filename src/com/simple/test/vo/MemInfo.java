package com.simple.test.vo;

public class MemInfo {
	private int miNo;
	private String miId;
	private String miEtc;
	private String miEmail;
	private int diNo;

	public MemInfo(int miNo, String miId, String miEtc, String miEmail, int diNo) {
		this.miNo = miNo;
		this.miId = miId;
		this.miEtc = miEtc;
		this.miEmail = miEmail;
		this.diNo = diNo;
	}

	public int getMiNo() {
		return miNo;
	}

	public void setMiNo(int miNo) {
		this.miNo = miNo;
	}

	public String getMiId() {
		return miId;
	}

	public void setMiId(String miId) {
		this.miId = miId;
	}

	public String getMiEtc() {
		return miEtc;
	}

	public void setMiEtc(String miEtc) {
		this.miEtc = miEtc;
	}

	public String getMiEmail() {
		return miEmail;
	}

	public void setMiEmail(String miEmail) {
		this.miEmail = miEmail;
	}

	public int getDiNo() {
		return diNo;
	}

	public void setDiNo(int diNo) {
		this.diNo = diNo;
	}

	@Override
	public String toString() {
		return "SimpleInfo [miNo=" + miNo + ", miId=" + miId + ", miEtc=" + miEtc + ", miEmail=" + miEmail + ", diNo="
				+ diNo + "]";
	}
	

	
}
