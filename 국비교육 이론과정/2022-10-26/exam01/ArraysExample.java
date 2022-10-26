package exam01;

import java.util.Arrays;

public class ArraysExample {
	public static void main(String[] args) {
		String[] arr = {"b", "a", "f", "d"};
		String[] strArr = {"b", "a", "f", "d"};
		String[][] arr2 = {
				{"1", "2", "3"},
				{"4", "7"}
		};
		
		String[][] arr3 = {
				{"1", "2", "3"},
				{"4", "7"}
		};
		
		System.out.println(arr); // 참조값
		System.out.println(Arrays.toString(arr)); // 배열의 내용
		
		System.out.println(arr2); // 전체 참조값
		System.out.println(Arrays.toString(arr2)); // 각각의 참조값
		System.out.println(Arrays.deepToString(arr2)); // 2차원 배열의 내용
		
		System.out.println(arr==strArr); // false
		System.out.println(arr.equals(strArr)); // false
		System.out.println(Arrays.equals(strArr, arr)); // true
		
		System.out.println(Arrays.deepEquals(arr2, arr3)); // true
		
	}
}
