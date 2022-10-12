package exam11;

public class Phone {
	// final이 붙은 클래스는 상속할 수 없다.
	
	public final void info() {
		System.out.println(".......");
	}
	
}

class SmartPhone extends Phone {
	
	@Override
	public void info() {
		System.out.println("오버라이딩");
	}
}

//class MyString extends String {
//	
//}