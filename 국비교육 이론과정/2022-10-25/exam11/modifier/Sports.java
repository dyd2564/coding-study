package exam11.modifier;

public class Sports {

	public class BaseBall{} // ������Ʈ �� ��𼭳�
	protected class BasketBall{

		public BasketBall() {
		}
	} // ������Ű�� �Ǵ� ��Ӱ��迡 �ִ� Ŭ����
	class FootBall{} // ������Ű��
	private class VolleyBall{} // Ŭ���� ���ο�����
	
	// Ŭ���� ���� : ��� ���������ڿ� ���ٰ���
	void methodA() {
		new BaseBall();
		new BasketBall();
		new FootBall();
		new VolleyBall();
	}
}
