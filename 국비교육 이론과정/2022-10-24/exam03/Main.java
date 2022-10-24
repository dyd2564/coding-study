package exam03;

public class Main {
	public static void main(String[] args) {
		Barracks b1 = new Barracks();
		b1.buildComplete(); // Building에 정의
		b1.lift(); // Liftable에 정의
		b1.repare(); // Reparable에 정의
		b1.generate(); // Generatable에 정의
		
		Building b2 = new Barracks();
		b2.buildComplete(); // Building에 정의
		b2.lift(); // Liftable에 정의
		b2.repare(); // Reparable에 정의
		b2.generate(); // Generatable에 정의
		
		Liftable b3 = new Barracks();
		((Barracks)b3).buildComplete(); // Building에 정의
		b3.lift(); // Liftable에 정의
		((Barracks)b3).repare(); // Reparable에 정의
		((Barracks)b3).generate(); // Generatable에 정의
		
	}
	
}
