package continue_exam;

public class ContinueExample {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if(i%2 == 0) continue;
			// 홀수이면 아래 실행문을 실행하지 않고 다시 반복함.
			System.out.println("홀수 출력 : " + i);
			
		}
	}
}
