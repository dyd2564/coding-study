package if_exam;

public class MathRandomExample {
	public static void main(String[] args) {
		double random = Math.random();
		// 0 <= random < 1 �Ǽ��� ���
		System.out.println("0�� 1���� ����(0 ����) : " + random);
		
		// 1~10���� ���� ��
		int num = (int) (Math.random() * 10) + 1;
		System.out.println("1 ~ 10������ ���� �� : " + num);
		
		// �ֻ��� : 1~6���� ������
		int dice = (int) (Math.random() * 6) + 1;
		System.out.println("�ֻ��� �� : " + dice);
		
		// �ζ� : 1~45���� ������
		int lotto = (int) (Math.random() * 45) + 1;
		System.out.println("�ζ� ��ȣ : " + lotto);
	}
}
