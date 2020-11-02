package test;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력해주세요>> ");
		String num = scan.next();
		
		if (num.length() >=5) {
			System.out.println("유효");
		}else {
			System.out.println("무효");
		}

	}

}
