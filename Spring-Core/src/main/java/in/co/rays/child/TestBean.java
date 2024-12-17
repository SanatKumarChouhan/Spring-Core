package in.co.rays.child;

public class TestBean {
	
	private String name;
	
	private int age;
	
	public void setName(String name) {
		
		this.name=name;
	}
	
	public String getName() {
		
		return name;
	}
	
	public void setAge(int age) {
		
		this.age=age;
	}
	
	public int getAge() {
		
		return age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "TestBean:[name:- " + name + " And age:- " + age + "]";
		
	}

}
