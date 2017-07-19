package com.revature.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.model.BankUser;

public class BankUserDaoImpl implements BankUserDao {

	private static final String USERNAME = "bank_db";
	private static final String PASSWORD = "p4ssw0rd";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	
	@Override
	public BankUser getBankUserByUsername(BankUser user) {
//		BankUser dbUser = null;
//		try (Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);){
//			String sql = "SELECT * FROM customer WHERE cus_username = ?";
//			
//			PreparedStatement ps = con.prepareStatement(sql);
//			ps.setString(1, user.getUsername());
//			ResultSet rs = ps.executeQuery();
//			if(rs.next()){
//				dbUser = new BankUser(rs.getInt("cus_id"),rs.getString("cus_username"),"",
//						"", rs.getString("cus_password"));
//			};
//			
//			
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
	
	//todo
	return user;
	}

}
