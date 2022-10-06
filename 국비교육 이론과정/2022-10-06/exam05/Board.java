package section.exam05;

public class Board {
	
	long id;
	String title;
	String cotents;
	String writer;
	
	// 생성자 자동완성 단축키
	// shift + alt + s
	// Generate Constructor Using Fields 선택
	
	// 단축키 말고 생성 방법
	// Source - Generate Constructor Using Fields 선택
	public Board(String title, String cotents, String writer) {
		this.title = title;
		this.cotents = cotents;
		this.writer = writer;
	}
	
}
