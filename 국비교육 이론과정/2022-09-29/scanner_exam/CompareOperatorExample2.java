package scanner_exam;

import java.util.*;

public class CompareOperatorExample2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char ch1 = 'A'; // 65
		char ch2 = 'B'; // 66
		
		System.out.println(ch1 > ch2);  // false
		System.out.println(ch1 < ch2);  // true
		System.out.println(ch1 == ch2); // false
		
		int val1 = 3;
		float val2 = 3.0f;
		System.out.println(val1 == val2);
		
		System.out.println(3.14 == 3.14f); // false
	}
}
