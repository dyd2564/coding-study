package for_exam;

public class WhileSumExample3 {
	public static void main(String[] args) {
		// 1 부터 n까지의 합 : 누적합계가 100을 넘지 않음.
		int i = 1;
		int sum = 0;
		
		while ((sum += i) <= 100) {
			System.out.println(i + " - " + "누적 합계 : " + sum);
			i++;
		}
	}
}
