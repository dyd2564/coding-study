package exam03;

// ����� �ϳ� �ۿ� ���� ����, �������̽��� �ټ� ���� ����
public abstract class Building implements 
						Liftable, Reparable, Generatable {
	public void buildComplete() {
		System.out.println("�Ǽ� �Ϸ�");
	}
}

class DummyA{} 
class DummyB{}

interface Liftable {
	void lift();
}
interface Reparable {
	void repare();
}
interface Generatable {
	void generate();
}
