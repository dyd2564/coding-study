package exam10;

public class AA {
	String str = "AAŬ���� �ʵ� ����";
	
	class BB { // �ν��Ͻ� ��� Ŭ����
		String str = "BBŬ���� �ʵ� ����";
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
