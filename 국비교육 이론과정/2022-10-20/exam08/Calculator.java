package exam08;

public class Calculator {

	static int field = 10;
	
	static void methodAA() {
		System.out.println("����ƽ �޼ҵ�");
	}
	
	private int plus(int x, int y) {
		return x+y;
	}
	
	private double avg(int x, int y) {
		return plus(x, y) / 2.0;
	}
	
	private void print(String message) {
		System.out.println("����� ����մϴ�.");
		System.out.println(message);
	}
	
	public void executeAvg(int x, int y) {
		print("������ : " + avg(x,y));
	}
}
