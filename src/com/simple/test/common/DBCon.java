package com.simple.test.common;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBCon {

	private static String url;
	private static String id;
	private static String pwd;
	private static String driver;
	private static Connection con = null;

	public static void load(String path) {
		InputStream is = DBCon.class.getResourceAsStream(path);
		Properties prop = new Properties();

		try {
			prop.load(is);
			is.close();
			url = prop.getProperty("url");
			id = prop.getProperty("user");
			pwd = prop.getProperty("pwd");
			driver = prop.getProperty("driver");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void openCon() {
		load("/config/db.properties");
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, id, pwd);
			con.setAutoCommit(false);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getCon() {
		if(con==null) {
			openCon();	
		}
		return con;
	}
	
	public static void close() {
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		con=null;
	}
	
//	public static void main(String[] args) {
//		DBCon.getCon();
//	}
}
