package exam03;

public class AAA {
	// ���� : �ν��Ͻ� �ʵ�, �ν��Ͻ� �޼ҵ�, ���
	// �Ұ��� : ���� �ʵ�, ����ƽ ���, ���� �޼ҵ�
	
	// ��� Ŭ����
	class BBB {
		public int bb1; // �ν��Ͻ� �ʵ�
//		static int bb2 = 10; // �����ʵ�(���� �Ұ���)
		static final int BB3 = 10; // ���(���� ����)
//		static {} // ����ƽ ���(���� �Ұ���)
		
		public BBB() { // ������
			System.out.println("��øŬ���� BBB�� ������");
		}
		
		public void methodBB() { // �ν��Ͻ� �޼ҵ�
			System.out.println("��øŬ���� �޼ҵ�");
		}
		
//		public static void methodCC() {} // ���� �޼ҵ�(���� �Ұ���)
	}
}
