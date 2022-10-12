package exam08.emp;

public class TempEmployee extends Employee {

	// ����
	private int hireYear;
	
	// super ����ϱ�(����)
	public TempEmployee(int empNo, String name, int pay, int hireYear) {
		super(empNo, name, pay);
		this.hireYear = hireYear;
	}
	
	@Override
	public int getPayMonth() {
		return this.pay / 12;
	}
	
}
