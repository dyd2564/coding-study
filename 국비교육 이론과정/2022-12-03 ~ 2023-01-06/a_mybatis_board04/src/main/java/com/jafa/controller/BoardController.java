package com.jafa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jafa.domain.BoardVO;
import com.jafa.domain.Category;
import com.jafa.repository.BoardRepository;

import lombok.extern.log4j.Log4j;

@RequestMapping("/board")
@Controller
@Log4j
public class BoardController {

	@Autowired
	BoardRepository repository;
	
	@ModelAttribute("cateList")
	public List<Category> cateList(){
		return repository.getCateList();
	}
	
	@GetMapping(value = {"/list/{cid}","/list"})
	public String list(Model model, @PathVariable(required = false) String cid) {
		model.addAttribute("list", repository.list(cid));
		return "board/list";
	}
	
	@GetMapping("/write")
	public String writeForm() {
		return "board/write";
	}
	
	@PostMapping("/write")
	public String write(BoardVO vo, RedirectAttributes rttr) {
		repository.write(vo);
		return "redirect:list";
	}
	
}
