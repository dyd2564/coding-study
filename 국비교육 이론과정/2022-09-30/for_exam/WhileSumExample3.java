package for_exam;

public class WhileSumExample3 {
	public static void main(String[] args) {
		// 1 ���� n������ �� : �����հ谡 100�� ���� ����.
		int i = 1;
		int sum = 0;
		
		while ((sum += i) <= 100) {
			System.out.println(i + " - " + "���� �հ� : " + sum);
			i++;
		}
	}
}
