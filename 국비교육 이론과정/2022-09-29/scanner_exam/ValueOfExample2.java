package scanner_exam;

import java.util.*;

public class ValueOfExample2 {
	public static void main(String[] args) {
		
		System.out.print("�ݾ��� �Է��ϼ��� >> ");
		Scanner sc = new Scanner(System.in);
		
		String inputValue = sc.nextLine();
		
		double val = Double.valueOf(inputValue);
		
		double currentBalance = 1000.0;
		System.out.println(val + "�� �Ա�");
		currentBalance += val;
		System.out.println("�ܾ� : " + currentBalance);
		
		
		
	}
}
