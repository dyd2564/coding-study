package for_exam;

public class GugudanExample {
	public static void main(String[] args) {
		// 1부터 9까지의 구구단 출력
		for (int j = 2; j < 10; j++) {
			System.out.println(j + "의 구구단");
			for (int i = 1; i < 10; i++) {
				System.out.println(j + " * " + i  + " = " + j*i );
			}
			System.out.println("===============================");
		}
	}
		
}
