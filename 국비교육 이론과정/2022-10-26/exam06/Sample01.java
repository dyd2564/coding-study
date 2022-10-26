package exam06;

import java.util.Arrays;

public class Sample01 {
	public static void main(String[] args) {
		// 얕은 복제
		int[] arr = {1, 2, 3, 4, 5};
		int[] copyArr = arr;
//		System.out.println(Arrays.toString(copyArr));
		arr[0] = 100;
		// copyArr의 0번째 인덱스 값도 변경됨.(얕은 복제 특징)
		System.out.println(Arrays.toString(copyArr));
		System.out.println("==========================");
		
		// 깊은 복제
		String[] strArr = {"a", "b", "c"};
		String[] copyStrArr = new String[strArr.length];
		for (int i = 0; i < copyStrArr.length; i++) {
			copyStrArr[i] = strArr[i];
		}
		System.out.println(Arrays.toString(copyStrArr));
		strArr[0] = "가";
		// 수정 후
		// copyStrArr의 0번째 인덱스 값은 변경되지 않음.(깊은 복제 특징)
		System.out.println(Arrays.toString(copyStrArr));
		
		
		
	}
}
