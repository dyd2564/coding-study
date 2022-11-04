package sec01.ex04;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/board")
public class BoardServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doHandle(req, resp);
	}

	private void doHandle(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		String command = req.getParameter("command");
		
		BoardDao dao = new BoardDao();
		
		if(command!=null && command.equals("boardJoin")) { // 게시판 등록
			String bNo = req.getParameter("bno");
			String title = req.getParameter("title");
			String content = req.getParameter("content");
			String email = req.getParameter("writter");
			dao.addBoard(new BoardVO(bNo, title, content, email));
			resp.sendRedirect("/pro07/board_index.html"); // 지정된 페이지로 이동
			// 아래 코드는 실행되지 않음
		} else {
			List<BoardVO> listBoards = dao.listBoards();
			
			out.print("");
			out.print("<table border=1><tr>");
			out.print("<th>게시물 번호</th>");
			out.print("<th>게시물 제목</th>");
			out.print("<th>게시물 내용</th>");
			out.print("<th>작성자</th>");
			out.print("<th>게시일</th>");
			out.print("<th>수정일</th></tr>");
			
			// 반복구간
			for(BoardVO vo : listBoards) {
				
				out.print("<tr><td>"+vo.getbNo()+"</td>");
				out.print("<td>"+vo.getTitle()+"</td><td>"+vo.getContent()+"</td>");
				out.print("<td>"+vo.getWritter()+"</td><td>"+vo.getRegDate()+"</td>");
				out.print("<td>"+vo.getUpdateDate()+"</td></tr>");
				
			}
			out.print("</table>");
			
		}
		
		
	
		
	}


}
