package if_exam;

public class SwitchExample {
	public static void main(String[] args) {
		
		int num = (int) (Math.random() * 6) + 1;
		switch (num) {
			case 1:
				System.out.println(num);
				System.out.println("1의 눈이 나왔습니다.");
				break; // case문 탈출 (break문이 없을 시 밑에 case문들 다 실행됨.
			case 2:
				System.out.println(num);
				System.out.println("2의 눈이 나왔습니다.");
				break; // case문 탈출
			case 3:
				System.out.println(num);
				System.out.println("3의 눈이 나왔습니다.");
				break; // case문 탈출
			case 4:
				System.out.println(num);
				System.out.println("4의 눈이 나왔습니다.");
				break; // case문 탈출
			case 5:
				System.out.println(num);
				System.out.println("5의 눈이 나왔습니다.");
				break; // case문 탈출
			default:
				System.out.println(num);
				System.out.println("6의 눈이 나왔습니다.");
				break; // case문 탈출
		}
	}
}
