package in.co.rays.exclude2;

public class UserService {

	private String name;

	public UserService(String name) {

		this.name = name;

	}

	public void greet() {

		System.out.println("Hello!.... " + name + " sir");
	}

}
