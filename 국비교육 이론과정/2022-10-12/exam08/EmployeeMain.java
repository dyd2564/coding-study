package exam08;

import exam08.emp.Employee;
import exam08.emp.RegularEmployee;
import exam08.emp.TempEmployee;

public class EmployeeMain {
	public static void main(String[] args) {
		
		RegularEmployee remp1 = new RegularEmployee(1, "홍길동", 3000, 600);
		
		TempEmployee temp1 = new TempEmployee(2, "박민수", 3000, 2);
		System.out.println("정규직 홍길동 급여 : " + remp1.getPayMonth());
		System.out.println("계약직 박민수 급여 : " + temp1.getPayMonth());
	}
}
/*
 사원(Employee) 
 	사번(empNo)
 	이름(name)
 	연봉(pay)
 	월급여(메소드)
 	
 정규직(RegularEmployee)
 	보너스(bonus)
 	월급여(메소드)
 	
 계약직(TempEmployee)
 	고용기간(hireYear)
 	월급여(메소드)
 	
 월급여 계산 방법
 정규직 : (연봉 + 보너스) / 12
 계약직 : 연봉 / 12
 */

