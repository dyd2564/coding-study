package array_type;

public class ArrayCreateByValueListExample4 {
	public static void main(String[] args) {
		
		// 배열의 선언과 초기화
		int[] scores = new int[3];
		scores[0] = 50;
		scores[1] = 40;
		scores[2] = 50;
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		String[] names1 = new String[] {"홍길동", "박길동", "김길동"};
		String[] names2 = {"홍길동", "박길동", "김길동"};
	}
}
