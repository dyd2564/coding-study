package exam07;

public class Alistar extends Champion {

	public Alistar(int hp, int attack) {
		super(hp, attack);
	}
	
	@Override
	public void useSkillE() {
		System.out.println("�м�");
	}
	@Override
	public void useSkillQ() {
		System.out.println("��ġ��");
		
	}
	@Override
	public void useSkillR() {
		System.out.println("�����");
		
	}
	@Override
	public void useSkillW() {
		System.out.println("���� �� ���� ����");
		
	}

}
