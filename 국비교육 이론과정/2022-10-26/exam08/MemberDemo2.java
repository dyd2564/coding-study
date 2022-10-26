package exam08;

public class MemberDemo2 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Member member1 = new Member(1, "홍길동", "hong@example.com", true);
		Address addr = new Address("서울특별시", "성북구", "121215");
		member1.setAddress(addr);
		
		Member member2 = member1.getCloneMember();
		member2.setName("둘리"); //  member2 이름 수정
		member2.setEmail("doli@Ex");
		member2.setId(100);
		member2.getAddress().setState("대구광역시"); // member2 도시 이름 수정
		
		// 복사가 되었다면 member1의 도시 이름은 서울특별시어야함.
		System.out.println(member1); // member1 도시 이름 확인
	
	}
}
