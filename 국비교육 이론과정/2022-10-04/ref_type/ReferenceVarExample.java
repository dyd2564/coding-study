package ref_type;

public class ReferenceVarExample {
	public static void main(String[] args) {
		// ����Ÿ�� ���� �񱳿���
		String var1 = "ȫ�浿"; // ���ͷ� ���
		String var2 = "ȫ�浿"; // ���ͷ� ���
		String var3 = new String("ȫ�浿");
		String var4 = new String("ȫ�浿");
		
		System.out.println(var1 == var2); // true
		System.out.println(var3 == var4); // false
		System.out.println(var1 == var3); // false
		System.out.println(var2 == var4); // false
		
		System.out.println(var1.equals(var4)); // true
		System.out.println(var3.equals(var4)); // true
	}
}
