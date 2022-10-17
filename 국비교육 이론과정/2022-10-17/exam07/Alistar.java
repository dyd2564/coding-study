package exam07;

public class Alistar extends Champion {

	public Alistar(int hp, int attack) {
		super(hp, attack);
	}
	
	@Override
	public void useSkillE() {
		System.out.println("ºÐ¼â");
	}
	@Override
	public void useSkillQ() {
		System.out.println("¹ÚÄ¡±â");
		
	}
	@Override
	public void useSkillR() {
		System.out.println("Áþ¹â±â");
		
	}
	@Override
	public void useSkillW() {
		System.out.println("²ªÀ» ¼ö ¾ø´Â ÀÇÁö");
		
	}

}
