package section2.exam08;

public class SingleTon {
	
	private static SingleTon singleTon = new SingleTon();
	
	private SingleTon() {
		// �ܺο��� ��ü�� �������� ���ϵ��� �Ѵ�.
	}
		
	// �� ���� �޼ҵ带 ���Ͽ� ������ ��ü�� ��´�.
	public static SingleTon getInstance() {
		return singleTon;
	}
	
}