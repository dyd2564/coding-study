package section2.exam02;

public class Calculator {
	
	int sumAll(int[] values) {
		int sum = 0;
		for (int v : values) {
			sum += v;
		}
		return sum;
	}
	
	// 1, 2, 3, 4
	// new int[] {1, 2, 3, 4}
	int addAll(int ... values) {
		int sum = 0;
		for (int v : values) {
			sum += v;
		}
		return sum;
	}
}
