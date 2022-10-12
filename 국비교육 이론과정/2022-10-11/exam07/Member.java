package exam07;

public class Member {
	private int id;
	private String userName;
	private String password;
	private String email;
	
	public Member() {}
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Member [id = " + id + ", userName = " + userName + ", "
				+ "password = " + password + ", email = " + email + "]";
	}
	
	
}
