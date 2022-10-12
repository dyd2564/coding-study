package exam15;

public class HeroMain {
	public static void main(String[] args) {
		
		Hero hero = new Hero("여포");
		Sword s = new Sword("자웅일대검");
		hero.setItem(s);
		
		System.out.println("==========================");
		
		Spear spear = new Spear("방천화극");
		hero.setItem(spear);
		
		hero.info();
	}
}
