package exam12.test02;

import exam12.test01.DemoA;

public class DemoB extends DemoA {
	// ��� ���迡 ���� ��
	public static void main(String[] args) {
		DemoB db = new DemoB();
		System.out.println(db.a); // public
		System.out.println(db.b); // protected
//		System.out.println(db.c); // default (���� ���� �Ұ�)
//		System.out.println(db.d); // private (���� ���� �Ұ�)
	}
}
