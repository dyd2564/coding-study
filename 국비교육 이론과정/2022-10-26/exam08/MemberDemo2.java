package exam08;

public class MemberDemo2 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Member member1 = new Member(1, "ȫ�浿", "hong@example.com", true);
		Address addr = new Address("����Ư����", "���ϱ�", "121215");
		member1.setAddress(addr);
		
		Member member2 = member1.getCloneMember();
		member2.setName("�Ѹ�"); //  member2 �̸� ����
		member2.setEmail("doli@Ex");
		member2.setId(100);
		member2.getAddress().setState("�뱸������"); // member2 ���� �̸� ����
		
		// ���簡 �Ǿ��ٸ� member1�� ���� �̸��� ����Ư���þ����.
		System.out.println(member1); // member1 ���� �̸� Ȯ��
	
	}
}
