package quiz01;

import java.util.Scanner;

public class Quiz01_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("세 개의 수를 입력하세요:");
		int a = scan.nextInt();
		int d = scan.nextInt();
		int n = scan.nextInt();
		
		// (1)
		//int result = a + d * (n-1);     
		
		// (2)
		int result = a;
		for (int i = 0; i < n - 1; i++) { // 첫번째(n이 1)이면 반복이 없으므로 n-1
			result += d;
		}
		System.out.println(result);
	}

}
