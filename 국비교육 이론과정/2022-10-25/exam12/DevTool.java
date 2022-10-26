package exam12;

public class DevTool {
	public static class Java{
		public String jdk = "11";
	}
	
	protected static class Jsp{
		public Jsp() {}
		public String servlet = "2.3";
	}
	
	static class MySQL{
		public String version = "5.7";
	}
	
	private class Spring{
		public String version = "5.0";
	}
	
	void methodA() {
		System.out.println(new Java().jdk);
		System.out.println(new Jsp().servlet);
		System.out.println(new MySQL().version);
		System.out.println(new Spring().version);
	}
	
}
