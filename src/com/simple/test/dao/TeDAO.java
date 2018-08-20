package com.simple.test.dao;

import java.sql.SQLException;
import java.util.List;

import com.simple.test.vo.TeInfo;

public interface TeDAO {
	public List<TeInfo> selectList(TeInfo ti) throws SQLException;

	public TeInfo selectOne(int teNum) throws SQLException;

	public int insertTe(TeInfo ti) throws SQLException;
}
