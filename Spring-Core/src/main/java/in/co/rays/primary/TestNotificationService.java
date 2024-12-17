package in.co.rays.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestNotificationService {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("primary.xml");
		
		NotificationService ns= (NotificationService) context.getBean("notificationService");
		
		ns.sendNotification("Hello! Sprint.....");
	}

}
