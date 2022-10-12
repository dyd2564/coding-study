package exam12.area01;

public class FactoryUnitExample {
	public static void main(String[] args) {
		FactoryUnit f = new FactoryUnit();
		f.attack = 12;
		f.defence = 5;
		f.repare();
		System.out.println(f.attack);
		System.out.println(f.defence);
	}
}
