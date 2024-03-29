package sec04.ex04;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/member/ex04/views")
public class MemberViews extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		List<MemberVO> memberList = (List<MemberVO>) request.getAttribute("list");
		
		out.print("");
		out.print("<table border = 1><tr>");
		out.print("<th>회원번호</th><th>아이디</th>");
		out.print("<th>이름</th><th>패스워드</th>");
		out.print("<th>이메일</th><th>가입일</th></tr>");
		
		// 반복 구간
		for(MemberVO vo : memberList) {
			int mno = vo.getMno();
			String id = vo.getId();
			String password = vo.getPassword();
			String name = vo.getName();
			String email = vo.getEmail();
			Date joinDate = vo.getJoinDate();
			
			out.print("<tr><td>"+mno+"</td><td>"+id+"</td><td>"+name+"</td>");
			out.print("<td>"+password+"</td><td>"+email+"</td><td>"+joinDate+"</td></tr>");
		}
		
		out.print("</table>");
	}

}
