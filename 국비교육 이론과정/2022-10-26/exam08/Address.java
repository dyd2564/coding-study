package exam08;

public class Address {
	private String state;
	private String city;
	private String zip;
	
	
	public Address(String state, String city, String zip) {
		this.state = state;
		this.city = city;
		this.zip = zip;
	}

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}

	
	@Override
	public String toString() {
		return "Address [state=" + state + ","
				+ " city=" + city + ", zip=" + zip + "]";
	}
	
	
	
	
	
	
}
