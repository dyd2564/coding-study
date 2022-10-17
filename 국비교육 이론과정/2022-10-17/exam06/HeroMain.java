package exam06;

public class HeroMain {
	public static void main(String[] args) {
		Hero hero = new Hero(200, 100);
		for (int i = 0; i < 6; i++) {
			hero.usePotion(new HealPotion());
			hero.usePotion(new ManaPotion());
			System.out.println(hero);
		}
		
	}
}

