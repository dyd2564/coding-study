package exam08.emp;

public class Employee {
	
	// ����
	// ĸ��ȭ
	protected int empNo;
	protected String name;
	protected int pay;
 	
	// ����
	public Employee(int empNo, String name, int pay) {
		this.empNo = empNo;
		this.name = name;
		this.pay = pay;
	}
	
	// ���޿�(�޼ҵ�) : ��ȯŸ�� int -> �������̵� ���
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
