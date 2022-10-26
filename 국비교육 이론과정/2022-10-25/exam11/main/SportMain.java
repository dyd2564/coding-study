package exam11.main;

import exam11.modifier.Sports;

public class SportMain {
	public static void main(String[] args) {
		Sports sports = new Sports();
		sports.new BaseBall(); // public
//		sports.new BasketBall(); // protected
//		sports.new FootBall(); // default
//		sports.new VolleyBall(); // private
	}
}
