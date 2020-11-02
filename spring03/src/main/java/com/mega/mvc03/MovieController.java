package com.mega.mvc03;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {
	
	@Autowired
	Movieservice service;
	
	
	@RequestMapping("id.do")
	public void idchk(String id, Model model) {
		String result = service.idchk(id);
		model.addAttribute("result", result);
	
	}
	
	
	
	
	@RequestMapping("reply.do")
	public void reply(String reply, Model model) {
		//db처리
		//view로 넘김
		model.addAttribute("reply", reply);
	}
	
	
	
	@RequestMapping("movie.do")
	public String movie(String title, int price, Model m) {
		
		price = service.sale(price);
		
		System.out.println(title);
		System.out.println(price);
		
		m.addAttribute("title", title);
		m.addAttribute("price", price);
		
		return "like";
	}
}
