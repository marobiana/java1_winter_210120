package two_d_array_ex;

public class Ex01 {

	public static void main(String[] args) {
		// 2차원 배열
		// 앞:행, 뒤:열
		int[][] scores = {
				{89, 93, 91}, 
				{91, 82, 72}, 
				{98, 93, 100}, 
				{65, 63, 71} 
		};
		
		System.out.println("3번째 학생의 두번째 점수는:" + scores[2][1]);
		System.out.println("2번째 학생의 첫번째 점수는:" + scores[1][0]);
		System.out.println("4번째 학생의 세번째 점수는:" + scores[3][2]);
		
		// 반복문으로 2차원 배열값 출력
		for (int i = 0; i < scores.length; i++) {  // 학생
			for (int j = 0; j < scores[i].length; j++) { // 시험점수
				System.out.println((i+1) + "번째 학생의 " + (j+1) + "번째 점수는" + scores[i][j]);
			}
		}
		
		// 학생들의 평균점수 구하기
		for (int i = 0; i < scores.length; i++) {  // 학생     0
			int sum = 0; // 한 학생의 점수 총합
			for (int j = 0; j < scores[i].length; j++) { // 점수 0 1 2
				sum += scores[i][j];
			}
			double average = sum / (double)scores[i].length;
			System.out.println((i+1) + "학생의 평균은 " + average + "점");
		}
	}

}

