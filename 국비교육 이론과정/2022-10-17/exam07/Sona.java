package exam07;

public class Sona extends Champion {

	
	public Sona(int hp, int attack) {
		super(hp, attack);
	}
	
	@Override
	public void useSkillE() {
		System.out.println("����� ����");
	}
	@Override
	public void useSkillQ() {
		System.out.println("�γ��� �Ƹ���");
		
	}
	@Override
	public void useSkillR() {
		System.out.println("������� �뷡");
		
	}
	@Override
	public void useSkillW() {
		System.out.println("ũ������");
		
	}
}
