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
		// ���� ���� ���� ����
	}
	
	// �߻�޼ҵ�
	abstract public void setUnitList();
	
	
	
}
