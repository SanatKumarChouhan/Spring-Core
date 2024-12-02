package in.co.rays.autowire.byname;

public class UserService {
	
	private UserDaoInter userDaoInter;
	
	public void setUserDaoInter(UserDaoInter userDaoInter) {
		
		this.userDaoInter=userDaoInter;
	}
	
	public void testAdd() {
		
		userDaoInter.add();
	}

}
