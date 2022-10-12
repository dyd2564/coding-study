package exam09;

import java.util.*;

public abstract class GenBuilding {

	int hp;
	int buildTime;
	List<String> unitList;
	
	
	public GenBuilding(int hp, int buildTime) {
		this.hp = hp;
		this.buildTime = buildTime;
	}
	
	public List<String> getUnitList() {
		return this.unitList;
		
	}
	
	public void setUnitList() {
		// 생산 가능 유닛 설정
	}
	
	// 추상메소드
	abstract public void setUnitList();
	
	
	
}
