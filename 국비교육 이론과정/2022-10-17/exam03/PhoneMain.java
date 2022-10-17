package exam03;

public class PhoneMain {
	public static void main(String[] args) {
		// 하위타입 객체로 생성되고
		// 상위타입 참조변수에 할당 되면서 상위타입으로
		// 자동 타입 변환 되었다.
		
		Phone phone = new Phone(); // 스마트폰의 상위타입
//		SmartPhone sm = (SmartPhone) phone;
		
		Phone ph2 = new SmartPhone();
		SmartPhone sm2 = (SmartPhone) ph2;
		ph2.makeAPhoneCall();
		sm2.playApp("유튜브");
		
	}
}
