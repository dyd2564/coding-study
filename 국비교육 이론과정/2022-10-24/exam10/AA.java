package exam10;

public class AA {
	String str = "AA클래스 필드 변수";
	
	class BB { // 인스턴스 멤버 클래스
		String str = "BB클래스 필드 변수";
		void print() {
			System.err.println(this.str);
			System.out.println(AA.this.str);
		}
	}
	
	public static void main(String[] args) {
		BB bb = new AA().new BB();
		bb.print();
	}
}
