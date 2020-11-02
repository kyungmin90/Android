package com.mega.mvc03;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class Movieservice {
	
	@Autowired
	MemberDAO dao;
	
	public int sale(int price) {
		if (price >= 10000) {
			price = price - 1000;
		}
		return price;
	}
	
	public String idchk(String id) {
		
		String[] id1 = {"root","admin","apple","melon","mint"};
		List<String> list = Arrays.asList(id1);
		
		String result = "<p id='blue'>사용가능</p>";
		
		if (list.contains(id)) {
			result = "<p id='red'>사용불가능</p>";
		}
		return result;
	
	}
	
	
	
	
}
