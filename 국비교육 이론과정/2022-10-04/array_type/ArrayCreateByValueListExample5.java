package array_type;

public class ArrayCreateByValueListExample5 {
	public static void main(String[] args) {
		
		// {} �̿��� �迭 ���� ����� ����� �ʱ�ȭ�� �и��� �� ����.
		
		int[] scores1; // ����
//		scores1 = {10, 20, 30, 40}; // ������ ����
		
		// ���� �迭 ���� ���Ҵ� �� �� ����.
		String[] names1 = {"ȫ�浿", "��浿"};
//		names1[] = {"�ڱ浿", "���浿"}; // ������ ����
		
		// ����� �ʱ�ȭ�� �и��Ϸ��� �ʱ�ȭ�� new �����ڸ� ����ؾ��Ѵ�.
		int[] scores2;
		scores2 = new int[] {10, 20, 30, 40};
		for (int i = 0; i < scores2.length; i++) {
			System.out.println(scores2[i]);
		}
		
		// �迭 ������ ���� ���Ҵ� �Ϸ��� new �����ڸ� ����ؾ��Ѵ�.
		String[] names2 = {"ȫ�浿", "��浿"};
		names2 = new String[] {"ȫ�浿", "��浿"};
		for (int i = 0; i < names2.length; i++) {
			System.out.println(names2[i]);
		}
	}
}
