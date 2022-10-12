package exam09;

public class BuildingMain {
	public static void main(String[] args) {
		Barracks b = new Barracks(2000, 10);
		b.setUnitList();
		Factory f = new Factory(2500, 15);
		f.setUnitList();
		System.out.println("병명 생산 가능한 유닛 : " + b.getUnitList());
		System.out.println("군수공장 생산 가능한 유닛 : " + f.getUnitList());
		
		
	}
}


/*
유닛생산건물(GenBuilding)
- 내구성(hp)
- 건설시간(buildTime)
- 생산 유닛 목록(unitList)

병명(barracks)
생산가능 유닛 : marine, firebat, ghost

군수공장(factory)
생산가능 유닛 : vulture, tank, goliath
*/