package continue_exam;

public class ContinueExample {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if(i%2 == 0) continue;
			// Ȧ���̸� �Ʒ� ���๮�� �������� �ʰ� �ٽ� �ݺ���.
			System.out.println("Ȧ�� ��� : " + i);
			
		}
	}
}
