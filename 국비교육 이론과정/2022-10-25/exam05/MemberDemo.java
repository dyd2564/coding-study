package exam05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberDemo {
	public static void main(String[] args) {
		
		String[] memberArr = new String[5];
		List<String> members = new ArrayList<String>();
		
		System.out.println(memberArr); // 참조값을 문자열로 반환
		System.out.println(members); // 내부 요소를 문자열로 반환
		System.out.println();
		
		// 요소 추가
		memberArr[0] = "홍길동";
		memberArr[1] = "김길동";
		memberArr[2] = "박길동";
		memberArr[3] = "신길동";
		memberArr[4] = "나길동";
//		memberArr[5] = "고길동"; // 예외 발생
		members.add("홍길동");
		members.add("김길동");
		members.add("박길동");
		members.add("신길동");
		members.add("나길동");
		members.add("고길동");
		System.out.println(Arrays.toString(memberArr)); // 참조값을 문자열로 반환
		System.out.println(members); // 내부 요소를 문자열로 반환
		System.out.println();
	}
}
