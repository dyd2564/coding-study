package exam03;

import exam03.AAA.BBB;

public class AAADemo {
	public static void main(String[] args) {
		AAA aaa = new AAA();
		BBB b = aaa.new BBB();
		System.out.println(b.bb1);
		b.methodBB();
		System.out.println(BBB.BB3);
		System.out.println(AAA.BBB.BB3);
	}
}
