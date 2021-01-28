package nested_loop_ex;

public class Ex01 {

	public static void main(String[] args) {
		// 중첩 반복문(nested loop)
		//  바깥 반복문 - 천천히 돈다. (행)
		//  안쪽 반복문 - 빨리 돈다. (열)
		
		// 스쿼트 3세트 10회
		for (int i = 1; i <= 3; i++) {   // 세트
			for (int j = 1; j <= 10; j++) {  // 횟수
				System.out.println("스쿼트 " + i + "세트째," + j + "회");
			}
		}
		
		// *****
//		for (int i = 0; i < 5; i++) {
//			System.out.print("*");
//		}
		
		// 한줄짜리 별 5개를 3행 찍기
		// *****
		// *****
		// *****
		for (int i = 0; i < 3; i++) {  // 행
			for (int j = 0; j < 5; j++) { // 열. 별의 개수
				System.out.print("*");
			}
			System.out.print("\n");  // 한 행이 끝나는 시점에 줄 바꿈
		}
	}

}



