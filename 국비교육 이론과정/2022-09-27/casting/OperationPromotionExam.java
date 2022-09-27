package casting;

public class OperationPromotionExam {
	public static void main(String[] args) {
		byte bv1 = 10;
		byte bv2 = 20;
		int result = bv1 + bv2;
		
		char charValue1 = 'A'; // 65
		char charValue2 = 1;
		int result2 = charValue1 + charValue2;
		
		int intValue3 = 10;
		int intValue4 = 4;
		int result3 = intValue3 / intValue4; // 2.5
		System.out.println(result3);
		
		double result4 = intValue3 / intValue4; 
		System.out.println(result4);
		
		double result5 = (double)intValue3 / intValue4;
		System.out.println(result5);
	}
}
