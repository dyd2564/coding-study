package scanner_exam;

import java.util.*;

public class ValueOfExample3 {
	public static void main(String[] args) {
		
		System.out.print("�ݾ��� �Է��ϼ��� >> ");
		Scanner sc = new Scanner(System.in);
		
		String inputValue = sc.nextLine();
		
		try {
			double val = Double.valueOf(inputValue); // NaN ���ɼ� ����.
//			System.out.println(val==Double.NaN); // ������
//			System.out.println(Double.isNaN(val)); // ���� �� ��
//			!= �� == �� �����񱳷ν� �ּ� �� ���Ͽ��� �Ǵ���!!!!!!!!!!!!!
//			if (val != Double.NaN) { // �� if ������ ���� �� ���� �������� �ùٸ� �� �� ����.
			if (!Double.isNaN(val)) {
				double currentBalance = 1000.0;
				System.out.println(val + "�� �Ա�");
				currentBalance += val;
				System.out.println("�ܾ� : " + currentBalance);
				return;
			}
			System.out.println("NaN : �ùٸ� �Է°��� �ƴմϴ�.");
		} catch (Exception e) {
			System.out.println("���ܹ߻� : �ùٸ� �Է°��� �ƴմϴ�.");
		}
		
		
		
	}
}
