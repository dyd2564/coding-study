package exam01;

public class Student {

	String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		Student st = (Student) obj;
		if (st.name.equals(this.name)) {
			return true;
		}
		
		return false;
	}



	public static void main(String[] args) {
		Student s1 = new Student("��ö��");
		// Ÿ�� �������� = new ������
		Student s2 = new Student("��ö��");
		// s1, s2 : �������� -> ����(stack)����
		// s1��ü, s2��ü -> ��(Heap)����
		System.out.println(s1);
		System.out.println(s2);
		
		// ������ ��(�񱳿����� ==)
		System.out.println(s1==s2);
		
		// ��ü�� �� ��(equals �޼ҵ�)
		System.out.println(s1.equals(s2));
		
		String str1 = "ȫ�浿";
		String str2 = new String("ȫ�浿");
	}
}
