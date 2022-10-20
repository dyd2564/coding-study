package exam01;

public class Student {

	String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		Student st = (Student) obj;
		if (st.name.equals(this.name)) {
			return true;
		}
		
		return false;
	}



	public static void main(String[] args) {
		Student s1 = new Student("김철수");
		// 타입 참조변수 = new 생성자
		Student s2 = new Student("김철수");
		// s1, s2 : 참조변수 -> 스택(stack)영역
		// s1객체, s2객체 -> 힙(Heap)영역
		System.out.println(s1);
		System.out.println(s2);
		
		// 참조값 비교(비교연산자 ==)
		System.out.println(s1==s2);
		
		// 객체의 값 비교(equals 메소드)
		System.out.println(s1.equals(s2));
		
		String str1 = "홍길동";
		String str2 = new String("홍길동");
	}
}
