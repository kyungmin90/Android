package 추상클래스;

//추상클래스는 객체 생성 불가능
public abstract class ApplePhone implements MegaPhone {
	String tel = "010-1111-2222";

	// 추상메서드가 하나라도 포함되어 있으면,
	// 추상클래스라고 부른다.!
	public abstract void camera();

	@Override // 재정의
	public void internet() {
		System.out.println(tel + "애플폰으로 인터넷하다.");
	}

	@Override
	public void call() {
		System.out.println("애플폰으로 전화하다..");
	}

	@Override
	public void text() {
		System.out.println("애플폰으로 문자하다...");
	}

	@Override
	public void kakao() {
		System.out.println("애플폰으로 카카오하다....");
	}

	@Override
	public void map() {
		System.out.println("애플폰으로 맵하다.....");
	}

	@Override
	public void siri() {
		System.out.println("애플폰으로 시리하다......");
	}

}
