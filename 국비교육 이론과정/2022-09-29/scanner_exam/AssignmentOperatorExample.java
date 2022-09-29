package scanner_exam;

public class AssignmentOperatorExample {
	public static void main(String[] args) {
		
		int result = 5;
		result += 10; // result = result + 10
		System.out.println("+= : " + result); // 15
		
		result = 10;
		result -= 3; // result = result - 3
		System.out.println("-= : " + result); // 7
		
		result = 5;
		result *= 10; // result = result * 10
		System.out.println("*= : " + result); // 50
		
		result = 10;
		result /= 2; // result = result / 2
		System.out.println("/= : " + result); // 5
		
		result = 12;
		result %= 5; // result = result % 5
		System.out.println("%= : " + result); // 2
	}
}
