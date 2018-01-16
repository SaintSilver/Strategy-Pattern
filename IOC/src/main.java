import java.sql.SQLException;


import com.ex.DAO.DaoFactory;
import com.ex.DAO.UserDAO;
import com.ex.VO.UserVO;

public class main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//제어의 역전(IOC)
		UserDAO dao = new DaoFactory().userDAO();
		
		UserVO user = dao.get("kutar37");
		System.out.println(user.getId());
		System.out.println(user.getName());
		System.out.println(user.getPassword());
	
	}

}
