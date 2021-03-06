package com.simple.test.vo;

public class LvlInfo {
	private int lvl;
	private String liName;
	private String liDesc;

	public LvlInfo(int lvl, String liName, String liDesc) {
		super();
		this.lvl = lvl;
		this.liName = liName;
		this.liDesc = liDesc;
	}

	public int getLvl() {
		return lvl;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	public String getLiName() {
		return liName;
	}

	public void setLiName(String liName) {
		this.liName = liName;
	}

	public String getLiDesc() {
		return liDesc;
	}

	public void setLiDesc(String liDesc) {
		this.liDesc = liDesc;
	}

	@Override
	public String toString() {
		return "LvlInfo [lvl=" + lvl + ", liName=" + liName + ", liDesc=" + liDesc + "]";
	}

}
