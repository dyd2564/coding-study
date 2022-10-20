package exam07;

public class Computer {

	int printSum(int[] numbers) {
		int result = 0;
		for (int e : numbers) {
			result += e;
		}
		return result;
		
		
	}
	
	int printSum2(int ... numbers) {
		int result = 0;
		for (int i = 0; i < numbers.length; i++) {
			result += numbers[i];
			
		}
		return result;
		
		
	}
	
	public static void main(String[] args) {
		Computer c = new Computer();
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int result1 = c.printSum(nums); 
		int result2 = c.printSum(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}); 
		
		System.out.println("�迭�� ��� ����� �� : " + result1);
		System.out.println("�迭�� ��� ����� �� : " + result2);
		System.out.println("================================");
		
		int result3 = c.printSum2();
		int result4 = c.printSum2(1);
		int result5 = c.printSum2(1, 2, 3);
		System.out.println("�迭�� ��� ����� �� : " + result3);
		System.out.println("�迭�� ��� ����� �� : " + result4);
		System.out.println("�迭�� ��� ����� �� : " + result5);
		c.printSum2(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
	
	}
}
