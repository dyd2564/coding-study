package sec06.ex02;

import java.io.IOException;
import java.io.ObjectInputFilter.Config;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/loadOntest"}, loadOnStartup = 2)
public class LoadOnTest extends HttpServlet{

	
	
	public LoadOnTest() {
		System.out.println("LoadOnTest 객체 생성");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("LoadOnTest : init 메서드 호출");
		
	}
	
	
}
