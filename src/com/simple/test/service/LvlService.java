package com.simple.test.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.simple.test.vo.LvlInfo;

public interface LvlService {
	public List<LvlInfo> getSimple() throws SQLException;
}
