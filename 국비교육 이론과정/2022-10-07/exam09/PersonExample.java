package section2.exam09;

public final class PersonExample {
	public static void main(String[] args) {
		// final�� ������ �� : �ʵ�(���Ҵ� �Ұ���), Ŭ����(��� �Ұ���)
		
		Person p = new Person();
		p.name = "ȫ�浿";
		
		// final �ʵ� ���Ҵ� �Ұ���
//		p.nation = "�̱�";
//		p.ssn = "���þ�";
		
		Person p2 = new Person("���þ�", "0000");
		p2.name = "Ǫƾ";
//		p2.nation = "����";
//		p2.ssn = "121212121";
	}
}
