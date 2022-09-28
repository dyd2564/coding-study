package operation;

public class DenyLogicOperationExample2 {
	public static void main(String[] args) {
		
		boolean play = true;
		System.out.println("재생 상태 : " + play);
		
		play = !play;
		// !play
		// !true
		// false
		// play = false
		System.out.println("재생 상태 : " + play);
	}	
}
