package in.co.rays.exclude2;

import org.springframework.beans.factory.annotation.Autowired;

public class TestAutowire {

	@Autowired
	private UserService userService;

	@Autowired
	private AnotherService anotherService;

	public void operation() {
		userService.greet();
		anotherService.doSomething();
	}

}
