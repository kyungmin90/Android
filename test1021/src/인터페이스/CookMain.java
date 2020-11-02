package 인터페이스;

import javax.swing.JOptionPane;

public class CookMain {

	public static void main(String[] args) {
		String food = JOptionPane.showInputDialog("뭐 먹으실");
		CookManager m = new CookManager(food);
		m.soup();
		m.salad();
	}

}
