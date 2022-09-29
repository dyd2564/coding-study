package scanner_exam;

import java.util.*;

public class CompareOperatorExample3 {
	public static void main(String[] args) {
		
		// string : 참조타입의 비교 -> 참조값(주소값)비교
		String str1 = "홍길동";
		String str2 = "홍길동";
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		// 원시타입의 비교 -> 실제 값을 비교함
		int x = 10;
		int y = 10;
		System.out.println(x == y);
	}
}
