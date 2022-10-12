package exam04;

public class PeopleDemo {
	public static void main(String[] args) {
		// 자식객체를 생성하면 부모객체도 생성된다.
		// 자식(서브, 하위) 클래스 생성자 호출 -> 부모(슈퍼, 상위)클래스 생성자 호출
//		Student st = new Student();
//		Student st = new Student("박길동", "55557777");
//		Student st = new Student("박길동", "55557777", 10);
		People st = new Student("박길동", "55557777", 10);
		st.printInfo();
		
	}
}
