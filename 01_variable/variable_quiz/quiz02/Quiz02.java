package variable_quiz;

public class Quiz02 {

	public static void main(String[] args) {
		// 1. 변수 출력
		char grade = 'A';
		double point = 4.0;
		System.out.println("시험 성적이 90점 이상이면 " + grade + "학점이고 평점은 " + point + "입니다.");
		
		grade = 'B';
		point = 3.0;
		System.out.println("시험 성적이 80점 이상이면 " + grade + "학점이고 평점은 " + point + "입니다.");
		
		// 2. 실수 연산
		int number1 = 33;
		double number2 = 35.325;
		double result = number1 * number2;
		System.out.println("두 수의 곱: " + result);
		// 또는
		System.out.println("두 수의 곱: " + number1 * number2);
		
		// 3. 날짜 구하기
		int hour = 943;
		int day = hour / 24;
		int h = hour % 24;
		System.out.println(hour + "시간은 " + day + "일 " + h + "시간 입니다.");
		
		// 4. 도형 넓이 구하기
		int width = 8;
		int height = 9;
		int rectangle = width * height;
		double triangle = width * height / 2;
		System.out.println("사각형의 넓이: " + rectangle);
		System.out.println("삼각형의 넓이: " + triangle);
	}

}
