package loop_ex;

public class Ex01 {

	public static void main(String[] args) {
		// do-while: 조건문의 조건이 거짓이어도 무조건 한번 수행한다.
		// 조건문이 참이면 while문과 똑같이 수행된다.
//		int i = 0;
//		do {
//			System.out.println("Hello world! " + i);
//			i++;
//		} while (i < 0); // 0 1 2 => 3번
		
		// for 문
		// for (초기식; 조건; 증감식) {반복 수행문}
		
		// 0 ~ 4: 5번    0 1 2 3 4
		for (int i = 0; i < 5; i++) {
			System.out.println("안녕하세요 " + i);
		}
		
		// 1 ~ 5: 5번    1 2 3 4 5
		for (int i = 1; i <= 5; i++) {
			System.out.println("hello world " + i);
		}
		
		// 5 ~ 1: 5번   5 4 3 2 1
		for (int i = 5; i >= 1; i--) {
			System.out.println("안녕 " + i);
		}
		
		// 1+2+3+4+5+6+7+8+9+10
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			//sum = sum + i;
			sum += i;
		}
		System.out.println(sum);
	}
}
