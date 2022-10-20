package exam12.test02;

import exam12.test01.DemoA;

public class DemoB extends DemoA {
	// 상속 관계에 있을 떄
	public static void main(String[] args) {
		DemoB db = new DemoB();
		System.out.println(db.a); // public
		System.out.println(db.b); // protected
//		System.out.println(db.c); // default (현재 접근 불가)
//		System.out.println(db.d); // private (현재 접근 불가)
	}
}
