package 인터페이스;

public class CookManager {
	ICook cook;
	
	public CookManager(String food) {
		if (food.equals("한식")) {
			cook = new Koreancook();
		}else {
			cook = new Chinesecook();
		}
		
	}
	
	public void soup() {
		cook.soup();
	}
	public void salad() {
		cook.salad();
	}
}
