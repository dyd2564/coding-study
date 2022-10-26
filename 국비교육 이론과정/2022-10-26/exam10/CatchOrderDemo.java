package exam10;

import java.util.Scanner;

public class CatchOrderDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(">> ȸ����ȣ �Է� : ");
		
		try {
			String inputValue = sc.nextLine();
			int id = Integer.parseInt(inputValue);
			System.out.println("�Է��� ��ȣ : " + id);
		} 
		catch (NumberFormatException e) {
			System.out.println("���ڸ� �Է��ϼ���");
		} 
		catch (RuntimeException e) {
			System.out.println("���� ���� �߻�");
		} 
		catch (Exception e) {
			System.out.println("�Ϲ� ���� �߻�");
			System.out.println(e.getMessage());
		}
		finally {
			// ���ҽ� �ݳ�
			sc.close();
		}
	}
}
