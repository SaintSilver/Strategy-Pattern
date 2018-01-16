package com.ex.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ex.Controller.ConnectionMaker;
import com.ex.VO.UserVO;

public class UserDAO {
	
	private ConnectionMaker connectionMaker;
	
	public UserDAO(ConnectionMaker connectionMaker) {
		this.connectionMaker = connectionMaker;
	}

	public void add(UserVO user) throws ClassNotFoundException, SQLException {
		Connection conn = connectionMaker.makeConnection();
		
		String sql = "insert into users(id,name,password) values(?,?,?)";
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setString(1, user.getId());
		psmt.setString(2, user.getName());
		psmt.setString(3, user.getPassword());
		psmt.executeUpdate();
		
		psmt.close();
		conn.close();

	}
	
	public UserVO get(String id) throws ClassNotFoundException, SQLException {
		Connection conn = connectionMaker.makeConnection();
		String sql = "select * from users where id=?";
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setString(1, id);
		
		ResultSet rs = psmt.executeQuery();
		rs.next();
		UserVO user = new UserVO();
		user.setId(rs.getString("id"));
		user.setName(rs.getString("name"));
		user.setPassword(rs.getString("password"));
		rs.close();
		psmt.close();
		conn.close();
		
		return user;
	}
	

}
