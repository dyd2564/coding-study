package array_type;

import java.util.*;

public class ArrayCreateByValueListExample7 {
	public static void main(String[] args) {
		int[] intArr = new int[4];
		
		// �迭 ���� �� ������ ��ҿ� �����Ͽ� ���� �Ҵ��� �� �ִ�.
		intArr[0] = 10;
		intArr[1] = 5;
		intArr[2] = 9;
		intArr[3] = 11;
		System.out.println(Arrays.toString(intArr));
		
		// �迭�� �ε��� ������ �Ѵ� ���� �����ϸ� ���ܰ� �߻��Ѵ�.
//		intArr[4] = 100; // ArrayIndexOutOfBoundsException
	}
}
