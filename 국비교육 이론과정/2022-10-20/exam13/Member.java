package exam13;

public class Member {
	private int id;
	private String name;
	private boolean test;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isTest() {
		return test;
	}
	public void setTest(boolean test) {
		this.test = test;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ","
				+ " test=" + test + "]";
	}
	
	
	
	
	
}
