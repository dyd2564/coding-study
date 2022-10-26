package exam07;

public class Sample {
	public static void main(String[] args) throws CloneNotSupportedException {
		Member member1 = new Member(1, "홍길동", "hong@ex", true);
		Member member2 = member1;
		member2.setName("고길동");
		System.out.println(member1);
		
		Member member3 = member1.getCloneMember();
		member3.setName("둘리");
		System.out.println(member1);
	}
}
