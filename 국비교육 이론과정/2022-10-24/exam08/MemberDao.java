package exam08;

public class MemberDao {
	
	private Member[] members;
	
	public MemberDao() {
		members = new Member[] {
			new Member("홍길동", 10),
			new Member("신용권", 12),
			new Member("남궁성", 14),
			new Member("백기선", 16)
		};
	}
	
	// 회원 목록 메소드
	public Member[] selectAll() {
		return members;
	}
}

class Member {
	private String name;
	private int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}

	

	
	
	
	
}
