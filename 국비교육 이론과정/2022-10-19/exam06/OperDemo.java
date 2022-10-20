package exam06;

public class OperDemo {
	public static void main(String[] args) {
		Operator add = new AddOperation();
		Operator multi = new MultiOperation();
		Operator sub = new Operator() {
			
			@Override
			public int excute(int a, int b) {
				return a-b;
			}
		};
		
		Operation op = new Operation(sub);
		op.operate(10, 25);
		op.operate(2, 5);
		
		op.setOper(add);
		op.operate(11, 25);
	}
}
