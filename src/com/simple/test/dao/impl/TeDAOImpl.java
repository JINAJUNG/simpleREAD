package com.simple.test.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.simple.test.common.DBCon;
import com.simple.test.dao.TeDAO;
import com.simple.test.vo.TeInfo;

public class TeDAOImpl implements TeDAO {

	Connection con = null;

	@Override
	public List<TeInfo> selectList(TeInfo ti) throws SQLException {
		try {
			con = DBCon.getCon();
			List<TeInfo> tiList = new ArrayList<TeInfo>();
			String sql = "select * from TeInfo";

			if (ti != null) {
				if (ti.getTeNum() != 0) {
					sql += " where teNum=?";
				} else if (ti.getTeName() != null) {
					sql += " where teName like '%' ? '%'";
				} else if (ti.getTeId() != null) {
					sql += " where teName like '%' ? '%'";
				} else if (ti.getTeDesc() != null) {
					sql += " where teName like '%' ? '%'";
				}
			}

			PreparedStatement ps = con.prepareStatement(sql);
			if (ti != null) {
				if (ti.getTeNum() != 0) {
					ps.setString(1, ti.getTeNum() + "");
				} else if (ti.getTeName() != null) {
					ps.setString(1, ti.getTeName());
				} else if (ti.getTeId() != null) {
					ps.setString(1, ti.getTeId());
				} else if (ti.getTeDesc() != null) {
					ps.setString(1, ti.getTeDesc());
				}
			}
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				ti = new TeInfo(rs.getInt("teNum"), rs.getString("teName"), rs.getString("teId"),
						rs.getString("teDesc"));
				tiList.add(ti);
			}
			ps.close();
			rs.close();
			return tiList;
		} catch (SQLException e) {
			throw e;
		} finally {
			DBCon.close();
		}

	}

	@Override
	public TeInfo selectOne(int teNum) throws SQLException {
		try {
			con = DBCon.getCon();
			String sql = "select * from TeInfo where teNum =?";
			TeInfo ti = null;
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, teNum);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				ti = new TeInfo(rs.getInt("teNum"), rs.getString("teName"), rs.getString("teId"),
						rs.getString("teDesc"));
			}
			ps.close();
			rs.close();
			return ti;
		} catch (SQLException e) {
			throw e;
		} finally {
			DBCon.close();
		}
	}

	@Override
	public int insertTe(TeInfo ti) throws SQLException {
		try {
			con = DBCon.getCon();
			String sql = "insert into teInfo values(seq_teNum.nextval,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, ti.getTeName());
			ps.setString(2, ti.getTeId());
			ps.setString(3, ti.getTeDesc());

			int rCnt = ps.executeUpdate();
			if (rCnt == 1) {
				ps.close();
				return rCnt;
			}
			return -1;

		} catch (SQLException e) {
			throw e;
		} finally {
			DBCon.close();
		}

	}

}
