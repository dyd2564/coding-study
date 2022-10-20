package exam02;

public class CityMain {

	public static void main(String[] args) {
		// 생성자
		City busan = new City("부산", 500000, false);
		City seoul = new City("서울", 1000000, false);
		City roma = new City("로마", 320000,  true);
		
//		System.out.println(seoul);
//		System.out.println(roma);
		seoul.setTax();
		System.out.println("서울 : " + seoul.getTax());
		busan.setTax();
		System.out.println("부산 : " + busan.getTax());
		
		// 세터(수정자)
		roma.setOwnedBuiding(CityBuilding.VILLA);
		roma.setTax();
		System.out.println("로마 - 별장 : " + roma.getTax());
		
		roma.setOwnedBuiding(CityBuilding.HOTEL);
		roma.setTax();
		System.out.println("로마 - 호텔 : " + roma.getTax());
		
		roma.setOwnedBuiding(CityBuilding.BUILDING);
		roma.setTax();
		System.out.println("로마 - 빌딩 : " + roma.getTax());
	}
}
