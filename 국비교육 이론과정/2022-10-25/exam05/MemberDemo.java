package exam05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberDemo {
	public static void main(String[] args) {
		
		String[] memberArr = new String[5];
		List<String> members = new ArrayList<String>();
		
		System.out.println(memberArr); // �������� ���ڿ��� ��ȯ
		System.out.println(members); // ���� ��Ҹ� ���ڿ��� ��ȯ
		System.out.println();
		
		// ��� �߰�
		memberArr[0] = "ȫ�浿";
		memberArr[1] = "��浿";
		memberArr[2] = "�ڱ浿";
		memberArr[3] = "�ű浿";
		memberArr[4] = "���浿";
//		memberArr[5] = "��浿"; // ���� �߻�
		members.add("ȫ�浿");
		members.add("��浿");
		members.add("�ڱ浿");
		members.add("�ű浿");
		members.add("���浿");
		members.add("��浿");
		System.out.println(Arrays.toString(memberArr)); // �������� ���ڿ��� ��ȯ
		System.out.println(members); // ���� ��Ҹ� ���ڿ��� ��ȯ
		System.out.println();
	}
}
