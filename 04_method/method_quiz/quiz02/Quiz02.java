package method_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
    		// 메소드를 만드는 이유: 
		// (1) 중복되는 코드를 한곳에 만들고 재활용한다
		// (2) main에 있는 코드 흐름을 다 분석하지 않아도, 메소드명을 잘 만들면 무슨 맥락인지 빨리 파악이 가능해진다.

   		// 1. 합 구하기
		Scanner scan = new Scanner(System.in);
		System.out.print("수를 입력하세요:");
		int num = scan.nextInt();
		System.out.println(getSumUntilNumber(num));

		// 2. 최소값
		System.out.print("5개의 수를 입력하세요:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int num4 = scan.nextInt();
		int num5 = scan.nextInt();
		printMin(num1, num2, num3, num4, num5);
		
		// 3. 소수 판별
		System.out.print("수를 입력하세요:");
		num = scan.nextInt();
		System.out.println(isPrimeNumber(num));
	}
	
	// 1. 합 구하기
	public static int getSumUntilNumber(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
			if (sum > 100) {
				break;
			}
		}
		return sum;
	}
	
	// 2. 최소값
	public static void printMin(int num1, int num2, int num3, int num4, int num5) {
		int min = num1;
		if (min > num2) {
			min = num2;
		}
		if (min > num3) {
			min = num3;
		}
		if (min > num4) {
			min = num4;
		}
		if (min > num5) {
			min = num5;
		}
		
		System.out.println("최소값은 " + min);
	}
	
	// 3. 소수 판별
	public static boolean isPrimeNumber(int num) {		
		for (int i = 2; i < num; i++) {
			// 하나라도 나누어 떨어지면 소수가 아니다.
			if (num % i == 0) {
				return false;
			}
		}
		
		// 여기까지 도달하면 나누어진 수가 없었으므로 소수이다.
		// 2의 경우 반복문 안에 안들어가므로 소수
		return true;
	}

}
