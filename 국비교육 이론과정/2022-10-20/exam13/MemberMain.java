package exam13;

public class MemberMain {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.setId(1);
		m1.setName("ȫ�浿");
		m1.setTest(true);
		System.out.println(m1);
		
		System.out.println(m1.getId());
		System.out.println(m1.getName());
		System.out.println(m1.isTest());
	}
}
