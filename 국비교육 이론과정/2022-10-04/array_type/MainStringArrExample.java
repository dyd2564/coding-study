package array_type;

public class MainStringArrExample {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("���α׷� ����....");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0); // ���α׷� ��������
		}
		
		System.out.println(args[0]); // 200
		System.out.println(args[1]); // 300
		System.out.println(args[0] + args[1]); // 200300
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println(num1 + num2); // 500
	}
}
