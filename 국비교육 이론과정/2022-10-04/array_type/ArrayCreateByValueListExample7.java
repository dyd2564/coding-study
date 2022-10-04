package array_type;

import java.util.*;

public class ArrayCreateByValueListExample7 {
	public static void main(String[] args) {
		int[] intArr = new int[4];
		
		// 배열 생성 후 각각의 요소에 접근하여 값을 할당할 수 있다.
		intArr[0] = 10;
		intArr[1] = 5;
		intArr[2] = 9;
		intArr[3] = 11;
		System.out.println(Arrays.toString(intArr));
		
		// 배열의 인덱스 범위를 넘는 값에 접근하면 예외가 발생한다.
//		intArr[4] = 100; // ArrayIndexOutOfBoundsException
	}
}
