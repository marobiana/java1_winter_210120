package two_d_array_quiz;

public class Quiz01 {
	public static void main(String[] args) {
		int[][] scores = {
			    {89, 93, 91, 93, 92, 78, 90, 90, 93, 90},
			    {91, 82, 72, 98, 92, 87, 77, 87, 74, 88},
			    {98, 93, 94, 91, 97, 94, 91, 96, 98, 90},
			    {65, 63, 57, 87, 88, 92, 78, 85, 100, 68},
			    {45, 50, 48, 63, 67, 58, 40, 66, 47, 64}
			};
		
		// 1. 학생별 평균 구하기
		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
			double average = sum / (double)scores[i].length;
			System.out.println(i+1 +"번째 학생의 평균은 " + average);
		}
		
		// 출력
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + " ");
			}
			System.out.println();
		}
		
		// 2. 학생별 최고점 구하기
		for (int i = 0; i < scores.length; i++) {
			int maxScore = 0;
			for (int j = 0; j < scores[i].length; j++) {
				if (maxScore < scores[i][j]) {
					maxScore = scores[i][j];
				}
			}
			System.out.println(i+1 + "번째 학생의 최고점은 " + maxScore);
		}
		
		// 3. 평균 최고점 구하기
		double maxAverage = 0;
		int maxIndex = 0;
		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
			double average = sum / (double)scores[i].length;
			
			if (maxAverage < average) {
				maxAverage = average;
				maxIndex = i; // n번째 학생의 index
			}
		}
		
		System.out.println("평균이 가장 높은 학생은 " + (maxIndex + 1) + "번째 학생이고, 평균 점수는 " + maxAverage);
		
		// 4. 특정 과목 최고점
		int maxScore = 0;
		maxIndex = 0;
		for (int i = 0; i < scores.length; i++) {
			if (maxScore < scores[i][3]) {
				maxScore = scores[i][3];
				maxIndex = i; // n번째 학생의 index
			}
		}
		System.out.println("4번째 과목의 최고 성적자는 " + (maxIndex+1) + "번째 학생이고, 점수는 " + maxScore);
		
		// 5. 일부 평균 최고점
		maxIndex = 0;
		maxAverage = 0;
		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			for (int j = 3; j <= 7; j++) {
				sum += scores[i][j];
			}
			double average = sum / 5.0;
			if (maxAverage < average) {
				maxAverage = average;
				maxIndex = i;
			}
		}
		
		System.out.println("3~7 과목 평균이 가장 높은 학생은 " + (maxIndex + 1) + "번째 학생이고, 평균은 " + maxAverage);
	}
}
