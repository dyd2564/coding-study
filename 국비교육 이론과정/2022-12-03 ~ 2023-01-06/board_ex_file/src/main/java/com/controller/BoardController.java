package com.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FileUtils;

import com.common.FileUpload;
import com.dao.BoardDao;
import com.domain.BoardVO;
import com.service.BoardService;

@WebServlet("/board/*")
public class BoardController extends HttpServlet {
	
	private BoardService service;
	private FileUpload mutiReq; 
	
	@Override
	public void init() throws ServletException {
		BoardDao dao = new BoardDao(); 
		service = new BoardService(dao);
		mutiReq = new FileUpload("board/");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	
	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pathInfo = request.getPathInfo(); 
		String contextPath = request.getContextPath();
		final String PREFIX = "/WEB-INF/views/board/";
		final String SUFFIX = ".jsp";
		
		RequestDispatcher rd = null;
		String nextPage =null;		
		
		// 글목록
		if(pathInfo==null || pathInfo.equals("/") || pathInfo.equals("/list")) {
			List<BoardVO> boardList = service.boardList();
			request.setAttribute("list", boardList);
			nextPage = "list";
		}
		
		// 글상세
		else if(pathInfo.equals("/detail")) {
			String paramBno = request.getParameter("bno");
			int bno = Integer.parseInt(paramBno);
			BoardVO board = service.findBoard(bno);
			request.setAttribute("board", board);
			nextPage = "detail";
		}
		
		// 글쓰기폼
		else if(pathInfo.equals("/writeForm")) {
			nextPage = "writeForm";
		} 
		
		// 글쓰기 처리 
		else if(pathInfo.equals("/write")) {
			Map<String, String> req = mutiReq.getMutipartRequest(request);
			
			String imageFileName = req.get("imageFileName");
			
			BoardVO vo = BoardVO.builder()
					.title(req.get("title"))
					.content(req.get("content"))
					.writer(req.get("writer"))
					.imageFileName(req.get("imageFileName"))
					.build();
			int boardNO = service.addBoard(vo);
			
			// 이미지파일을 첨부한 경우
			if(imageFileName!=null && imageFileName.length()>0 ) {
				mutiReq.uploadImage(boardNO, imageFileName);
			}
			response.sendRedirect(contextPath+"/board");
			return; 
		}
		
		// 글 수정 처리 
		else if(pathInfo.equals("/modBoard")) {
			Map<String, String> req = mutiReq.getMutipartRequest(request);
			String paramBno = req.get("bno");
			int bno = Integer.parseInt(paramBno);
			String title = req.get("title");
			String content = req.get("content");
			String imageFileName = req.get("imageFileName");
			
			BoardVO vo = BoardVO.builder()
					.bno(bno)
					.title(title)
					.content(content)
					.imageFileName(imageFileName)
					.build();
			service.modBoard(vo);
			
			if(imageFileName!=null) { // 이미지 파일이 있을 때 
				String originFileName = req.get("originFileName");
				// 새로운 이미지 업로드 
				mutiReq.uploadImage(bno, imageFileName);
				// 기존 이미지 삭제
				if(originFileName!=null) {
					File oldFile = new File("c:/file_repo/"+bno+"/"+originFileName);
					oldFile.delete();
				}
			}
			response.sendRedirect(contextPath+"/board");
			return;
		}
		
		else if(pathInfo.equals("/removeBoard")) {
			Map<String, String> req = mutiReq.getMutipartRequest(request);
			String paramBno = req.get("bno");
			int bno = Integer.parseInt(paramBno);
			service.removeBoard(bno);
			mutiReq.deleteAllImage(bno);
			response.sendRedirect(contextPath+"/board");
			return; 
		}
		
		else {
			System.out.println("존재하지 않는 페이지");
		}
		
		rd = request.getRequestDispatcher(PREFIX+nextPage+SUFFIX);
		rd.forward(request, response);
	}
	
}
