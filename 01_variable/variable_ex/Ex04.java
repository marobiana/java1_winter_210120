package variable_ex;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// ctrl + 1 또는 ctrl + shift + o(자동 import)
		Scanner scan = new Scanner(System.in);
		
		System.out.print("육개장 가격을 입력하세요:");
		int noodleCup = scan.nextInt();
		System.out.println("육개장 가격은 " + noodleCup + "원");
		
		// 육개장 3개의 가격
		int noodleCup3 = noodleCup * 3;
		System.out.println("육개장 3개의 가격은 " + noodleCup3);
		
		// 육개장 N개의 가격
		System.out.print("육개장 개수를 입력하세요:");
		int count = scan.nextInt();
		int noodleCups = noodleCup * count;
		System.out.println("육개장 " + count + "개의 가격은 " + noodleCups + "원");
		
		scan.close();
	}

}
