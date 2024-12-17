package in.co.rays.autowire.byconstructor;

public class UserService {
	
	private UserDaoInter userDaoInter;
	
	public UserService(UserDaoInter userDaoInter) {
		
		this.userDaoInter=userDaoInter;
	}
	
	public void testAdd() {
		
		userDaoInter.add();
	}

}
