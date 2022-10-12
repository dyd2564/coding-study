package exam08.emp;

public class TempEmployee extends Employee {

	// 정답
	private int hireYear;
	
	// super 사용하기(수정)
	public TempEmployee(int empNo, String name, int pay, int hireYear) {
		super(empNo, name, pay);
		this.hireYear = hireYear;
	}
	
	@Override
	public int getPayMonth() {
		return this.pay / 12;
	}
	
}
