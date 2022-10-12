package exam12.area01;

public class FactoryUnit {
	// protected 접근 가능
	// 동일패키지의 클래스,
	// 상속관계가 있는 다른 패키지의 클래스
	protected int hp;
	protected int attack;
	protected int defence;
	
	protected void repare() {
		System.out.println("유닛수리");
	}
}
