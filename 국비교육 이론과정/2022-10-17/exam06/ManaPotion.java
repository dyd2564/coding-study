package exam06;

public class ManaPotion extends Potion {
	
	int recovery = 30;
	
	@Override
	public void recovery(Hero hero) {
		int mp = hero.getMp();
		int maxMp = hero.getMaxMp();
		if (mp == maxMp) {
			System.out.println("마나를 더 이상 회복할 수 없습니다.");
			return;
		}
		mp += this.recovery; // 마나 회복
		if (mp >= maxMp) { // 초과 회복
			System.out.println("모든 마나가 회복되었습니다.");
			hero.setMp(maxMp);
			return; // 최대 마나 반환
		}
		hero.setMp(mp);
		
		
	}
		
	
}
