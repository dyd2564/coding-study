package section.exam04;

public class Korean {
	
	static String id = "ABCD";
	
	String nation = "���ѹα�";
	String name;
	String ssn;
	
	// �������� ����Ű�� ���� this�� ����
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	void print() {
		System.out.println("���� : " + nation);
		System.out.println("�̸� : " + name);
		System.out.println("�ֹι�ȣ : " + ssn);
		System.out.println();
	}
}
