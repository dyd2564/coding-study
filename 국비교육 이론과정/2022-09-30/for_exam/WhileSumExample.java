package for_exam;

public class WhileSumExample {
	public static void main(String[] args) {
		// while �ݺ����� ����Ͽ� 1 ���� 100 ������ �� ���ϱ�
		int i = 1;
		int sum = 0;
		
		while (i <= 100) {
			sum += i;
			i++;
			
		}
		System.out.println("1 ���� 100 ������ �� : " + sum);
	}
}
