package test;

import java.util.Random;

public class RanArray {

	public static void main(String[] args) {
		Random random = new Random();
		int[] a = new int[100];
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(100)+1;
			
				if (i%2==1) {
					sum += a[i];
				}
		}
		System.out.println("홀수열 합은: "+sum);
	}

}
