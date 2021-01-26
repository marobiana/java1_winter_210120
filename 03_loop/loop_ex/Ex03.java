package loop_ex;

public class Ex02 {

	public static void main(String[] args) {
		// break: break가 써진 곳의 가까운 반복문에서 빠져 나온다. 
		
		// 무한루프에서 Hello world 5번 찍기
		int i = 0; 
		while (true) { // 0 1 2 3 4  => 5번
			if (i == 5) {
				break;
			}
			
			System.out.println("Hello world " + i);
			i++;
		}
		
		for (int j = 0; ;j++) {
			if (j == 5) {
				break;
			}
			System.out.println("안녕" + j);
		}
		
		// 1 ~ 10까지의 수 중에서 4의 배수일 때는 출력하지 않기
		// 1 2 3 5 6 7 9 10
		// (1) if문
		for (int j = 1; j <= 10; j++) {
			if (j % 4 != 0) {
				System.out.print(j + " ");
			}
		}
		System.out.println();
		
		// continue: skip. continue가 써진 아래 코드들은 수행하지 않고 조건을 보러 올라간다.
		for (int j = 1; j <= 10; j++) {
			if (j % 4 == 0) {
				continue;
			}
		}
	}

}
