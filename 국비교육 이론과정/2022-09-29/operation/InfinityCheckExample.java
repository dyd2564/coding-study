package operation;

public class InfinityCheckExample {
	public static void main(String[] args) {
		
		// �Ǽ� Ÿ�� 0.0 �Ǵ� 0.0f�� ������ ���
		int x = 5;
		int y = -10;
		double d = 0.0;
		System.out.println(x / d); // Infinity
		System.out.println(y / d); // -Infinity
		
		float f = 0.0f;
		System.out.println(x / f); // Infinity
		System.out.println(y / f); // -Infinity
		
		// ����Ŭ���� Wrapper
		System.out.println(Double.POSITIVE_INFINITY); // Infinity
		System.out.println(Double.NEGATIVE_INFINITY); // -Infinity
		System.out.println(Float.POSITIVE_INFINITY); // Infinity
		System.out.println(Float.NEGATIVE_INFINITY); // -Infinity
		
		boolean infinite = Double.isInfinite(x / d); // Infinity�̸� true ��ȯ
		System.out.println(infinite);
		
		boolean finite = Double.isFinite(x / d); // finite�̸� true ��ȯ
		System.out.println(finite);
		
		System.out.println("���� ����.");
	}
}
