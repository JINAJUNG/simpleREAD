package com.simple.test.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.simple.test.dao.TeDAO;
import com.simple.test.dao.impl.TeDAOImpl;
import com.simple.test.service.TeService;
import com.simple.test.vo.TeInfo;

public class TeServiceImpl implements TeService {

	TeDAO tdao = new TeDAOImpl();
	@Override
	public List<TeInfo> getTeList(TeInfo te) throws SQLException {
		return tdao.selectList(te);
	}
	@Override
	public TeInfo getTeOne(int teNum) throws SQLException {
		return tdao.selectOne(teNum);
	}
	@Override
	public int insertTe(TeInfo te) throws SQLException {
		return tdao.insertTe(te);
	}

}
