package exam07;

public class ManaPotion implements Potion {

	@Override
	public void recovery() {
		System.out.println("마나 포션 사용");
	}
	
	public void sayYes() {
		System.out.println("Yes");
	}

}
