package exam06;

public class Operation {
	
	Operator oper;
	
	// ������
	public Operation(Operator oper) {
		this.oper = oper;
	}

	public void operate(int left, int right) {
		int result = oper.excute(left, right);
		System.out.println("������ : " + result);
	}
	
	// ������
	public void setOper(Operator oper) {
		this.oper = oper;
	}
	
}
