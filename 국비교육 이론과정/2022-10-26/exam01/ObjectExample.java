package exam01;

public class ObjectExample {
	public static void main(String[] args) {
		Object aa = new Object();
		Object bb = aa;
		Object cc = new Object();
		System.out.println(aa == bb); // �񱳿�����
		System.out.println(aa.equals(bb)); // equals �޼ҵ�
		System.out.println(aa.equals(cc));
		System.out.println(aa == cc);
		
		String str1 = "abc";
		String str2 = "abc";
		// str1 str2 ������ ������ �ٸ�
		// str1 str2�� �������� ���� -> ���� ����
		System.out.println(str1.equals(str2));
		
	}
}
