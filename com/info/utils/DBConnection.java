package com.info.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection getConnection(){
		try{
			/*Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc::mysql://localhost:3306/db_ecommerce", "root", "");
			return conn;*/
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_ecommerce", "root", "");
			return con;
		}catch(Exception e){
			
		}
		return null;
	}

}
