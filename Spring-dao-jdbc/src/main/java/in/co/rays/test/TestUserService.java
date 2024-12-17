package in.co.rays.test;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import in.co.rays.dto.UserDTO;
import in.co.rays.service.UserServiceInt;

@Component("testUserService")
public class TestUserService {

	@Autowired
	private UserServiceInt service = null;

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		TestUserService test = (TestUserService) context.getBean("testUserService");

//		test.testAdd();
//		test.testUpdate();
//		test.testDelete();
		test.testFindByPk();
//		test.testAuth();
//		test.testSearch();

	}

	public void testAdd() {

		UserDTO dto = new UserDTO();

		dto.setId(2);
		dto.setFirstName("vinay");
		dto.setLastName("rajput");
		dto.setLogin("vinay@gmail.com");
		dto.setPassword("1234");
		dto.setAddress("indore");

		long pk = service.add(dto);

		System.out.println("Data Inserted pk>>> " + pk);
	}

	public void testUpdate() {

		UserDTO dto = new UserDTO();

		dto.setId(2);
		dto.setFirstName("anuj");
		dto.setLastName("prajapati");
		dto.setLogin("anuj@gmail.com");
		dto.setPassword("1234");
		dto.setAddress("sivni");

		service.update(dto);

		System.out.println("Data Updated");

	}

	public void testDelete() {

		UserDTO dto = new UserDTO();
		service.delete(2);
	}

	public void testFindByPk() {

		UserDTO dto = service.findByPK(1);

		if (dto != null) {

			System.out.println(dto.getId());
			System.out.println("\t" + dto.getFirstName());
			System.out.println("\t" + dto.getLastName());
			System.out.println("\t" + dto.getLogin());
			System.out.println("\t" + dto.getPassword());
			System.out.println("\t" + dto.getAddress());
		} else {
			System.out.println("User ID doesn't Exist.....");
		}

	}

	public void testAuth() {

		UserDTO dto = service.authenticate("yogesh@gmail.com", "1234");

		if (dto != null) {

			System.out.println(dto.getId());
			System.out.println("\t" + dto.getFirstName());
			System.out.println("\t" + dto.getLastName());
			System.out.println("\t" + dto.getLogin());
			System.out.println("\t" + dto.getPassword());
			System.out.println("\t" + dto.getAddress());
		} else {
			System.out.println("User Data doesn't Exist.....");
		}
	}

	public void testSearch() {

		UserDTO dto = new UserDTO();
		List list = service.search(dto, 0, 5);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			dto = (UserDTO) it.next();

			System.out.println(dto.getId());
			System.out.println("\t" + dto.getFirstName());
			System.out.println("\t" + dto.getLastName());
			System.out.println("\t" + dto.getLogin());
			System.out.println("\t" + dto.getPassword());
			System.out.println("\t" + dto.getAddress());
		}
	}

}
