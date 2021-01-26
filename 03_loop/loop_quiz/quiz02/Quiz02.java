package loop_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// 1. 35 ~ 40 까지 출력 하세요
		for (int i = 35; i <= 40; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\n");
		
		// 2. 5 4 3 2 1 0 -1 -2 -3 -4 -5 
		for (int i = 5; i >= -5; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 3. 1 ~ 50 사이에 3의 배수만 출력하세요.
		for (int i = 1; i <= 50; i++) {    // 1 ~ 50
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		for (int i = 3; i <= 50; i += 3) { 
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 4. 1 ~ 100 사이에 7의 배수 갯수를 구하세요.
		int count = 0;
		for (int i = 1; i <= 100; i++) {  // 1 ~ 100 : 100번
			if (i % 7 == 0) {
				count++;
			}
		}
		System.out.println(count);
		
		count = 0;
		for (int i = 7; i <= 100; i += 7) {   // 14번
			count++;
		}
		System.out.println(count);
		
		// 5. 구구단
		Scanner scan = new Scanner(System.in);
		System.out.print("단수를 입력하세요:");
		int number = scan.nextInt();
		for (int i = 1; i <= 9; i++) {
			System.out.println(number + " X " + i + " = " + (number * i));
		}
	}

}

