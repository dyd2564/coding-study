package array_copy;

import java.util.Arrays;

public class ArrayCopyExample2 {
	public static void main(String[] args) {
		
		// 원본 배열
		String[] oldStrArr = {"java", "mysql", "jsp", "oracle", "spring"};
		String[] newStrArr = new String[5];
		
		// arraycopy
		// 기존 배열,
		// 기존 배열의 복사 시작점
		// 새로운 배열
		// 새로운 배열의 복사 시작점
		// 새로운 배열의 복사 종료점
		System.arraycopy(oldStrArr, 1, newStrArr, 2, 3);
		System.out.println(Arrays.toString(newStrArr));
		
		System.arraycopy(oldStrArr, 0, newStrArr, 0, oldStrArr.length);
		System.out.println(Arrays.toString(newStrArr));
		
		String[] newStrArr2 = new String[6];
		// [null, null, mysql, jsp, oracle, null] 목표
		System.arraycopy(oldStrArr, 1, newStrArr2, 2, 3);
		System.out.println(Arrays.toString(newStrArr2));
		
		// 복사된 배열은 기존 배열과 동일한 객체를 참조한다.
		System.out.println(oldStrArr[1] == newStrArr2[2]); // true
		System.out.println(oldStrArr[2] == newStrArr2[3]); // true
		System.out.println(oldStrArr[3] == newStrArr2[4]); // true
	}
}