package variable_ex;

public class Ex01 {

	public static void main(String[] args) {
		System.out.print("Hello world\n"); 
		System.out.println("안녕 자바의 세계");
		System.out.println("hello world");
		
		// 한 줄 주석
		
		/*   
		 * 여러줄
		 * 주석
		 * 쓸 수 있어요
		 * */
		
		// 정수형(Integer) 변수
		int number1 = 3; // 값을 할당한다.(assign)
		System.out.println(number1);
		
		number1 = 5; // 재사용 할 때는 자료형을 쓰지 않는다.
		System.out.println(number1);
		
		int number2 = 100;
		int sum = number1 + number2;
		System.out.println(sum);
		System.out.println(number1 + number2);
		
		// 실수(소수) float 변수  : 오차가 있을 수 있으므로 권장 안함
		float f = 1.579f;
		System.out.println(f);
		
		double d = 3.879979;
		System.out.println(d);
		
		// 문자(Character) 변수 : 문자 한개. 작은 따옴표로 감싼다.
		char c = 'z';
		System.out.println(c);
		
		// boolean : 참(true) 또는 거짓(false)
		boolean isReal = true;
		boolean isFalse = false;
		System.out.println(isReal);
		System.out.println(isFalse);
		
		// 문자열와 변수 이어붙이기
		System.out.println("isReal 변수에 들어있는 값은 " + isReal + "이다.");
		// 1 + 1은 2 이다.
		System.out.println("1 + 1은 " + (1 + 1) + "이다.");
	}
}
