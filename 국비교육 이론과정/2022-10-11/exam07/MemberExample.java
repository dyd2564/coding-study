package exam07;

public class MemberExample {
	public static void main(String[] args) {
		Member member = new Member();
		member.setId(1);
		member.setUserName("ȫ�浿");
		member.setPassword("1234");
		member.setEmail("hong@example.com");
		System.out.println(member);
		System.out.println(member.toString());
	}
}
