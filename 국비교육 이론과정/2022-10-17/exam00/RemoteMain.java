package exam00;

public class RemoteMain {
	public static void main(String[] args) {
//		RemoteControl c = new RemoteControl();
		System.out.println(RemoteControl.MAX_VOLUME);
		System.out.println(RemoteControl.MIN_VOLUME);
		RemoteControl.changeBattery();
	}
}
