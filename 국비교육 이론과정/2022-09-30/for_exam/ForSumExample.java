package for_exam;

public class ForSumExample {
	public static void main(String[] args) {
		
		// 1 부터 100까지의 합 구하기
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1 부터 100까지의 합은 : " + sum);
	}
}
