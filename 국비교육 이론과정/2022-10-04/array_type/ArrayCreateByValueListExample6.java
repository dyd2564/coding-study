package array_type;

import java.util.*;

public class ArrayCreateByValueListExample6 {
	public static void main(String[] args) {
		int[] myArr = {10, 20, 30, 40};
		int addAll = addAll(myArr);
		System.out.println(addAll);
		
		int result = addAll(new int[] {10, 20, 30});
		System.out.println(result);
		
		int[] intArr = new int[5];
		float[] floatArr = new float[3];
		boolean[] boolArr = new boolean[3];
		System.out.println(Arrays.toString(intArr));
		System.out.println(Arrays.toString(floatArr));
		System.out.println(Arrays.toString(boolArr));
	}
	
	public static int addAll(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
