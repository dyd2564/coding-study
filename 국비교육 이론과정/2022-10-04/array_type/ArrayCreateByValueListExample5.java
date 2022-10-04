package array_type;

public class ArrayCreateByValueListExample5 {
	public static void main(String[] args) {
		
		// {} 이용한 배열 생성 방식은 선언과 초기화를 분리할 수 없다.
		
		int[] scores1; // 선언
//		scores1 = {10, 20, 30, 40}; // 컴파일 에러
		
		// 또한 배열 값을 재할당 할 수 없다.
		String[] names1 = {"홍길동", "김길동"};
//		names1[] = {"박길동", "나길동"}; // 컴파일 에러
		
		// 선언과 초기화를 분리하려면 초기화시 new 연산자를 사용해야한다.
		int[] scores2;
		scores2 = new int[] {10, 20, 30, 40};
		for (int i = 0; i < scores2.length; i++) {
			System.out.println(scores2[i]);
		}
		
		// 배열 변수에 값을 재할당 하려면 new 연산자를 사용해야한다.
		String[] names2 = {"홍길동", "김길동"};
		names2 = new String[] {"홍길동", "김길동"};
		for (int i = 0; i < names2.length; i++) {
			System.out.println(names2[i]);
		}
	}
}
