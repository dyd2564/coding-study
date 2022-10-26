package exam11.modifier;

public class Demo {
	public static void main(String[] args) {
		Sports sports = new Sports();
		sports.new BaseBall(); // public
		sports.new BasketBall(); // protected
		sports.new FootBall(); // default
//		sports.new VolleyBall(); // private
	}
}
