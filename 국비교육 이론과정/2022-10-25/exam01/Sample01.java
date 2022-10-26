package exam01;

public class Sample01 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3}; // 마지막 인덱스 번호 2
//		System.out.println(arr[3]); // 실행예외(RunTimeException)
		
		// 일반 예외 : 컴파일 전 반드시 예외처리 코드를 작성해야함
		try {
			test01();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 메소드 밖으로 예외를 던짐
	// 메소드 밖 : 이 메소드를 호출한 메소드
	public static void test01() throws ClassNotFoundException {
			test02();
	}
	
	public static void test02() throws ClassNotFoundException{
		Class.forName("");
		
	}
}
