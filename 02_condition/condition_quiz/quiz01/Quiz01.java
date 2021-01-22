package condition_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. 숫자 비교
		System.out.print("숫자를 입력하세요:");
		int number = scan.nextInt();
		if (number == 10) {
			System.out.println("10과 같습니다.");
		}
		if (number > 10) {
			System.out.println("10보다 큽니다.");
		}
		if (number < 10) {
			System.out.println("10보다 작습니다.");
		}
		
		// 2. 수 비교
		System.out.print("두 개의 수를 입력하세요:");
		int a = scan.nextInt();
		int b = scan.nextInt();
		if (a == b) {
			System.out.println("a와 b는 같습니다.");
		}
		if (a > b) {
			System.out.println("a가 더 큽니다.");
		}
		if (a < b) {
			System.out.println("b가 더 큽니다.");
		}
		
		// 3. 시험 합격
		System.out.print("성적을 입력하세요:");
		int score = scan.nextInt();
		if (score >= 70) {
			System.out.println("합격입니다.");
		}
		
		// 4. 홀짝 검사
		System.out.print("수를 입력하세요:");
		int num = scan.nextInt();
		if (num % 2 == 0) {
			System.out.println("짝수");
		}
		if (num % 2 != 0) {
			System.out.println("홀수");
		}
	}

}
