package exam10;

import java.util.Scanner;

public class CatchOrderDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(">> 회원번호 입력 : ");
		
		try {
			String inputValue = sc.nextLine();
			int id = Integer.parseInt(inputValue);
			System.out.println("입력한 번호 : " + id);
		} 
		catch (NumberFormatException e) {
			System.out.println("숫자를 입력하세요");
		} 
		catch (RuntimeException e) {
			System.out.println("실행 예외 발생");
		} 
		catch (Exception e) {
			System.out.println("일반 예외 발생");
			System.out.println(e.getMessage());
		}
		finally {
			// 리소스 반납
			sc.close();
		}
	}
}
