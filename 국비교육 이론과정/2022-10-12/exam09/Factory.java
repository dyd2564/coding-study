package exam09;

import java.util.ArrayList;

public class Factory extends GenBuilding {
	
	public Factory(int hp, int buildTime) {
		super(hp, buildTime);
	}
	
	@Override
	public void setUnitList() {
		this.unitList = new ArrayList<String>();
		this.unitList.add("��ó");
		this.unitList.add("��ũ");
		this.unitList.add("�񸮾�");
	}
}
