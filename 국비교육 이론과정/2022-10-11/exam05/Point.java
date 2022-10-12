package exam05;

public class Point {
	int x;
	int y;
	
	public Point() {}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// (10, 12)
	public String getLocation() {
		return "(" + this.x + ", " + this.y + ")";
	}
}
