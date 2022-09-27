package variableScope;

public class VarScope { // 클래스 블록 시작
	public static void main(String[] args) { // 메인 블록 시작
		
		String str = "조건문 블록 안에서 사용할 수 있을끼?";
		
		if(10 > 5) { // 조건문 블록 시작
			String result = "10은 5보다 큽니다.";
			System.out.println(result);
			System.out.println(str);
		} // 조건문 블록 튼
	} // 메인 블록 끝
} // 클래스 블록 끝
