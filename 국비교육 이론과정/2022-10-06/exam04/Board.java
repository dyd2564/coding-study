package section2.exam04;

public class Board {
	static String category = "�����Խ���";
	String title;
	
	public Board(String title) {
		this.title = "�����Դϴ�.00";
		System.out.println(this);
		
	}
	
	public static void main(String[] args) {
		System.out.println(Board.category);
		Board b1 = new Board("�Խ���");
		
	}
}
