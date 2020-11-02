package com.mega.mvc05;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
		
		@Autowired
		BbsService service;
		
	
		@RequestMapping("insert.do")
		public void insert(BbsVO bbsVO, HttpSession session) {
			// 입력값으로 vo를 설정하는 경우
			// 1) 객체생성: prototype 방법
			// 2) input name 속성과 동일한 set메서드를 자동으로 호출
			// 3) 변수 이름을 클래스 이름에서 첫글자를 소문자로 지정하는 경우 자동으로 vo를 model 속성으로 지정
			//	  views 아래 jsp파일에서 model 속성값을 꺼내 쓸 수 있음
			System.out.println(bbsVO.getNo());
			System.out.println(bbsVO.getTitle());
			System.out.println(bbsVO.getWriter());
			System.out.println(bbsVO.getContents());
			
			// Model은 한번의 request와 response를 하고 사라진다.
			// 여러번의 request 마다 특정한 값을 유지, 사용하고 싶으면 session으로 설정해야한다!!!
			session.setAttribute("bbsVO2", bbsVO);
		}
		
		@RequestMapping("update.do")
		public void update(Model model) {
			//db처리가 들어가야 하는 경우 반드시 controller를 거쳐야한다.
			//db검색해서 가지고 온다.
			//검색한 결과를 views에 있는 update.jsp로 넘겨야한다.
			model.addAttribute("result","검색결과!!");
			
		}
		
		@RequestMapping("delete.do")
		public void delete(Model model) {
			//db처리하고
			//views로 넘어간다!
			model.addAttribute("result","삭제완료");
		}
	
}
