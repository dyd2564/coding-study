package exam03;

public class SmartPhone extends Phone {
	// IsA ����
	// ����Ʈ���� ���̴�.
	// ����Ʈ���� ���� �� �����̴�.
	
	String[] apps = {"��Ʃ��", "�÷��̽����", "īī����"};
	
	public void playApp(String name) {
		for(String app : apps) {
			if(app.equals(name)) {
				System.out.println(app + "�� ����");
			}
		}
	}
}
