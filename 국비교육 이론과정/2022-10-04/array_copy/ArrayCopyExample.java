package array_copy;

import java.util.Arrays;

public class ArrayCopyExample {
	public static void main(String[] args) {
		
		// 한 번 생성된 배열은 크기가 고정된다.
		int[] score = {70, 75, 90, 91};
//		score[4] = 100; // ArrayIndexOutOfBoundsException 예외발생
		
		// 배열을 추가하려면 전체를 재할당해야함.
		int[] newScore = new int[6];
		for (int i = 0; i < score.length; i++) {
			newScore[i] = score[i];
		}
		System.out.println(Arrays.toString(newScore)); // [70, 75, 90, 91, 0, 0]
		newScore[4] = 100;
		newScore[5] = 95;
		System.out.println(Arrays.toString(newScore)); // [70, 5, 90, 91, 100, 95]
	}
}
