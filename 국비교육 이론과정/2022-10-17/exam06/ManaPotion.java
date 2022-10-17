package exam06;

public class ManaPotion extends Potion {
	
	int recovery = 30;
	
	@Override
	public void recovery(Hero hero) {
		int mp = hero.getMp();
		int maxMp = hero.getMaxMp();
		if (mp == maxMp) {
			System.out.println("������ �� �̻� ȸ���� �� �����ϴ�.");
			return;
		}
		mp += this.recovery; // ���� ȸ��
		if (mp >= maxMp) { // �ʰ� ȸ��
			System.out.println("��� ������ ȸ���Ǿ����ϴ�.");
			hero.setMp(maxMp);
			return; // �ִ� ���� ��ȯ
		}
		hero.setMp(mp);
		
		
	}
		
	
}
