package com.simple.test.service.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.simple.test.common.DBCon;
import com.simple.test.dao.DipartDAO;
import com.simple.test.dao.impl.DipartDAOImpl;
import com.simple.test.service.DipartService;
import com.simple.test.vo.DipartInfo;

public class DipartServiceImpl implements DipartService {

	@Override
	public List<DipartInfo> getSimple() throws SQLException {
		DipartDAO didao = new DipartDAOImpl();
		Connection con = DBCon.getCon();
		List<DipartInfo> diList;
		try {
			diList=didao.selectDipartList(con);	
		}catch (SQLException e) {
			throw e;
		}finally {
			DBCon.close();
		}
		
		return diList;
	}

//	public static void main(String[] args) {
//		DipartService d = new DipartServiceImpl();
//		try {
//			System.out.println(d.getSimple());
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}
