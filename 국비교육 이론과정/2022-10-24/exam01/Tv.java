package exam01;

public class Tv implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("TV 켬");
	}

	@Override
	public void turnOff() {
		System.out.println("TV 끔");
	}

	@Override
	public void defaultTest01() {
		System.out.println("디폴트메소드 오버라이딩");
	}
	
	
}
