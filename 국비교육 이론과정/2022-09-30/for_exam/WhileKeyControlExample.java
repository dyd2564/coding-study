package for_exam;

import java.io.IOException;
import java.util.*;;

public class WhileKeyControlExample {
	public static void main(String[] args) throws IOException {
		// 키보드로 while문 제어
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			// 윈도우 운영체제의 경우 Enter키를 입력하면 13,10번이 입력된다.
			if (keyCode != 13 && keyCode != 10) { // 13 캐리지리턴, 10 라인피드
				System.out.println("=========================");
				System.out.println("1. 증속 | 2. 감속 | 3. 중지 ");
				System.out.println("=========================");
				System.out.print("선택 : ");
			}
			
			keyCode = System.in.read(); // 입력 대기 throws IOException 사용
			
			if (keyCode == 49) {
				speed++;
				System.out.println("현재 속도 : " + speed);
			} else if (keyCode == 50) {
				speed--;
				System.out.println("현재 속도 : " + speed);
			} else if (keyCode == 51) {
				run = false; // 탈출하려면 위에서 정의된 run을 false로 바꾼다.
			}
		}System.out.println("프로그램을 종료합니다.");
	}
}
