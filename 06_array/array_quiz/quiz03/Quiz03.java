package array_quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1.
//		int[] numbers = {3, 5, 2, 10, 39};
//		System.out.print("두 개의 index를 입력하세요:");
//		int index1 = scan.nextInt();
//		int index2 = scan.nextInt();
//		// swap
//		// temp = x
//		// x = y
//		// y = temp
//		int temp = numbers[index1];
//		numbers[index1] = numbers[index2];
//		numbers[index2] = temp; 
//		
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.print(numbers[i] + " ");
//		}
		
		// 2. 
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		Random rand = new Random();

		// 0번째 index와 random index와 교체를 100번 반복해서 뒤섞는다.     
		for (int i = 0; i < 100; i++) {
			int randIndex = rand.nextInt(10); // 0 ~ 9까지의 숫자를 랜덤으로 뽑는다.
			// swap 구현
			int temp = numbers[0];
			numbers[0] = numbers[randIndex];
			numbers[randIndex] = temp;
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		
		// 3. 빈도수
		int[] numbers = {5, 3, 2, 1, 2, 4, 3, 3, 2, 1};
		int[] freq = new int[6]; // 1~5까지의 숫자를 숫자와 같은 index에 저장하기 위해 6칸으로 만듦
		
		for (int i = 0; i < numbers.length; i++) {
			freq[numbers[i]] += 1;
		}
		
		for (int i = 1; i < freq.length; i++) {
			// 1 : 2개
			System.out.println(i + ":" + freq[i] + "개");
		}
		
	}

}



