package 인터페이스;

import java.util.ArrayList;

public class 캐스팅확인 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		//Object(부모가 크고)-- String, 맨, 슈퍼맨(작고) --> 자동형변환(upcasting)
		list.add("등산");
		list.add(new 맨());
		list.add(new 슈퍼맨());
		
		//String(작고) -- Object(크고) --> 강제형변환(downcasting)
		String l1 = (String)list.get(0);
		맨 m1 = (맨)list.get(1);
		슈퍼맨 m2 = (슈퍼맨)list.get(2);
		
	}

}
