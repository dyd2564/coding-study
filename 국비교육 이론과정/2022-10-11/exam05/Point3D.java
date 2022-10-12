package exam05;

public class Point3D extends Point {
	
	int z;
	
	public Point3D (int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	// 오버라이드 애노테이션 : 다음 메소드는 오버라이딩 했음을 컴파일러에게 표시
	@Override
	public String getLocation() {
		return "(" + this.x + ", " + this.y + ", " + this.z + ")";
	}
}
