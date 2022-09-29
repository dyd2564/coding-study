package operation;

public class InfinityAndNaNCheck {
	public static void main(String[] args) {
		
		double infinity1 = 5 / 0.0;
		double nan1 = 5 % 0.0;
		
		// isInfinite() : ���޵� �Ű������� Infinity�̸� true ��ȯ
		// isFinite() : ���޵� �Ű������� Finity�̸� true ��ȯ
		// isNaN() : ���޵� �Ű������� NaN�̸� true ��ȯ
		
		System.out.println(Double.isInfinite(infinity1)); // true
		System.out.println(Double.isFinite(infinity1)); // false
		System.out.println(Double.isNaN(nan1)); // true
		
		float infinity2 = 5 / 0.0f;
		float nan2 = 5 % 0.0f;
		
		System.out.println(Float.isInfinite(infinity2)); // true
		System.out.println(Float.isFinite(infinity2)); // false
		System.out.println(Float.isNaN(nan2)); // true
	}
}
