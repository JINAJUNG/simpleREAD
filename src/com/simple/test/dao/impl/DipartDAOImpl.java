package com.simple.test.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.simple.test.common.DBCon;
import com.simple.test.dao.DipartDAO;
import com.simple.test.vo.DipartInfo;

public class DipartDAOImpl implements DipartDAO {

	@Override
	public List<DipartInfo> selectDipartList(Connection con) throws SQLException {
		List<DipartInfo> diList = new ArrayList<DipartInfo>();
		String sql = "select * from dipart_info";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			int diNo = rs.getInt("dino");
			String diName = rs.getString("diname");
			String diDesc = rs.getString("didesc");
			int diCnt = rs.getInt("dicnt");
			DipartInfo diInfo = new DipartInfo(diNo, diName, diDesc, diCnt);
			diList.add(diInfo);
		}
		rs.close();
		ps.close();
		return diList;
	}

//	public static void main(String[] args) {
//		DipartDAO s = new DipartDAOImpl();
//		try {
//			System.out.println(s.selectDipartList(DBCon.getCon()));
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
}
