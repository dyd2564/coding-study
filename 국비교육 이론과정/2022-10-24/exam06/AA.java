package exam06;

public class AA {
	public AA a = new AA();
	public static AA aa = new AA();
	BB b = new BB();
//	static BB bb = new BB(); // static ���� �Ұ�
	
	CC c = new CC();
	static CC cc = new CC();
	
	class BB {
		public BB() {
			System.out.println("�ν��Ͻ� Ŭ���� : BB ��ü ����");
		}
	}
	
	static class CC {
		public CC() {
			System.out.println("�ν��Ͻ� Ŭ���� : CC ��ü ����");
		}
	}
	
	void methodA() {
		BB b = new BB(); // �ν��Ͻ� Ŭ���� ��ü ����
		CC c = new CC(); // ���� Ŭ���� ��ü ����
	}
	static void methodAA() {
//		BB b = new BB(); // �ν��Ͻ� ��� Ŭ���� ���� �Ұ�
		CC c = new CC(); // ����Ŭ���� ���� �Ұ�
	}
}
