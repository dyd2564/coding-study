package exam01;

public class Sample01 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3}; // ������ �ε��� ��ȣ 2
//		System.out.println(arr[3]); // ���࿹��(RunTimeException)
		
		// �Ϲ� ���� : ������ �� �ݵ�� ����ó�� �ڵ带 �ۼ��ؾ���
		try {
			test01();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// �޼ҵ� ������ ���ܸ� ����
	// �޼ҵ� �� : �� �޼ҵ带 ȣ���� �޼ҵ�
	public static void test01() throws ClassNotFoundException {
			test02();
	}
	
	public static void test02() throws ClassNotFoundException{
		Class.forName("");
		
	}
}
