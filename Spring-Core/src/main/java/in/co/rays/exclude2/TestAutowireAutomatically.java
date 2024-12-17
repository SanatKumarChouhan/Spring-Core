package in.co.rays.exclude2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowireAutomatically {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("exclude2.xml");
		
		TestAutowire taw = context.getBean("testAutowire", TestAutowire.class);
		
		taw.operation();
	}
}
