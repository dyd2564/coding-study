package exam05;

public class Point3D extends Point {
	
	int z;
	
	public Point3D (int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	// �������̵� �ֳ����̼� : ���� �޼ҵ�� �������̵� ������ �����Ϸ����� ǥ��
	@Override
	public String getLocation() {
		return "(" + this.x + ", " + this.y + ", " + this.z + ")";
	}
}
