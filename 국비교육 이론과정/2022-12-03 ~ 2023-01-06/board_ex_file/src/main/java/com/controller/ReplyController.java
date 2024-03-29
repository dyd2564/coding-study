package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.domain.ReplyVO;
import com.google.gson.Gson;
import com.service.ReplyService;

@WebServlet("/reply/*")
public class ReplyController extends HttpServlet {
	
	private ReplyService service; 
	private Gson gson; 
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		ServletContext sc = config.getServletContext();
		service = (ReplyService) sc.getAttribute("replyService");
		gson = new Gson();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String pathInfo = request.getPathInfo(); 
		String contextPath = request.getContextPath();
		
		if(pathInfo.equals("/list")) {
			String paramBno = request.getParameter("bno");
			int bno = Integer.parseInt(paramBno);
			List<ReplyVO> replyList = service.list(bno);
			System.out.println(replyList);
		
			out.print(gson.toJson(replyList));
			
		} else if(pathInfo.equals("/write")) {
			String paramBno = request.getParameter("bno");
			
			long currenTime = System.currentTimeMillis();
			HttpSession session = request.getSession(false);
			if(session.getAttribute("lastWriting")!=null) { // 마지막에 글을 쓴 시간이 있다면
				long lastWriting = (long) session.getAttribute("lastWriting");
				if(currenTime-lastWriting<3000) {
					out.print(gson.toJson("도배하지마세요~"));
					return;
				}
			}
			// 마지막에 글을 쓴 시간이 없다면
			session.setAttribute("lastWriting", currenTime);
			
			ReplyVO vo = ReplyVO.builder()
					.bno(Integer.parseInt(paramBno))
					.reply(request.getParameter("reply"))
					.writer(request.getParameter("writer")).build();
			
			service.writer(vo);
			String result = gson.toJson("댓글 등록 성공");
			out.print(result);
		}
		
	}

	

}
