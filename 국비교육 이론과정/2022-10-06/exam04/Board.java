package section2.exam04;

public class Board {
	static String category = "자유게시판";
	String title;
	
	public Board(String title) {
		this.title = "제목입니다.00";
		System.out.println(this);
		
	}
	
	public static void main(String[] args) {
		System.out.println(Board.category);
		Board b1 = new Board("게시판");
		
	}
}
