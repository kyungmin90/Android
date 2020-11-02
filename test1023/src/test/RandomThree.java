package test;

import java.util.Random;

public class RandomThree {

	public static void main(String[] args) {
		
	Random random = new Random();
	int a = 0;
	
	for (int i = 0; i < 3; i++) {
		a+=random.nextInt(100)+1;
	}
	System.out.println(a);
	}
}
