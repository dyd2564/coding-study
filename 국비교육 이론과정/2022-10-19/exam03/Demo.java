package exam03;

public class Demo {

	int iValue;
	double dValue;
	boolean bool;
	String str;
	
	public static void main(String[] args) {
		// �ʱ�ȭ ���� ���� ���� ����
//		int v1;
//		double v2;
//		boolean v3;
//		System.out.println(v1);
		Demo d = new Demo();
		// �ʵ忡�� ���ǵ� �������� �ʱ�ȭ ���� �ʾư� �ʱ�ȭ ��.
		System.out.println(d.iValue); // 0
		System.out.println(d.bool); // false
		System.out.println(d.str); // null
		
		
	}
}
