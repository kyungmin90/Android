package 인터페이스;

public class 액션처리클래스 implements MyAction {

	public void click() {
		System.out.println("클릭하면 인터넷으로 연결");
	}
	
	public void doubleclick() {
		System.out.println("더블클릭하면 니킥 횟수가 10개 적립");
	}
	
}
