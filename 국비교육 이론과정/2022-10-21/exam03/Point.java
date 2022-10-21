package exam03;

public class Point {
	
	String x;
	String y;
	
	public Point(String x, String y) {
		this.x = x;
		this.y = y;
	}

	public String getLoctaion() {
		return "(" + x + ", " + y + ")";
	}
	
	public int ÁÂÇ¥°ªÀÇÇÕ() throws NumberFormatException {
		int a = Integer.parseInt(x);
		int b = Integer.parseInt(y);
		return a+b;
	}
	
	
	
	
	
	
} 
