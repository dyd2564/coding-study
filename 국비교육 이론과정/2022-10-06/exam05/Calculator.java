package section.exam05;

public class Calculator {

	// �޼ҵ� �����ε�
	
	int addParamInt(int x, int y) {
		return x + y;
	}
	
	int addParamString(String x, String y) {
		return Integer.parseInt(x) + Integer.parseInt(y);
	}
	
	int addParamBoth1(int x, String y) {
		return x + Integer.parseInt(y);
	}
	
	int addParamBoth2(String x, int y) {
		return Integer.parseInt(x) + y;
	}
}
