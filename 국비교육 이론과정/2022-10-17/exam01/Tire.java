package exam01;

public class Tire {
	int maxRotation; // �ִ� ȸ����
	int accmulateRotation; // ���� ȸ����
	public String location;
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
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
