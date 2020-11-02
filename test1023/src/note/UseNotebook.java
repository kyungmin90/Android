package note;

public class UseNotebook {

	public static void main(String[] args) {
		Gram g= new Gram();
	
		g.on();
		g.bConnect();
		g.wConnect();
		g.camera();
		System.out.println("제조사는 "+g.COMPANY);
	
	}

}
