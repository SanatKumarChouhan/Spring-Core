package in.co.rays.exclude;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestExcludeManually {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("exclude.xml");
		
		TestAutowire taw= (TestAutowire) context.getBean("testAutowire");
		
		taw.operation();
		
		System.out.println("********1**************");
		
		UserService us = context.getBean("userService", UserService.class);
		
		us.greet();
		
		System.out.println("********2**************");
		
		AnotherService as = context.getBean("anotherService", AnotherService.class);
		
		as.doSomeThing();
		
	}

}
