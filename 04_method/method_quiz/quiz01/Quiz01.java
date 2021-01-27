package method_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. 정수를 입력 받아서 2제곱의 결과를 돌려주는 함수를 만들고 호출한 값을 출력하세요.
//		System.out.print("제곱값을 구할 숫자를 입력하세요:");
//		int number = scan.nextInt();
//		int result = getSquared(number);
//		System.out.println(result);
		
		// 2. 평균
//		System.out.print("점수 4개를 입력하세요:");
//		int score1 = scan.nextInt();
//		int score2 = scan.nextInt();
//		int score3 = scan.nextInt();
//		int score4 = scan.nextInt();
//		double average = getAverage(score1, score2, score3, score4);
//		System.out.println("평균은 " + average);
		
		// 3. 몫과 나머지
//		System.out.print("숫자와 나눌 수를 입력하세요:");
//		int number1 = scan.nextInt();
//		int number2 = scan.nextInt();
//		printQuotientRemainder(number1, number2);
		
		// 4. 정수를 입력 받아서 짝수면 0 홀수면 1을 돌려 주는 함수를 만드세요.
		System.out.print("수를 입력하세요:");
		int number = scan.nextInt();
		
		System.out.println(evenOdd(number));
	}
	
	// 1
	public static int getSquared(int x) {
		return x * x;
	}
	
	// 2
	public static double getAverage(int score1, int score2, int score3, int score4) {
		return (score1 + score2 + score3 + score4) / 4.0;
	}
	
	// 3
	public static void printQuotientRemainder(int number1, int number2) {
		int q = number1 / number2;
		int r = number1 % number2;
		
		System.out.println("몫:" + q);
		System.out.println("나머지:" + r);
	}
	
	// 4
	public static int evenOdd(int number) {
//		if (number % 2 == 0) {
//			return 0;
//		} 
//		return 1;
		
		return number % 2 == 0 ? 0 : 1;  // 삼항 조건문
	}

}
