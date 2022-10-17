package exam07;

public class Sona extends Champion {

	
	public Sona(int hp, int attack) {
		super(hp, attack);
	}
	
	@Override
	public void useSkillE() {
		System.out.println("용맹의 진가");
	}
	@Override
	public void useSkillQ() {
		System.out.println("인내의 아리아");
		
	}
	@Override
	public void useSkillR() {
		System.out.println("기민함의 노래");
		
	}
	@Override
	public void useSkillW() {
		System.out.println("크레센도");
		
	}
}
