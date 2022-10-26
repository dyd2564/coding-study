package exam08;

public class Member implements Cloneable {

	private int id;
	private String name;
	private String email;
	private boolean adult;
	private Address address;

	
	
	public Member(int id, String name, String email, boolean adult) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.adult = adult;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isAdult() {
		return adult;
	}
	public void setAdult(boolean adult) {
		this.adult = adult;
	}
	
	
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", "
				+ "email=" + email + ", adult=" + adult + ", address="
				+ address + "]";
	}
	public Member getCloneMember() throws CloneNotSupportedException {
		Member cloned = null;
		cloned = (Member) clone();
		cloned.setAddress(
				new Address(address.getState(),
						address.getCity(),
						address.getZip()
					));
		return cloned;
	}
	
}
