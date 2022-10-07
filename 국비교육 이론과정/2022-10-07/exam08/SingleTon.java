package section2.exam08;

public class SingleTon {
	
	private static SingleTon singleTon = new SingleTon();
	
	private SingleTon() {
		// 외부에서 객체를 생성하지 못하도록 한다.
	}
		
	// 이 정적 메소드를 통하여 생성된 객체를 얻는다.
	public static SingleTon getInstance() {
		return singleTon;
	}
	
}