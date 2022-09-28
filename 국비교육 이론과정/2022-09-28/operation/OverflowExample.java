package operation;

public class OverflowExample {
	public static void main(String[] args) {
		
		int x1 = 1000000;
		int y1 = 1000000; 
		int z1 = x1 * y1; // 10^12
		System.out.println(z1);
		
		int x2 = 1000000;
		int y2 = 1000000; 
		long z2 = x2 * y2; // 10^12
		// int * int
		// int(쓰레기값)
		// long = int (할당)
		// long
		System.out.println(z2);
		
		int x3 = 1000000;
		int y3 = 1000000; 
		long z3 = x3 * (long)y3; // 10^12
		// int * (long)int
		// int * long
		// long * long
		// long
		System.out.println(z3);
	}
}
