package exam16;

public class Arthas extends Hero {
	
	@Override
	void useUlt() {
		System.out.println("궁극기 사용 : 사자의 군대");
	}
	
	// 상위타입(Hero)에 정의되지 않은 메소드
	void infoArthas() {
		System.out.println("아서스 정보");
	}
}
