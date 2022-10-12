package exam08.emp;

public class Employee {
	
	// 정답
	// 캡슐화
	protected int empNo;
	protected String name;
	protected int pay;
 	
	// 정답
	public Employee(int empNo, String name, int pay) {
		this.empNo = empNo;
		this.name = name;
		this.pay = pay;
	}
	
	// 월급여(메소드) : 반환타입 int -> 오버라이딩 대상
	public int getPayMonth() {
		return 0;
	}
	

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
 	
 	
	
}
