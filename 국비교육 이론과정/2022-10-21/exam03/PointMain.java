package exam03;

public class PointMain {
	public static void main(String[] args) {
		
		Point p1 = new Point("10", "2");
		System.out.println(p1.getLoctaion());
		System.out.println(p1.좌표값의합());
	
		Point p2 = new Point3D("1", "4", "10");
		System.out.println(p2.getLoctaion());
		System.out.println(p2.좌표값의합());
	}
}
