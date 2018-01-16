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
	
	//���� �ٲ��, �� �κа� DConnectionMaker Ŭ������ �����ϸ� ��.
	public ConnectionMaker connectionMaker() {
		return new DConnectionMaker();
	}
}
