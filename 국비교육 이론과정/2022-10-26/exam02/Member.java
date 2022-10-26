package exam02;

public class Member {
	
	private int id;
	private String name;
	
	public Member(int id, String name) {
		this.id = id;
		this.name = name;
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
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			boolean isEqualsId = this.id == member.getId();
			boolean isEqualsName = this.name.equals(member.getName());
			return isEqualsId && isEqualsName;
		}
			
		return false;
	}
	
	
}
