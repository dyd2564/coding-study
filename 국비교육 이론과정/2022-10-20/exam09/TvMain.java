package exam09;

public class TvMain {
	public static void main(String[] args) {
		System.out.println(Television.info);
		
		System.out.println("=================");
		Television tv1 = new Television("����");
		tv1.methodA();
		System.out.println(tv1);
		
		Television tv2 = new Television("������");
		tv2.methodA();
		System.out.println(tv2);
	}
}
