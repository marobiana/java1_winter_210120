package nested_loop_quiz;

public class Quiz01 {

	public static void main(String[] args) {
		// 1. 주사위 문제
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				System.out.print("(" + i + "," + j + ")");
			}
			System.out.println();
		}
		
		// 2. 구구단
		// 앞의 수: 2 ~ 9, 곱해지는 수: 1 ~ 9
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + i * j);
			}
		}
		
		// 3. 별찍기
		// *      - 1번째 행, 별 1개
		// **     - 2번째 행, 별 2개
		// ***
		// ****
		// *****  - 5번째 행, 별 5개
		// 행과 별의 개수가 같다.
		for (int i = 1; i <= 5; i++) { // 행
			for (int j = 1; j <= i; j++) { // 별 - 행의 개수까지만 반복문을 돌린다.
				System.out.print("*");
			}
			System.out.println(); // 행이 끝날 때마다 줄바꿈
		}
	}

}
