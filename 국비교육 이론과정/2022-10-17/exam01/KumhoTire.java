package exam01;

public class KumhoTire extends Tire {
	
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accmulateRotation;
		if (accmulateRotation <= maxRotation ) { // �ִ� ȸ������ ���� ���� ���
			System.out.print(location);
			System.out.print("Tire ���� : ");
			System.out.println((maxRotation - accmulateRotation) + "ȸ");
			return true;
			
		} else { // �ִ� ȸ������ ���� ���
			System.out.println(location);
			System.out.println("Tire ��ũ");
			return false;
		}
	}
	
}
