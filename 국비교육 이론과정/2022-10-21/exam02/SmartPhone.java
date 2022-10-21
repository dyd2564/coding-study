package exam02;

import exam01.CellPhone;

public class SmartPhone extends CellPhone {

	String[] apps;
	
	SmartPhone(String model, String color) {
		super(model, color);
	}
	
	void appPlay(String appName) {
		bell();
		System.out.println("¾Û ½ÇÇà : " + appName);
	}
}
