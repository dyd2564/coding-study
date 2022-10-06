package section2.exam03;

public class Calculator {
	
	int plus(int x, int y) {
		return x + y;
	}
	
	double avg(int x, int y) {
		return plus(x,y) / 2.0;
	}
	
	void println(String message) {
		System.out.println("평균을 계산합니다.");
		System.out.println(message);
	}
	 
	void executeAvg(int x, int y) {
		println("실행결과  : " + avg(x, y));
		System.out.println("실행 종료");
	}
}
