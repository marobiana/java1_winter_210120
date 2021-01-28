package quiz01;

import java.util.Scanner;

public class Quiz01_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print("수를 입력하세요:");
			int number = scan.nextInt();
			if (max < number) {
				max = number;
			}
		}
		
		System.out.println("가장 큰 수는 " + max + "입니다.");
	}

}
