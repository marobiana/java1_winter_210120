package variable_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 1.
		// 입력1 : 843
		// 입력2 : 8
		// 몫 : 105 나머지 : 3
		Scanner scan = new Scanner(System.in);
//		System.out.print("입력1:");
//		int number1 = scan.nextInt();
//		System.out.print("입력2:");
//		int number2 = scan.nextInt();
//		int quotient = number1 / number2; 
//		int remainder = number1 % number2;
//		System.out.println("몫:" + quotient + " 나머지 :" + remainder);
		
		// 2. 교체
//		System.out.print("x:");
//		int x = scan.nextInt();  // x: 6
//		System.out.print("y:");  
//		int y = scan.nextInt();  // y: 4
		// x는 4이고, y는 6 입니다.
		//System.out.println("x는 " + y + "이고, y는 " + x + "입니다.");
		
		// swap 알고리즘
//		int temp = x;
//		x = y;
//		y = temp;
//		System.out.println("x는 " + x + "이고, y는 " + y + "이다.");
		
		// 3. 초를 입력 받아서 ?분?초 형태로 출력 하세요.
//		System.out.print("초:");
//		int seconds = scan.nextInt();
//		int min = seconds / 60;
//		int sec = seconds % 60;
//		System.out.println(min + "분 " + sec + "초");
		
		// 4. 네 자리수 숫자를 입력 받아서 천의 자리부터 한줄씩 출력 하세요.
		// 1234 / 1000 => 1.234   몫:1  나머지:234
		// 234 / 100   => 2.34   몫:2 나머지:34
		// 34 / 10     => 3.4   몫:3 나머지:4
//		System.out.print("입력:");
//		int number = scan.nextInt();  // 1234
//		
//		int q = number / 1000;    // 1
//		int r = number % 1000;    // 234
//		System.out.println(q);
//		
//		q = r / 100;   // 2
//		r = r % 100;   // 34
//		System.out.println(q);
//		
//		// 34 / 10     => 3.4   몫:3 나머지:4
//		q = r / 10;  // 3
//		r = r % 10;  // 4
//		System.out.println(q);
//		System.out.println(r);
		
		// 5.
		// 1234 / 1000 => 1.234   몫:1  나머지:234
		// 234 / 100   => 2.34   몫:2 나머지:34
		// 34 / 10     => 3.4   몫:3 나머지:4
		System.out.print("입력:");
		int number = scan.nextInt();
		int sum = 0;
		int q = number / 1000; // 1
		int r = number % 1000; // 234
		sum = q;
		
		q = r / 100;  // 2
		r = r % 100;  // 34
		sum = sum + q;
		
		q = r / 10;  // 3
		r = r % 10;  // 4
		sum = sum + q;
		sum = sum + r;
		System.out.println("합계는" + sum + "입니다.");
		
		scan.close();
	}

}
