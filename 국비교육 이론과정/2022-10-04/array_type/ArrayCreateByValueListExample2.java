package array_type;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {
		
		// �迭�� ����� �ʱ�ȭ
		int[] scores = {83, 90, 87, 70, 75};
		// �迭�� ���� : ����� ����(5��)
		
		// �ݺ������� �迭 ��ҿ� ����
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "] = "+ scores[i]);
			
		}
		
		String[] names = {"ȫ�浿", "��浿", "�ڱ浿"};
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "] = "+ names[i]);
		}
		
		boolean[] flags = {false, true, false, false, true};
		for (int i = 0; i < flags.length; i++) {
			System.out.println("flags[" + i + "] = "+ flags[i]);
		}
	}
}
