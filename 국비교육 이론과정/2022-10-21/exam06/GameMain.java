package exam06;

public class GameMain {
	public static void main(String[] args) {
		
		Hero hero = new Hero("���");
		Sword s1 = new Sword("����1");
		Sword s2 = new Sword("����2");
		Spear p1 = new Spear("â1");
		Bow b1 = new Bow("Ȱ1");
		hero.setItem(s2);
		hero.info();
	}
}
