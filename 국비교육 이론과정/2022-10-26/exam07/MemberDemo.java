package exam07;

import java.util.Arrays;

public class MemberDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Member member = new Member(1, "ȫ�浿", "hong@example.com", true);
		
		Member member2 = member.getCloneMember();
		System.out.println(member2);
		
		String s1 = "abcd";
		String s2 = s1;
		s1 = "b";
		System.out.println(s2);
		
		int a = 10;
		int b = a;
		a = 2;
		System.out.println(a);
		
		int[] arr = {1, 2, 3 ,4};
		int[] arr2 = arr;
		arr2[0] = 100;
		System.out.println(Arrays.toString(arr));
		
		
	}
}
