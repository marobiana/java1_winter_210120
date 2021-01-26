package loop_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. 수를 입력 받아서 그 수만큼 "화이팅!!!" 를 출력하세요
//		System.out.print("횟수를 입력하세요:");
//		int count = scan.nextInt();  // 4
//		int i = 0;
//		while (i < count) {  // 0 1 2 3 => 4번
//			System.out.println("화이팅!!!");
//			i++;
//		}
		
		// 2. 카운트 다운
//		System.out.print("카운트 다운 수를 입력하세요:");
//		int countDown = scan.nextInt();  // 3 
//		while (countDown >= 0) {  // 3 2 1 0   
//			System.out.println(countDown);
//			countDown--;
//		}
//		System.out.println("발사");
		
		// 3. 
//		수를 입력하세요: 4
//		출력 : 4
//		int i = 0;
//		while (i < 5) {
//			System.out.print("수를 입력하세요:");
//			int number = scan.nextInt();
//			System.out.println("출력:" + number);
//			i++;
//		}
		
		// 4. 
		// 3 X 1 = 3
		int num = 3;
		int i = 1;
		while (i <= 9) {
			System.out.println(num + " X " + i + " = " + (num * i));
			i++;
		}
	}

}
