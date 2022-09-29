package if_exam;

public class MathRandomExample {
	public static void main(String[] args) {
		double random = Math.random();
		// 0 <= random < 1 실수값 출력
		System.out.println("0과 1사이 난수(0 포함) : " + random);
		
		// 1~10까지 정수 값
		int num = (int) (Math.random() * 10) + 1;
		System.out.println("1 ~ 10까지의 정수 값 : " + num);
		
		// 주사위 : 1~6까지 정수값
		int dice = (int) (Math.random() * 6) + 1;
		System.out.println("주사위 눈 : " + dice);
		
		// 로또 : 1~45까지 정수값
		int lotto = (int) (Math.random() * 45) + 1;
		System.out.println("로또 번호 : " + lotto);
	}
}
