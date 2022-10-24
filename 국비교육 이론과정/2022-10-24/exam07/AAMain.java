package exam07;

import exam07.AA.BB;

public class AAMain {
	public static void main(String[] args) {
		AA aa = new AA();
		BB bb = aa.new BB();
		bb.methodB();
		
	}
}
