package operation;

public class RemainderOperationExam {
	public static void main(String[] args) {
		// ������ ������ %
		
		// ���� �ǿ����� 0���� �����ϴ� ���
//		System.out.println(10 % 0); // ���� �߻�
		
		char ch1 = '��'; // 44032
		char ch2 = 'A'; // 65
		int result = ch1 % ch2; // ��� ����� int�̹Ƿ� result�� int�� ����
		System.out.println(result);
		
		// �ǿ����ڰ� ������ ���
		int num1 = -10;
		int num2 = -3;
		System.out.println(num1 % num2); // -1
		// -10 % |-3|
		// -10 % 3
		// -1
		
		int num3 = 10;
		int num4 = -3;
		System.out.println(num3 % num4); // 1
		// 10 % |3|
		// 10 % 3
		// 1
	}
}
