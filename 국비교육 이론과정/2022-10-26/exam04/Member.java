package exam04;

public class Member {
	
	private int id;
	private String name;
	private String email;
	private String password;
	
	public Member(int id, String name, String email, String password) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			boolean[] test = {
				this.id == member.getId(),
				this.name.equals(member.getName()),
				this.email.equals(member.getEmail()),
				this.password.equals(member.getPassword())
			};
			boolean result = true;
			for (boolean b : test) {
				result &= b;
			}
			return result;
		}
		return false;
	}
}
