package in.co.rays.autowire.bycontructor;

public class UserService {
	
	private UserDaoInter userDaoInter;
	
	public UserService(UserDaoInter userDaoInter) {
		
		this.userDaoInter=userDaoInter;
	}
	
	public void testAdd() {
		
		userDaoInter.add();
	}

}
