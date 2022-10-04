package array_copy;

import java.util.Arrays;

public class ArrayCopyExample2 {
	public static void main(String[] args) {
		
		// ���� �迭
		String[] oldStrArr = {"java", "mysql", "jsp", "oracle", "spring"};
		String[] newStrArr = new String[5];
		
		// arraycopy
		// ���� �迭,
		// ���� �迭�� ���� ������
		// ���ο� �迭
		// ���ο� �迭�� ���� ������
		// ���ο� �迭�� ���� ������
		System.arraycopy(oldStrArr, 1, newStrArr, 2, 3);
		System.out.println(Arrays.toString(newStrArr));
		
		System.arraycopy(oldStrArr, 0, newStrArr, 0, oldStrArr.length);
		System.out.println(Arrays.toString(newStrArr));
		
		String[] newStrArr2 = new String[6];
		// [null, null, mysql, jsp, oracle, null] ��ǥ
		System.arraycopy(oldStrArr, 1, newStrArr2, 2, 3);
		System.out.println(Arrays.toString(newStrArr2));
		
		// ����� �迭�� ���� �迭�� ������ ��ü�� �����Ѵ�.
		System.out.println(oldStrArr[1] == newStrArr2[2]); // true
		System.out.println(oldStrArr[2] == newStrArr2[3]); // true
		System.out.println(oldStrArr[3] == newStrArr2[4]); // true
	}
}