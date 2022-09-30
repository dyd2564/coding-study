package for_exam;

import java.io.IOException;
import java.util.*;;

public class WhileKeyControlExample {
	public static void main(String[] args) throws IOException {
		// Ű����� while�� ����
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			// ������ �ü���� ��� EnterŰ�� �Է��ϸ� 13,10���� �Էµȴ�.
			if (keyCode != 13 && keyCode != 10) { // 13 ĳ��������, 10 �����ǵ�
				System.out.println("=========================");
				System.out.println("1. ���� | 2. ���� | 3. ���� ");
				System.out.println("=========================");
				System.out.print("���� : ");
			}
			
			keyCode = System.in.read(); // �Է� ��� throws IOException ���
			
			if (keyCode == 49) {
				speed++;
				System.out.println("���� �ӵ� : " + speed);
			} else if (keyCode == 50) {
				speed--;
				System.out.println("���� �ӵ� : " + speed);
			} else if (keyCode == 51) {
				run = false; // Ż���Ϸ��� ������ ���ǵ� run�� false�� �ٲ۴�.
			}
		}System.out.println("���α׷��� �����մϴ�.");
	}
}
