package com.simple.test.service;

import java.sql.SQLException;
import java.util.List;

import com.simple.test.vo.MemInfo;

public interface MemService {
	public List<MemInfo> getSimple() throws SQLException;
}
