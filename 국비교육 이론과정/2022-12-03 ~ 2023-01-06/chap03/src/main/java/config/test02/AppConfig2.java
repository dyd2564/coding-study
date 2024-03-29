package config.test02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.ChangePasswordService;
import spring.MemberDao;
import spring.MemberInfoPrinter;
import spring.MemberListPrinter;
import spring.MemberPrinter;
import spring.MemberRegisterService;
import spring.VersionPrinter;

@Configuration
public class AppConfig2 {
	
	@Autowired
	private MemberDao memberDao;
	
	@Autowired
	private MemberPrinter memberPrinter;
	
	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService(memberDao); // 생성자 주입
	}
	
	@Bean
	public ChangePasswordService changePwdSvc() {
		ChangePasswordService pwdSvc = new ChangePasswordService(); 
		pwdSvc.setMemberDao(memberDao); // 수정자 주입
		return pwdSvc;
	}
	
	@Bean
	public MemberListPrinter memberListPrinter() {
		// 생성자 주입, Constructor DI
		return new MemberListPrinter(memberDao, memberPrinter);
	}
	
	@Bean
	public MemberInfoPrinter memberInfoPrinter() {
		MemberInfoPrinter memberInfoPrinter = new MemberInfoPrinter();
		// 수정자 주입, Setter DI (Dependency Injection)
		memberInfoPrinter.setMemberDao(memberDao);
		memberInfoPrinter.setPrinter(memberPrinter);
		return memberInfoPrinter;
	}
	
	@Bean
	public VersionPrinter versionPrinter() {
		return new VersionPrinter().setMajorVersion(5).setMinorVersion(0);
	}
}
