package quiz01;

import java.util.Scanner;

public class Quiz01_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("수를 입력하세요:");
		int number = scan.nextInt();
		
		if (number == 2) {
			// 2인 경우 소수이고 출력 후 종료된다.
			System.out.println("소수입니다.");
			return; // 프로그램 종료
		}
		
		boolean isPrime = true;
		for (int i = 2; i < number; i++) { // number보다 작은 수를 모두 나눠본다.
			if (number % i == 0) {
				// 소수가 아닌 경우 더이상 검사할 필요가 없으므로 반복문 종료
				isPrime = false;
				break;
			}
		}
		
		if (isPrime) {
			System.out.println("소수입니다.");	
		} else {
			System.out.println("소수가 아닙니다.");
		}
	}

}
