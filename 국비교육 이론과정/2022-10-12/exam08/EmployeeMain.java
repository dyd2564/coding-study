package exam08;

import exam08.emp.Employee;
import exam08.emp.RegularEmployee;
import exam08.emp.TempEmployee;

public class EmployeeMain {
	public static void main(String[] args) {
		
		RegularEmployee remp1 = new RegularEmployee(1, "ȫ�浿", 3000, 600);
		
		TempEmployee temp1 = new TempEmployee(2, "�ڹμ�", 3000, 2);
		System.out.println("������ ȫ�浿 �޿� : " + remp1.getPayMonth());
		System.out.println("����� �ڹμ� �޿� : " + temp1.getPayMonth());
	}
}
/*
 ���(Employee) 
 	���(empNo)
 	�̸�(name)
 	����(pay)
 	���޿�(�޼ҵ�)
 	
 ������(RegularEmployee)
 	���ʽ�(bonus)
 	���޿�(�޼ҵ�)
 	
 �����(TempEmployee)
 	���Ⱓ(hireYear)
 	���޿�(�޼ҵ�)
 	
 ���޿� ��� ���
 ������ : (���� + ���ʽ�) / 12
 ����� : ���� / 12
 */

