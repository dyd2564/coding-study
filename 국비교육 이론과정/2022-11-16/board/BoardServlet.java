package board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/board/*")
public class BoardServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	
	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String contextPath = request.getContextPath(); // pro10
		String uri = request.getRequestURI(); 
		String mapping = request.getServletPath();
		
//		System.out.println(contextPath);
//		System.out.println(uri);
//		System.out.println(mapping);
		uri = uri.substring(contextPath.length(), uri.length());
		String command = uri.substring(mapping.length(), uri.length());
		System.out.println(command);
		
		if(command.equals("/list")) {
			System.out.println("게시물 조회");
		} else if(command.equals("/write")) {
			System.out.println("글쓰기");
		} else if(command.equals("/update")) {
			System.out.println("글 수정");
		} else {
			System.out.println("존재하지 않는 페이지");
		}
		
		
	}

}
