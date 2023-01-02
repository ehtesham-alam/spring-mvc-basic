package viewcontrol.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import viewcontrol.dao.UserDao;
import viewcontrol.entity.User;

@Service
public class UserService {

	@Autowired
	private UserDao dao;
	
	public int createUser(User user) {
		
		int i = dao.saveUser(user);
		return i;
		
	}
	
}
