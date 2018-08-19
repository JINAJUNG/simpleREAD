package com.simple.test.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.simple.test.vo.LvlInfo;

public interface LvlDAO {

	public List<LvlInfo> selectSimple(Connection con)throws SQLException;
}
