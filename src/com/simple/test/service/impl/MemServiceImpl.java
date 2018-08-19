package com.simple.test.service.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.simple.test.common.DBCon;
import com.simple.test.dao.MemDAO;
import com.simple.test.dao.impl.MemDAOImpl;
import com.simple.test.service.MemService;
import com.simple.test.vo.MemInfo;

public class MemServiceImpl implements MemService {

	@Override
	public List<MemInfo> getSimple() throws SQLException {
		MemDAO sidao = new MemDAOImpl();
		Connection con = DBCon.getCon();
		List<MemInfo> siList = null;
		try {
			siList = sidao.selectSimple(con);	
		}catch(SQLException e) {
			throw e;
		}finally {
			DBCon.close();
		}
		return siList;
	}

//	public static void main(String[] args) {
//		SimpleService s = new SimpleServiceImpl();
//		
//		try {
//			System.out.println(s.getSimple());
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}
