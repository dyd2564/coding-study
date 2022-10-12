package exam09;

public class BuildingMain {
	public static void main(String[] args) {
		Barracks b = new Barracks(2000, 10);
		b.setUnitList();
		Factory f = new Factory(2500, 15);
		f.setUnitList();
		System.out.println("���� ���� ������ ���� : " + b.getUnitList());
		System.out.println("�������� ���� ������ ���� : " + f.getUnitList());
		
		
	}
}


/*
���ֻ���ǹ�(GenBuilding)
- ������(hp)
- �Ǽ��ð�(buildTime)
- ���� ���� ���(unitList)

����(barracks)
���갡�� ���� : marine, firebat, ghost

��������(factory)
���갡�� ���� : vulture, tank, goliath
*/