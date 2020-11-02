package 인터페이스;

public class 맨user {
public static void main(String[] args) {
	맨 s = new 스파이더맨();
	//변수의 타입 , 변수명
	//클래스명은 변수의 타입이 될 수 있나? 네!
	//인터페이스도 변수의 타입이 될 수 있다!!
	//인터페이스도 업캐스팅의 대상이 된다!.!
	
	//자동형변환(업캐스팅)
	s.run();
	s.eat();
	/* s.sky(); */
	}
}
