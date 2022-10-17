package exam01;

public class KumhoTire extends Tire {
	
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accmulateRotation;
		if (accmulateRotation <= maxRotation ) { // 최대 회전수를 넘지 않은 경우
			System.out.print(location);
			System.out.print("Tire 수명 : ");
			System.out.println((maxRotation - accmulateRotation) + "회");
			return true;
			
		} else { // 최대 회전수를 넘은 경우
			System.out.println(location);
			System.out.println("Tire 펑크");
			return false;
		}
	}
	
}
