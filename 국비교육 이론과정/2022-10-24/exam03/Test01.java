package exam03;

public class Test01 {

	public static void main(String[] args) {
		// �͸��� ��ü -> ���ٽ� -> �޼ҵ� ����
		Liftable l = new Liftable() {
			@Override
			public void lift() {
				System.out.println("lift");
			}
		};
		Building b = new Building() {

			@Override
			public void lift() {
				System.out.println("lift");
			}

			@Override
			public void repare() {
				System.out.println("repare");
			}

			@Override
			public void generate() {
				System.out.println("generate");
			}
			
		};
	}
}
