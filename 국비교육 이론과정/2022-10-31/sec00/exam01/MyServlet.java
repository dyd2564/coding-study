package sec00.exam01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// sec00.exam01.MyServlet
public class MyServlet extends HttpServlet {

	public MyServlet() {
		System.out.println("MyServlet : 서블릿 생성");
	}
	
	@Override
	public void init() throws ServletException {
		// 최초 요청 시 초기화 작업 수행
		System.out.println("초기화 작업 수행");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// GET 방식 요청 시 실행
		System.out.println("doGet() 메소드 실행");
	}
	
	
}
