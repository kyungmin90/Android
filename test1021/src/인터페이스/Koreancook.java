package 인터페이스;

public class Koreancook implements ICook {

	@Override
	public void soup() {
		System.out.println("죽을 만들다");
	}

	@Override
	public void salad() {
		System.out.println("물김치를 만들다.");
	}

}
