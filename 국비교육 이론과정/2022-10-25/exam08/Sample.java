package exam08;

public class Sample {
	public static void main(String[] args) {
		System.out.print("�ε� �� : ");
		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(50);
				System.out.print(">");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
