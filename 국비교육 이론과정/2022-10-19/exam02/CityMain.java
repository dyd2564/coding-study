package exam02;

public class CityMain {

	public static void main(String[] args) {
		// ������
		City busan = new City("�λ�", 500000, false);
		City seoul = new City("����", 1000000, false);
		City roma = new City("�θ�", 320000,  true);
		
//		System.out.println(seoul);
//		System.out.println(roma);
		seoul.setTax();
		System.out.println("���� : " + seoul.getTax());
		busan.setTax();
		System.out.println("�λ� : " + busan.getTax());
		
		// ����(������)
		roma.setOwnedBuiding(CityBuilding.VILLA);
		roma.setTax();
		System.out.println("�θ� - ���� : " + roma.getTax());
		
		roma.setOwnedBuiding(CityBuilding.HOTEL);
		roma.setTax();
		System.out.println("�θ� - ȣ�� : " + roma.getTax());
		
		roma.setOwnedBuiding(CityBuilding.BUILDING);
		roma.setTax();
		System.out.println("�θ� - ���� : " + roma.getTax());
	}
}
