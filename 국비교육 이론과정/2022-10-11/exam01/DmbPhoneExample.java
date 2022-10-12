package exam01;

public class DmbPhoneExample {
	public static void main(String[] args) {
		
		// DmbCellPhone 객체 생성
		DmbCellphone dmbPhone = new DmbCellphone("자바폰", "검정", 10);
		
		// CellPhone으로 부터 상속받은 필드
		System.out.println("모델 : " + dmbPhone.model);
		System.out.println("색상 : " + dmbPhone.color);
		
		// DmbCellPhone의 필드
		System.out.println("채널 : " + dmbPhone.channel);
		
		// CellPhone으로 부터 상속받은 메소드 호출
		dmbPhone.powerOn();
		dmbPhone.bell();
		dmbPhone.sendVoice("여보세요?");
		dmbPhone.receiveVoice("안녕하세요! 저는 홍길동입니다.");
		dmbPhone.sendVoice("아~ 예 반갑습니다.");
		dmbPhone.hangUp();
		
		// DmbCellPhone의 메소드 호출
		dmbPhone.turnOnDmb();
		dmbPhone.changeChnnelDmb(12);
		dmbPhone.turnOffDmb();
		
		
	}
}
