package exam12;

import exam12.test01.DemoA;

public class DemoMain {
	public static void main(String[] args) {
		// ���� ��Ű�� ������
		DemoC dc = new DemoC();
		System.out.println(dc.a); // public
		System.out.println(dc.b); // protected
		System.out.println(dc.c); // default
//		System.out.println(dc.d); // private (���� ���� �Ұ�)
		
		// �ٸ� ��Ű��
		DemoA da = new DemoA();
		System.out.println(da.a); // public
//		System.out.println(da.b); // protected (���� ���� �Ұ�)
//		System.out.println(da.c); // default (���� ���� �Ұ�)
//		System.out.println(dc.d); // private (���� ���� �Ұ�)
	}
}
