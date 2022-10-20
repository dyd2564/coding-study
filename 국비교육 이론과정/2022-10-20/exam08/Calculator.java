package exam08;

public class Calculator {

	static int field = 10;
	
	static void methodAA() {
		System.out.println("스태틱 메소드");
	}
	
	private int plus(int x, int y) {
		return x+y;
	}
	
	private double avg(int x, int y) {
		return plus(x, y) / 2.0;
	}
	
	private void print(String message) {
		System.out.println("평균을 계산합니다.");
		System.out.println(message);
	}
	
	public void executeAvg(int x, int y) {
		print("실행결과 : " + avg(x,y));
	}
}
