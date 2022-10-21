package exam03;

public class Point3D extends Point {

	String z;
	
	public Point3D(String x, String y, String z) {
		super(x, y);
		this.z = z;
	}

	@Override
	public String getLoctaion() {
		return "(" + x + ", " + y + ", " + z + ")";
	}

	@Override
	public int 좌표값의합() throws NumberFormatException {
		return super.좌표값의합() + Integer.parseInt(z);
	}
	
	
	
}
