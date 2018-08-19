package com.simple.test.service.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.simple.test.common.DBCon;
import com.simple.test.dao.LvlDAO;
import com.simple.test.dao.impl.LvlDAOImpl;
import com.simple.test.service.LvlService;
import com.simple.test.vo.LvlInfo;

public class LvlServiceImpl implements LvlService {

	@Override
	public List<LvlInfo> getSimple() throws SQLException {
		LvlDAO lvdao = new LvlDAOImpl();
		Connection con = DBCon.getCon();
		List<LvlInfo> liList = null;
		try {
			liList= lvdao.selectSimple(con);	
		}catch (SQLException e) {
			throw e;
		}finally {
			DBCon.close();
		}
		
		return liList;
	}

}
