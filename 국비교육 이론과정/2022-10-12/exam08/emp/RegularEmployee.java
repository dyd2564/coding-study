package exam08.emp;

// 정답
public class RegularEmployee extends Employee {
	
	// 정답
	private int bonus;
	
	// super 사용하기(수정)
	public RegularEmployee(int empNo, String name, int pay, int bonus) {
		super(empNo, name, pay);
		this.bonus = bonus;
	}
	
	// 오답(수정)
	@Override
	public int getPayMonth() {
		return (this.bonus + this.pay) / 12;
	}
}
