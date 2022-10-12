package exam08.emp;

// ����
public class RegularEmployee extends Employee {
	
	// ����
	private int bonus;
	
	// super ����ϱ�(����)
	public RegularEmployee(int empNo, String name, int pay, int bonus) {
		super(empNo, name, pay);
		this.bonus = bonus;
	}
	
	// ����(����)
	@Override
	public int getPayMonth() {
		return (this.bonus + this.pay) / 12;
	}
}
