package array_type;

public class ArrayCreateByValueListExample3 {
	public static void main(String[] args) {
		
		// 배열의 선언과 초기화
		int[] scores = {83, 90, 87, 70, 75};
		
		int sum = 0;
		
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		
		double avg = sum / (double) scores.length;
		System.out.println("평균 : " + avg);
		
	}
}
