package quiz01;

import java.util.Scanner;

public class Quiz01_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("수를 입력하세요:");
		int number = scan.nextInt();
		
		// 1. for문
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("더한 결과는 " + sum + "입니다.");
		
		// 2. while문
		sum = 0;
		int i = 1;
		while (i <= number) {
			if (i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("더한 결과는 " + sum + "입니다.");
	}

}
