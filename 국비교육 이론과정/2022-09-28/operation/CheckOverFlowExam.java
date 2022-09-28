package operation;

public class CheckOverFlowExam {
	public static void main(String[] args) {
		// ���� �������� �����÷ο� �߻� ���ɼ�
		// �� ������ ��ȣ�� ���� ���� �߻�
	
		try {
			int result = safeAdd(-2100000000, -2100000000); // ���� �߻� ���ɼ� ����/
			System.out.println(result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static int safeAdd(int left, int right) {
		boolean allPositive = left > 0 && right > 0; // ��� ����� ���
		boolean allNegative = left < 0 && right < 0; // ��� ������ ���
		
		// ������ true�̸� �����÷ο� �߻���.
		// �� left, right ���� ���� int Ÿ���� �ִ� ���� ū ���
		boolean maxBounded = allPositive && left > Integer.MAX_VALUE -right;
		// �� left, right ���� ���� int Ÿ���� �ִ� ���� ���� ���
		boolean minBounded = allNegative && right < Integer.MIN_VALUE -left;
		
		if (maxBounded || minBounded) { // �� ���� �� ��� �ϳ��� ���̸� ���ܸ� �߻���Ų��.
			// ���� ����
			throw new ArithmeticException("�����÷ο� �߻�. ��� �Ұ�����."); // ���ܹ߻�
		} // ���� if������ �� �� false�� �ؿ� ���� ����
		return left + right;
	}
}
