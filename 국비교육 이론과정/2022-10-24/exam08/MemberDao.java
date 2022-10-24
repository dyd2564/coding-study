package exam08;

public class MemberDao {
	
	private Member[] members;
	
	public MemberDao() {
		members = new Member[] {
			new Member("ȫ�浿", 10),
			new Member("�ſ��", 12),
			new Member("���ü�", 14),
			new Member("��⼱", 16)
		};
	}
	
	// ȸ�� ��� �޼ҵ�
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
