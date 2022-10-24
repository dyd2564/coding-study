package exam03;

// 상속은 하나 밖에 구현 못함, 인터페이스는 다수 구현 가능
public abstract class Building implements 
						Liftable, Reparable, Generatable {
	public void buildComplete() {
		System.out.println("건설 완료");
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
