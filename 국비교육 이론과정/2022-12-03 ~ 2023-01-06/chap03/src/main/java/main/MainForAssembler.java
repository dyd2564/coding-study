package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import assembler.Assembler;
import spring.ChangePasswordService;
import spring.DuplicateMemberException;
import spring.MemberNotFoundException;
import spring.MemberRegisterService;
import spring.RegisterRequest;
import spring.WrongIdPasswordException;

public class MainForAssembler {
	
	private static Assembler assembler = new Assembler(); 
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = 
				new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("명령어를 입력하세요:");
			String command = reader.readLine();
			if(command.equalsIgnoreCase("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if(command.startsWith("new ")) { // 회원가입
				processNewCommand(command.split(" "));
			} else if(command.startsWith("change ")) { // 비밀번호 변경
				processChangeCommand(command.split(" "));
			}
			else {
				printHelp();
			}
			
		}
	}

	private static void processNewCommand(String[] arg) { // 회원가입
		if(arg.length!=5) {
			printHelp();
			return;
		}
		//{new, 이메일, 이름, 암호, 암호확인}
		RegisterRequest req = new RegisterRequest(); 
		req.setEmail(arg[1]);
		req.setName(arg[2]);
		req.setPassword(arg[3]);
		req.setConfirmPassword(arg[4]);
		
		// 어셈블러 컨테이너에서 MemberRegisterService객체를 가져옴 
		MemberRegisterService regSvc = assembler.getRegSvc();
		
		// 비밀번호 일치 확인
		if(!req.isPasswordEqualToConfirmPasswrod()) { // 암호와 암호확인이 일치하지 않으면
			System.out.println("암호와 암호확인이 일치하지 않습니다.");
			return; 
		}
		// 암호와 암호확인이 일치하면 
		try {
			regSvc.register(req);
			System.out.println("등록했습니다.\n");
		} catch (DuplicateMemberException e) {
			System.out.println("이미 존재하는 이메일입니다.");
		}
	}
	
	private static void processChangeCommand(String[] arg) { // 비밀번호 변경 
		if(arg.length!=4) {
			printHelp();
			return;
		}
		// {change, 이메일, 현재비번, 변경비번}
		// 어셈블러 컨테이너에서 ChagePasswordService 객체를 가져옴
		ChangePasswordService pwdSvc = assembler.getPwdSvc();
		try {
			pwdSvc.changePassword(arg[1], arg[2], arg[3]);
			System.out.println("암호를 변경했습니다.\n");
		} catch (MemberNotFoundException e) {
			System.out.println("존재하지 않는 이메일입니다.\n");
		} catch (WrongIdPasswordException e) {
			System.out.println("이메일과 암호가 일치하지 않습니다.\n");
		}
	}

	private static void printHelp() {
		System.out.println();
		System.out.println("잘못된 명령입니다. 아래 명령어 사용법을 확인하세요");
		System.out.println("명령어 사용법 : ");
		System.out.println("new 이메일 이름 암호 암호확인");
		System.out.println("change 이메일 현재비번 변경비번");
		System.out.println();
	}
	
}
