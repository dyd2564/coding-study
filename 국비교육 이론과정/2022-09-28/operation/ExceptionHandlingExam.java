package operation;

public class ExceptionHandlingExam {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
		
		try { // try ~ catch ���� ����Ͽ� ����ó��
			int result = num1/num2; // ���ܹ߻� ���ɼ� ����
			System.out.println("result :" + result);
		} catch (ArithmeticException e) {
			// ArithmeticException���ܰ� �߻��ϸ� �� ��� ����
			System.out.println("0���� ���� �� �����ϴ�.");
			System.out.println(e.getMessage());
		}
		
	}
}
