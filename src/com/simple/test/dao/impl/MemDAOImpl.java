package com.simple.test.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.simple.test.common.DBCon;
import com.simple.test.dao.MemDAO;
import com.simple.test.vo.MemInfo;

public class MemDAOImpl implements MemDAO {

	@Override
	public List<MemInfo> selectSimple(Connection con) throws SQLException {
		List<MemInfo> siList = new ArrayList<MemInfo>();
		MemInfo si;
		String sql = "select * from member_info";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			int miNo = rs.getInt("MINO");
			String miId = rs.getString("MIID");
			String miEtc = rs.getString("MIETC");
			String miEmail = rs.getString("MIEMAIL");
			int diNo = rs.getInt("DINO");

			si = new MemInfo(miNo, miId, miEtc, miEmail,diNo);
			siList.add(si);
		}
		rs.close();
		ps.close();
		return siList;
	}

//	public static void main(String[] args) {
//		SimpleDAO s = new SimpleDAOImpl();
//		try {
//			System.out.println(s.selectSimple(DBCon.getCon()));
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
}
