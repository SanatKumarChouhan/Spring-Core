package in.co.rays.child;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestChild {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("child.xml");

		TestBean tb = (TestBean) context.getBean("derivedTestBean");
		
		System.out.println(tb.toString());
		
	}

}
