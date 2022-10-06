package section.exam05;

import java.util.*;

public class CalculatorDemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Calculator cal = new Calculator();
		int result1 = cal.addParamInt(10, 20);
		int result2 = cal.addParamString("10", "20");
		int result3 = cal.addParamBoth1(10, "20");
		int result4 = cal.addParamBoth2("10", 20);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);

		int a = sc.nextInt();
		int b = sc.nextInt();
		String c = sc.next();
		String d = sc.next();
		
		int result5 = cal.addParamInt(a, b);
		int result6 = cal.addParamString(c, d);
		int result7 = cal.addParamBoth1(a, d);
		int result8 = cal.addParamBoth2(c, b);

		
		System.out.println(result5);
		System.out.println(result6);
		System.out.println(result7);
		System.out.println(result8);
		
		
	}
}
