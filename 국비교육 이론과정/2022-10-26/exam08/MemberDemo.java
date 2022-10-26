package exam08;

public class MemberDemo {
	public static void main(String[] args) {
		Member member1 = new Member(1, "홍길동", "hong@example.com", true);
		Address addr = new Address("서울특별시", "성북구", "121215");
		member1.setAddress(addr);
		
		System.out.println(member1);
		System.out.println(member1.getAddress().getState());
		System.out.println(member1.getAddress().getCity());
		System.out.println(member1.getAddress().getZip());
	}
}
