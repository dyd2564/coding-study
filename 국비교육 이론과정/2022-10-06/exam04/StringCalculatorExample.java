package section2.exam04;

public class StringCalculatorExample {
	public static void main(String[] args) {
		StringCalculator cal = new StringCalculator();
		
		int result1 = cal.add(10, 2);
		System.out.println(result1);
		
		// �ùٸ� ���� �Է����� ���
		int result2 = cal.add("10", "2");
		System.out.println(result2);
		
		// ���ڷ� ��Ȱ�� �� ���� ���ڿ��� �Է��� ���
		int result3 = cal.add("abcd", "2"); // NumberFormatException ���� �߻�
		// StringCalcultaor.java ���� try ~ catch���� �̿��Ͽ� ó��
		System.out.println(result3);
	}
}
