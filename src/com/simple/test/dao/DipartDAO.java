package com.simple.test.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.simple.test.vo.DipartInfo;

public interface DipartDAO {
	public List<DipartInfo> selectDipartList(Connection con) throws SQLException;
}
