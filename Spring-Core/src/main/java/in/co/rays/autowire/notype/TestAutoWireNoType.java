package in.co.rays.autowire.notype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWireNoType {

	public static void main(String[] args) {

//		---------------*****------------------------- ye bina xml file aur spring containe ke bina chalne wala code hai

//		UserDaoInter userDaoInter = new UserDaoImpl();
//
//		UserService userService = new UserService();
//
//		userService.setUserDaoInter(userDaoInter);
//
//		userService.testAdd();

//		---------------*****-------------------------

		ApplicationContext context = new ClassPathXmlApplicationContext("autowire-no-type.xml");

		UserService userService = (UserService) context.getBean("userService");

		userService.testAdd();
	}

}
