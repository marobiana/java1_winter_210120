package loop_ex;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		
		// while 반복문을 이용해서 "안녕하세요" 3번 찍기
		int i = 0;
		while (i < 3) {   // 0 1 2 => 3번
			System.out.println("안녕하세요 " + i);
			//i = i + 1;
			//i += 1;
			i++;
		}
		
		// i++ ++i 의 차이점
		i = 100;
		System.out.println("i:" + (++i));  // 101
		System.out.println("i:" + i++);    // 예상:102, 결과값:101
		System.out.println("i:" + i);      // i++이 써진 다음 줄에서 1이 증가된다.
		
		// 1 ~ 5: 5번
		i = 1;
		while (i <= 5) {
			System.out.println("hello world " + i);
			i++;
		}
		
		// 5 ~ 0: 6번
		i = 5;
		while (i >= 0) {   // 5 4 3 2 1 0 
			System.out.println("안녕하세요 " + i);
			i--;
		}
		
		// 1+2+3+4+5+6+7+8+9+10 합계
		int sum = 0;
		i = 1;
		while (i <= 10) {  // 1 2 3.....  10  
			sum = sum + i;  // 1 = 0 + 1, 3 = 1 + 2, 6 = 3 + 3,.....
			i++;
		}
		System.out.println(sum);
	}

}
