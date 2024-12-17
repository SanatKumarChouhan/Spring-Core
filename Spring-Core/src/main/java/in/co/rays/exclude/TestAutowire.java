package in.co.rays.exclude;

public class TestAutowire {
	
	private UserService userService;
	private AnotherService anotherService;
	
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public void setAnotherService(AnotherService anotherService) {
		this.anotherService = anotherService;
	}
	
	public void operation() {
		
		userService.greet();
		anotherService.doSomeThing();
	}
	
	

}
