package section2.exam09;

public class Person {
	// final �ʵ�
	// �� �� �ʱ�ȭ �Ǹ� ���� ������ �� ����.
	// �ʵ� ���� �� Ȥ�� �����ڿ��� �ݵ�� �ʱ�ȭ �Ǿ�� �Ѵ�.
	final String nation;
	final String ssn;
	String name;
	
	public Person() {
		nation = "���ѹα�";
		ssn = "12345689";
	}
	
	// final �ʵ� : �������� �Ű������� �ʱ�ȭ ����
	public Person(String nation, String ssn) {
		this.nation = nation;
		this.ssn = ssn;
	}
	
}
