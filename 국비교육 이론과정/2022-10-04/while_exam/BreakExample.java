package while_exam;

public class BreakExample {
	public static void main(String[] args) {
		
		while(true) {
			int num = (int) (Math.random()* 6) + 1;
			System.out.println("생성된 주사위 눈 : " + num);
			if(num == 6) 
				break; // 무한루프 탈출 조건
		}
		System.out.println("프로그램 종료");
	}
}

