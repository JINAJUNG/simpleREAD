package com.simple.test.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.simple.test.vo.MemInfo;

public interface MemDAO {
	public List<MemInfo> selectSimple(Connection con) throws SQLException ;
}
