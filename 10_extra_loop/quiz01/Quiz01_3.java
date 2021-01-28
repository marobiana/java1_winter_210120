package quiz01;

import java.util.Scanner;

public class Quiz01_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int min = 1000;
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + "번째 수를 입력하세요:");
			int number = scan.nextInt();
			if (min > number) {
				min = number;
			}
		}
		System.out.println("최소값은 " + min + "입니다.");
	}

}
