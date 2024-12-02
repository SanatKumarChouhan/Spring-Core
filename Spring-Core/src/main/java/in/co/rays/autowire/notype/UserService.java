package in.co.rays.autowire.notype;

public class UserService {
	
	private UserDaoInter userDaoInter;
	
	public void setUserDaoInter(UserDaoInter userDaoInter) {
		
		this.userDaoInter=userDaoInter;
	}
	
	public void testAdd() {
		
		userDaoInter.add();
	}

}
