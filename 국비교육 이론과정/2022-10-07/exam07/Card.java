package section2.exam07;

public class Card {
	
	int cardNumber; // ī�� ����(�ν��Ͻ�)
	static int cardWidth; // ���� ����(����) -> ī�帶�� ����, ���� ���� �����Ͽ� static���� ����
	static int cardHeight; // ���� ����(����) -> ī�帶�� ����, ���� ���� �����Ͽ� static���� ����
	
	public Card() {
		// ������� ��������� ��� ��밡��
		System.out.println(cardWidth); // ������� ���
		this.cardNumber = 8; // ��������� ���
	}
	
	static {
		// ������� ��밡��
		cardWidth = 90;
		cardHeight = 55;
		// ����������� ����� �� ����.
//		cardNumber = 10;
//		getCardNumber();
	}
	
	// ����ƽ �޼ҵ�
	static void infoCardSize() {
		// ���� ��� ��� ����
		System.out.println(cardWidth);
		System.out.println(cardHeight);
		getMessage();
		// ����������� ����� �� ����.
//		cardNumber = 10;
//		getCardNumber();
	}
	
	static void getMessage() {
		System.out.println("Hello");
	}
	
	// �ν��Ͻ� �޼ҵ�
	int getCardNumber() {
		// �������, ������ ��� ��� ��밡��
		getMessage(); // ���� �޼ҵ�
		cardNumber = 100; // �ν��Ͻ� �ʵ�
		cardWidth = 80; // ���� �ʵ�
		cardHeight = 40; // ���� �ʵ�
		return this.cardNumber;
	}
	

	public static void main(String[] args) {
		infoCardSize();
//		Card card = new Card();
//		int result = card.getCardNumber();
//		System.out.println(result);
	}
}
