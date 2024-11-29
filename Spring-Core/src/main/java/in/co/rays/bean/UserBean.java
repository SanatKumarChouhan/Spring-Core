package in.co.rays.bean;

public class UserBean {

	private String userId = null;

	private String password = null;

	public UserBean() {

	}

	public UserBean(String userId, String password) {

		this.userId = userId;
		this.password = password;

	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
