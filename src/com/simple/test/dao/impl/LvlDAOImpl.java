package com.simple.test.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.simple.test.dao.LvlDAO;
import com.simple.test.vo.LvlInfo;

public class LvlDAOImpl implements LvlDAO{

	@Override
	public List<LvlInfo> selectSimple(Connection con) throws SQLException {
		List<LvlInfo> lvInfo = new ArrayList<LvlInfo>();
		String sql = "select * from lvl_Info";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			int lvl=rs.getInt("lvl");
			String liName=rs.getString("liname");
			String liDesc=rs.getString("lidesc");
			LvlInfo lvlInfo = new LvlInfo(lvl, liName, liDesc);
			lvInfo.add(lvlInfo);
		}
		return lvInfo;
	}

}
