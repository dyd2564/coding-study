package section2.exam08;

public class SingleTonExample {
	public static void main(String[] args) {
		// �̱����̶�?
		// �ϳ��� ���ø����̼� ������ �� �ϳ��� �����Ǵ� ��ü
		
		// �̱��� ��� ���
		// Ŭ���� ���� 1 = Ŭ����.getInstance();
		
		SingleTon obj1 = SingleTon.getInstance();
		SingleTon obj2 = SingleTon.getInstance();
		SingleTon obj3 = SingleTon.getInstance();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}
}
