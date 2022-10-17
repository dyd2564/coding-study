package exam03;

public class SmartPhone extends Phone {
	// IsA 관계
	// 스마트폰은 폰이다.
	// 스마트폰은 폰의 한 종류이다.
	
	String[] apps = {"유튜브", "플레이스토어", "카카오톡"};
	
	public void playApp(String name) {
		for(String app : apps) {
			if(app.equals(name)) {
				System.out.println(app + "앱 실행");
			}
		}
	}
}
