package for_exam;

public class WhileSumExample {
	public static void main(String[] args) {
		// while 반복문을 사용하여 1 부터 100 까지의 합 구하기
		int i = 1;
		int sum = 0;
		
		while (i <= 100) {
			sum += i;
			i++;
			
		}
		System.out.println("1 부터 100 까지의 합 : " + sum);
	}
}
