package in.co.rays.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestUser {

	/**
	 * this the core spring workspace and pakckage name is in.co.rays.bean; and
	 * class name is TestUser.java
	 * 
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("UserBean.xml"));

//		for setter methods and constructor both (dono ke liye neeche diye gaye same code hi use hoga).

//		UserBean bean = (UserBean) factory.getBean("user");

		ApplicationContext context = new ClassPathXmlApplicationContext("UserBean.xml");

		UserBean bean = (UserBean) context.getBean("user");

		System.out.println(bean.getUserId());
		System.out.println(bean.getPassword());

		UserBean bean1 = (UserBean) context.getBean("user1");

		System.out.println(bean1.getUserId());
		System.out.println(bean1.getPassword());

	}

}
