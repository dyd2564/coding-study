package scanner_exam;

public class StringConcatExam {
	public static void main(String[] args) {
		String str1 = "JDK" + 3 + 3.0; // JDK33.0
		String str2 = 3 + 3.0 + "JDK"; // 6.0JDK
				
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
	}
}
