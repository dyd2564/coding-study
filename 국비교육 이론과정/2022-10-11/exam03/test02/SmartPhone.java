package exam03.test02;

import exam03.test01.CellPhone;
import java.util.*;

public class SmartPhone extends CellPhone {
	
	public List<String> apps;
	
	public SmartPhone() {
		apps = new ArrayList<String>();
		apps.add("유튜브");
		apps.add("플레이스토어");
		apps.add("네이버");
	}
	
	public void appExecute(String appName) { // 네이버
		if (!isPowerOn(this.power)) return;
		for(String app : apps) {
			if(app != null && app.equals(appName)) {
				System.out.println(appName + "앱을 실행합니다.");
				return;
			}
		}
		System.out.println("해당 앱이 존재하지 않습니다.");
	}
	
	public void appDownload(String appName) {
		this.apps.add(appName);
	}
}
