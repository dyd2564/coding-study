package exam11.modifier;

public class Sports {

	public class BaseBall{} // 프로젝트 내 어디서나
	protected class BasketBall{

		public BasketBall() {
		}
	} // 동일패키지 또는 상속관계에 있는 클래스
	class FootBall{} // 동일패키지
	private class VolleyBall{} // 클래스 내부에서만
	
	// 클래스 내부 : 모든 접근제한자에 접근가능
	void methodA() {
		new BaseBall();
		new BasketBall();
		new FootBall();
		new VolleyBall();
	}
}
