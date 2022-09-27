package variableName;

public class VariableExam {
	public static void main(String[] args) {
		// int : 변수타입, age : 변수이름
		int age;
		// 첫 글자는 관례적으로 소문자로 한다.
		// 띄어쓰기 구분
		String firstName; // 대소문자 구분
		String firstname; // 대소문자 구분
		String _first_$Name; // 특스문자는 '$','_'만 사용 가능
		// 변수명의 길이는 제한 없음
		// 예약어는 변수명으로 사용불가
		
		// 변수 초기화
		int score; // 변수 선언
		score = 90; // 값 할당
		
		int price = 1000; // 선언과 동시에 할당
		System.out.println(score);
		System.out.println(price);
	}

}
