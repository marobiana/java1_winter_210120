package condition_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
//		3, 4, 5	봄
//		6, 7, 8	여름
//		9, 10, 11	가을
//		12, 1, 2	겨울
		Scanner scan = new Scanner(System.in);
		System.out.print("월을 입력하세요:");
		int month = scan.nextInt();
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("겨울");
		}
	}

}
