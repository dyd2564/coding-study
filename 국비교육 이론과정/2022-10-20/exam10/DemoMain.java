package exam10;

public class DemoMain {
	public static void main(String[] args) {
		// ȸ������
		// MemberService
		// 1000���� ȸ������
		// 1��� new MemberService()�� ���� 
		
		SingleTon s1 = SingleTon.getInstance();
		SingleTon s2 = SingleTon.getInstance();
		SingleTon s3 = SingleTon.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
