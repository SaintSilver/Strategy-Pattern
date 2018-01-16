package com.ex.DAO;
import com.ex.Controller.ConnectionMaker;
import com.ex.Controller.DConnectionMaker;

public class DaoFactory {
	public UserDAO userDAO() {
		return new UserDAO(connectionMaker());
	}
	
	public AccountDAO accountDAO() {
		return new AccountDAO(connectionMaker());		
	}
	
	public MessageDAO messageDAO() {
		return new MessageDAO(connectionMaker());		
	}
	
	//고객이 바뀌면, 이 부분과 DConnectionMaker 클래스만 수정하면 됨.
	public ConnectionMaker connectionMaker() {
		return new DConnectionMaker();
	}
}
