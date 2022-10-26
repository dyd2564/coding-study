package exam07;

public class HealPotion implements Potion {

	@Override
	public void recovery() {
		System.out.println("힐 포션 사용");
	}
	
	public void sayHello() {
		System.out.println("Hello!");
	}
	
	
}
