package operation;

public class OperationPriority {
	public static void main(String[] args) {
		
		System.out.println("12를 5로 나누었을 때 나머지 : "+ 12%5);
		
		// 산술연산자 연산방향 : 왼쪽에서 오른쪽
		int num = 9 * 4/ 3 % 5;
		System.out.println("num : "+ num);
		
		int a, b, c; // 타입이 같다면 쉼표 사용하여 동시에 선언가능
		// 대입연산자의 연산 방향 : 오른쪽에서 왼쪽
		a = b = c = 5;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}
}
