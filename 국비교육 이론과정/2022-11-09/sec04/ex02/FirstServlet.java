package sec04.ex02;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/first7")
public class FirstServlet extends HttpServlet {

	// HttpServletRequest의 유효범위 : 다음 요청까지
	// sendRedirect
	// 첫 번째 서블릿 -> 웹브리우저 -> 두 번째 서블릿
	// 첫 번째 서블릿 -> 두 번째 서블릿
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		System.out.println("첫 번째 서블릿");
		request.setAttribute("address", "서울시 성북구");
		RequestDispatcher rb = request.getRequestDispatcher("/second7");
		rb.forward(request, response);
		}

	

}
