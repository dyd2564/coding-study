package exam03.test03;

import java.util.Arrays;

import exam03.test02.SmartPhone;

public class SmartPhoneDemo {
	public static void main(String[] args) {
		
		SmartPhone sm = new SmartPhone();
		sm.setPower(true);
		sm.makeAPhoneCall("01011113333");
		sm.appExecute("���̹�");
		
		sm.appDownload("����");
		sm.appDownload("����");
		sm.appDownload("īī����");
		sm.appDownload("����");
		System.out.println(sm.apps);
	}

}

