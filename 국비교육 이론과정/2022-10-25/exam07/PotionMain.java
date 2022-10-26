package exam07;

public class PotionMain {
	public static void main(String[] args) {
		Potion healPotion = new HealPotion();
		healPotion.recovery();
		((HealPotion)healPotion).sayHello();
		
		Potion manaPotion = new ManaPotion();
		manaPotion.recovery();
		((ManaPotion)manaPotion).sayYes();
		
		// ClassCastException
		ManaPotion manaPotion2 = (ManaPotion) healPotion;
	}
}
