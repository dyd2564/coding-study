package exam04;

public class MainAAA {
	public static void main(String[] args) {
		System.out.println(AAA.CCC.ccc2);
		System.out.println(AAA.CCC.CONT_CC);
		
		AAA.CCC.methodAA(); // ���� �޼ҵ� ȣ��
		AAA.CCC c = new AAA.CCC();
		c.methodA(); // �ν��Ͻ� �޼ҵ� ȣ��
		c.methodAA(); // ���� �޼ҵ� ȣ��
	}
}
