package exam05;

public class AA {

	void methodA() {
		System.out.println("methodA ȣ��");
		int a = 10;
		class DD {
			int dd; // �ν��Ͻ� �ʵ�
//			static int dd2; // ���� �ʵ�(���� �Ұ���)
//			static {} // static ���(���� �Ұ���)
			public DD() {
				System.out.println("���� Ŭ���� DD ��ü ����");
			}
			void methodD() {
				System.out.println("���� Ŭ���� �ν��Ͻ� �޼ҵ� : methodD");
			}
		}
		DD dd = new DD(); // ���� Ŭ���� ��ü ���� : �ܺο��� ���� �Ұ���
		System.out.println(dd.dd);
		dd.methodD();
	}
	static void methodB() {
		System.out.println("methodB ȣ��");
		class DDD {
			int dd; // �ν��Ͻ� �ʵ�
//			static int dd2;
//			static {}
			public DDD() {
				
			}
		}
	}
}
