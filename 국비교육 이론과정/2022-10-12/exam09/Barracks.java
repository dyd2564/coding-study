package exam09;

import java.util.*;

public class Barracks extends GenBuilding{
	
	public Barracks(int hp, int buildTime) {
		super(hp, buildTime);
	}
	
	@Override
	public void setUnitList() {
		this.unitList = new ArrayList<String>();
		this.unitList.add("����");
		this.unitList.add("���̾��");
		this.unitList.add("��Ʈ");
	}
}
