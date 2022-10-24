package exam03;

public class Barracks extends Building {

	@Override
	public void lift() {
		System.out.println("lift()");
	}

	@Override
	public void repare() {
		System.out.println("repare()");
	}

	@Override
	public void generate() {
		System.out.println("generate()");
	}
	
}
