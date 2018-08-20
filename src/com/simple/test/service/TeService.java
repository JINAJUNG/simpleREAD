package com.simple.test.service;

import java.sql.SQLException;
import java.util.List;

import com.simple.test.vo.TeInfo;

public interface TeService {
	public List<TeInfo> getTeList(TeInfo te) throws SQLException;

	public TeInfo getTeOne(int teNum) throws SQLException;

	public int insertTe(TeInfo te) throws SQLException;
}
