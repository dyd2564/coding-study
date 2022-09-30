package for_exam;

public class ForPrintExample {
	public static void main(String[] args) {
		// for (초기화식; 조건식; 증감식)
		// 조건식이 true이면 중괄호 블럭 실행
		// 초기화식 - 반복구간[조건식 - 코드실행 - 증감식]
		int i = 0;
		for (i =0; i < 5; i++) {
			// 반복되는 코드
			System.out.println("Hello" + i);
		}
		System.out.println(i);
	}
	
}
