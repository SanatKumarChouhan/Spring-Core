package in.co.rays.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestUser {
		
	public static void main(String[] args) {
		
//		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("UserBean.xml"));
		
//		for setter methods and constructor.
		
//		UserBean bean = (UserBean) factory.getBean("user");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("UserBean.xml");
		
		UserBean bean = (UserBean) context.getBean("user");
		
		System.out.println(bean.getUserId());
		System.out.println(bean.getPassword());
		

	}


}
