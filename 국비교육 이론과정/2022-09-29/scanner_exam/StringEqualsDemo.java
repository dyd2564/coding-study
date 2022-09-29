package scanner_exam;

public class StringEqualsDemo {
	public static void main(String[] args) {
		
		String str1 = new String("È«±æµ¿");
		String str2 = new String("È«±æµ¿");
		
		System.out.println(str1 == str2);      // ÂüÁ¶ °ª ºñ±³
		System.out.println(str1.equals(str2)); // °ª ºñ±³
		
		String str3 = "È«±æµ¿"; // °´Ã¼»ý¼º
		String str4 = "È«±æµ¿"; // °´Ã¼»ý¼º ¾Æ´Ô
		String str5 = "È«±æµ¿";
		System.out.println(str3 == str4);      // true
		System.out.println(str4 == str5);      // true
		
		System.out.println(str3.equals(str4)); // true
		System.out.println(str4.equals(str5)); // true
		
	}
}
