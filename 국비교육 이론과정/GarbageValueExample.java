package primitive;

public class GarbageValueExample {
	public static void main(String[] args) {
		byte var1 = 127;
		var1++;
		System.out.println(var1); // ������ ��
		
		int value = 10;
		value++;
		++value;
		System.out.println(value);
		
		value--;
		--value;
		System.out.println(value);
	}
}
