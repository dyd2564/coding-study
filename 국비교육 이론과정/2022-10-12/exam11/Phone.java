package exam11;

public class Phone {
	// final�� ���� Ŭ������ ����� �� ����.
	
	public final void info() {
		System.out.println(".......");
	}
	
}

class SmartPhone extends Phone {
	
	@Override
	public void info() {
		System.out.println("�������̵�");
	}
}

//class MyString extends String {
//	
//}