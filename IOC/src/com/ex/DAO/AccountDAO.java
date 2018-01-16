package com.ex.DAO;

import com.ex.Controller.ConnectionMaker;

public class AccountDAO {
	
	private ConnectionMaker connectionMaker;

	public AccountDAO(ConnectionMaker connectionMaker) {
		this.connectionMaker = connectionMaker;
	}
	
}
