package if_exam;

public class IfDiceExample {
	public static void main(String[] args) {
		
		int num = (int) (Math.random() * 6) + 1;
		
		if (num == 1) {
			System.out.println(num);
			System.out.println("주사위를 굴려 1의 눈이 나왔습니다.");
		}
		else if (num == 2) {
			System.out.println(num);
			System.out.println("주사위를 굴려 2의 눈이 나왔습니다.");
		}
		else if (num == 3) {
			System.out.println(num);
			System.out.println("주사위를 굴려 3의 눈이 나왔습니다.");
		}
		else if (num == 4) {
			System.out.println(num);
			System.out.println("주사위를 굴려 4의 눈이 나왔습니다.");
		}
		else if (num == 5) {
			System.out.println(num);
			System.out.println("주사위를 굴려 5의 눈이 나왔습니다.");
		}
		else {
			System.out.println(num);
			System.out.println("주사위를 굴려 6의 눈이 나왔습니다.");
		}
		
	}
}
