package exam09;

public class Member {

	public static final String gradeA = "A";
	public static final String gradeB = "B";
	
	int id;
	String name;
	String grade;

	public Member(int id, String name, String grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
	public static void main(String[] args) {
		
	}
	
	
}

enum Grade {
	A, B, C, D
}
