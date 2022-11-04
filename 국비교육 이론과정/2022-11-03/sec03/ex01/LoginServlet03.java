package sec03.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;


@WebServlet("/login3")
public class LoginServlet03 extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet()");
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost()");
		// POST 방식으로 요청할 때에는 반드시 인코딩 설정을 해야함.
		req.setCharacterEncoding("utf-8"); // 한글 인코딩
		resp.setContentType("text/html;charset=utf-8"); // 마임타입지정
		PrintWriter out = resp.getWriter();
		
		String id = req.getParameter("user_id");
		String pw = req.getParameter("user_pw");
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + pw);
		
		StringBuffer sb = new StringBuffer();
		sb.append("아이디 : " + id + "<br>");
		sb.append("비밀번호 : " + pw + "<br>");
		out.print(sb);
		
	}

}
