package exam05;

public class PointDemo {
	public static void main(String[] args) {
		Point p1 = new Point(10, 12);
		System.out.println(p1.getLocation());
		
		Point3D p2 = new Point3D(11, 15, 16);
		System.out.println(p2.getLocation());
		
//		int x = 10;
//		int y = 15;
//		System.out.println("(" + x + ", " + y + ")");
//		System.out.printf("(%s, %s)\n", x, y);
//		System.out.printf("%d\n", x + y);
//		System.out.printf("%o", x);
	}
}
