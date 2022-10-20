package exam02;

public class City {

	private String name;
	private String owner;
	private int price; // 매입가 또는 매매가
	private boolean isBuilding; // 건물 건설 여부
	private CityBuilding ownedBuilding; // 지어진 건물
	private int tax; // 통행세
	
	// 생성자
	public City(final String name, final int price,
			final boolean isBuilding) {
		this.name = name;
		this.price = price;
		this.isBuilding = isBuilding;
	}


	@Override
	public String toString() {
		return "도시이름 : " + name + ", 매매가 : " + price + 
				", 건물 건설 여부 : " + isBuilding;
	}
	
	public void setTax() {
		// 건물을 지을 수 없는 경우 : 서울(2배) , 그외(1.2배)
		if (isBuilding == false) {
			tax = name.equals("서울") ? price * 2 : (int)(price*1.2);
			return;
		}
		
		// 건물을 지을 수 있는 경우 : 건물이 없는 경우(0.1배),
		if (ownedBuilding == null) {
			tax = (int)(price*0.1);
			return;
		}
		// 별장(0.8배), 빌딩(+60만), 호텔(+100만)
		switch (ownedBuilding) {
		case VILLA:
			tax = (int)(price*0.8);
			break;
			
		case BUILDING:
			tax = price + 600000;
			break;
			
		case HOTEL:
			tax = price + 1000000;
			break;
		
		}
		
	}
	
	public int getTax() {
		return tax;
	}
	
	public void setOwnedBuiding(CityBuilding ownedBuiding) {
		this.ownedBuilding = ownedBuiding;
	}
	
}
