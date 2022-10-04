package arrayInArray;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayInArrayExample {
	public static void main(String[] args) {
		
		int[][] arr = new int[3][6];
		
		arr = new int[][] {
				{11, 22, 54, 35, 75, 90}, // mathScore[0]
				{21, 31, 42, 14, 16, 25}, // mathScore[1]
				{30, 12, 32, 33, 37, 39} // mathScore[2]
		};
		
		System.out.println(arr[1][3]);
		System.out.println(arr[2][5]);
		
		System.out.println(arr.length); // ���� ����
		System.out.println(arr[0].length); // 0���� �� ����
		System.out.println(arr[1].length); // 1���� �� ����
		System.out.println(arr[2].length); // 2���� �� ����
		
		System.out.println(Arrays.deepToString(arr)); // 2���� �迭�� ��� ���� ���
		System.out.println(Arrays.toString(arr)); // ������ ���
		System.out.println("======================���м�====================");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
				
			}System.out.println();
		}
	}
}
