package ref_type;

public class NullExample {
	public static void main(String[] args) {
		String var1 = "��浿";
		String var2 = "ȫ�浿";
		if (var1 != null) {
			System.out.println(var1);
			System.out.println(var1.equals(var2));
		}
		String str = null;
		int size = str.length(); // NullPointerException �߻�
		System.out.println(size);
		System.out.println("�ý��� ����");
	}
}
