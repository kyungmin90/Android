package com.mega.mvc02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@RequestMapping("insert.do")
	public void member(String user, String id, String pw) {
		System.out.println("이름: " + user);
		System.out.println("아이디: " + id);
		System.out.println("비밀번호: " + pw);
	//DB처리
		String result = "회원가입 성공";
		if (user.isEmpty() || id.isEmpty() || pw.isEmpty()) {
			result = "회원가입 실패!";
		}
		System.out.println(result);
		
	}
}
