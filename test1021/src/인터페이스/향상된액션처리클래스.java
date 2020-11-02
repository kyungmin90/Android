package 인터페이스;

public class 향상된액션처리클래스 implements MyAction {
	public void click() {
		System.out.println("보안 강화 상태로 인터넷으로 연결");
	}
	
	public void doubleclick() {
		System.out.println("화면에 경고메시지를 띄운 후 화면을 닫음");
	}
}
