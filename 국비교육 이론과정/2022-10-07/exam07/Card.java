package section2.exam07;

public class Card {
	
	int cardNumber; // 카드 숫자(인스턴스)
	static int cardWidth; // 가로 길이(정적) -> 카드마다 세로, 가로 길이 동일하여 static으로 정의
	static int cardHeight; // 세로 길이(정적) -> 카드마다 세로, 가로 길이 동일하여 static으로 정의
	
	public Card() {
		// 정적멤버 비정적멤버 모두 사용가능
		System.out.println(cardWidth); // 정적멤버 사용
		this.cardNumber = 8; // 비정적멤버 사용
	}
	
	static {
		// 정적멤버 사용가능
		cardWidth = 90;
		cardHeight = 55;
		// 비정적멤버를 사용할 수 없다.
//		cardNumber = 10;
//		getCardNumber();
	}
	
	// 스태틱 메소드
	static void infoCardSize() {
		// 정적 멤버 사용 가능
		System.out.println(cardWidth);
		System.out.println(cardHeight);
		getMessage();
		// 비정적멤버를 사용할 수 없다.
//		cardNumber = 10;
//		getCardNumber();
	}
	
	static void getMessage() {
		System.out.println("Hello");
	}
	
	// 인스턴스 메소드
	int getCardNumber() {
		// 정적멤버, 비정적 멤버 모두 사용가능
		getMessage(); // 정적 메소드
		cardNumber = 100; // 인스턴스 필드
		cardWidth = 80; // 정직 필드
		cardHeight = 40; // 정적 필드
		return this.cardNumber;
	}
	

	public static void main(String[] args) {
		infoCardSize();
//		Card card = new Card();
//		int result = card.getCardNumber();
//		System.out.println(result);
	}
}
