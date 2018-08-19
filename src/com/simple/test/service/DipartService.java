package com.simple.test.service;

import java.sql.SQLException;
import java.util.List;

import com.simple.test.vo.DipartInfo;

public interface DipartService {
	public List<DipartInfo> getSimple() throws SQLException;
}
