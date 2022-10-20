package exam06;

public class Operation {
	
	Operator oper;
	
	// 생성자
	public Operation(Operator oper) {
		this.oper = oper;
	}

	public void operate(int left, int right) {
		int result = oper.excute(left, right);
		System.out.println("연산결과 : " + result);
	}
	
	// 수정자
	public void setOper(Operator oper) {
		this.oper = oper;
	}
	
}
