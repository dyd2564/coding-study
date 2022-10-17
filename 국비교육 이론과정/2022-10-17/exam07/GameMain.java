package exam07;

public class GameMain {
	public static void main(String[] args) {
		
		System.out.println("=======알리스타========");
		Champion champ1 = new Alistar(300, 35);
		champ1.move(10, 5);
		champ1.useSkillQ();
		champ1.useSkillW();
		champ1.useSkillE();
		champ1.useSkillR();
		
		System.out.println("=======알리스타========");
		Champion champ2 = new Sona(200, 25);
		champ2.move(10, 15);
		champ2.useSkillQ();
		champ2.useSkillW();
		champ2.useSkillE();
		champ2.useSkillR();
	}
}
