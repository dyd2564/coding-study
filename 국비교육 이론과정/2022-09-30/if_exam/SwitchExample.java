package if_exam;

public class SwitchExample {
	public static void main(String[] args) {
		
		int num = (int) (Math.random() * 6) + 1;
		switch (num) {
			case 1:
				System.out.println(num);
				System.out.println("1�� ���� ���Խ��ϴ�.");
				break; // case�� Ż�� (break���� ���� �� �ؿ� case���� �� �����.
			case 2:
				System.out.println(num);
				System.out.println("2�� ���� ���Խ��ϴ�.");
				break; // case�� Ż��
			case 3:
				System.out.println(num);
				System.out.println("3�� ���� ���Խ��ϴ�.");
				break; // case�� Ż��
			case 4:
				System.out.println(num);
				System.out.println("4�� ���� ���Խ��ϴ�.");
				break; // case�� Ż��
			case 5:
				System.out.println(num);
				System.out.println("5�� ���� ���Խ��ϴ�.");
				break; // case�� Ż��
			default:
				System.out.println(num);
				System.out.println("6�� ���� ���Խ��ϴ�.");
				break; // case�� Ż��
		}
	}
}
