package loop_quiz;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. 합 구하기
		System.out.print("수를 입력하세요:");
		int number = scan.nextInt();
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// 2. 팩토리얼
		System.out.print("수를 입력하세요:");
		number = scan.nextInt();
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact *= i;
		}
		System.out.println(fact);
		
		// 3. 약수 구하기
		System.out.print("수를 입력하세요:");
		number = scan.nextInt();
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
