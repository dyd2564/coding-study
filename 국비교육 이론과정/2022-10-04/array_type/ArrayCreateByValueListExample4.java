package array_type;

public class ArrayCreateByValueListExample4 {
	public static void main(String[] args) {
		
		// �迭�� ����� �ʱ�ȭ
		int[] scores = new int[3];
		scores[0] = 50;
		scores[1] = 40;
		scores[2] = 50;
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		String[] names1 = new String[] {"ȫ�浿", "�ڱ浿", "��浿"};
		String[] names2 = {"ȫ�浿", "�ڱ浿", "��浿"};
	}
}
