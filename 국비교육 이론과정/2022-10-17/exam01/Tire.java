package exam01;

public class Tire {
	int maxRotation; // 최대 회전수
	int accmulateRotation; // 누적 회전수
	public String location;
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
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
