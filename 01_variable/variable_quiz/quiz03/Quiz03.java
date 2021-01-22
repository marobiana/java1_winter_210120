package variable_quiz;

public class Quiz03 {

	public static void main(String[] args) {
		// 1. 평균 구하기
		int korean = 93;
		int math = 88;
		int english = 94;
		double average = (korean + math + english) / 3.0;
		average = Math.round(average * 100) / 100.0;
		System.out.println("국어 " + korean + "점, 수학 " + math + "점, 영어 " + english + "점");
		System.out.println("평균:" + average);
		
		// 2. 화씨 구하기
		int c = 30;
		double f = 9 / 5 * c + 32;
		System.out.println("섭씨 " + c + "도는 화씨 " + f + "도 입니다.");
	}

}
