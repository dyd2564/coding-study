package exam09;

public class TvMain {
	public static void main(String[] args) {
		System.out.println(Television.info);
		
		System.out.println("=================");
		Television tv1 = new Television("은색");
		tv1.methodA();
		System.out.println(tv1);
		
		Television tv2 = new Television("검정색");
		tv2.methodA();
		System.out.println(tv2);
	}
}
