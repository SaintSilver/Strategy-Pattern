package com.ex.DAO;

import java.sql.Connection;
import java.sql.SQLException;

import com.ex.Controller.ConnectionMaker;
import com.ex.VO.MessageVO;

public class MessageDAO {
	
	private ConnectionMaker connectionMaker;
	
	public MessageDAO(ConnectionMaker connectionMaker) {
		this.connectionMaker = connectionMaker;
	}
	
	public void add(MessageVO messageVO) throws ClassNotFoundException, SQLException {
		Connection conn = connectionMaker.makeConnection();
		//Äõ¸®
	}
	
	public MessageVO get(String id) throws ClassNotFoundException, SQLException {
		Connection conn = connectionMaker.makeConnection();
		//Äõ¸®
		
		return new MessageVO();
	}

}
