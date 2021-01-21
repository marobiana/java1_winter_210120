package variable_ex;

public class Ex02 {

	public static void main(String[] args) {
		// 자료형 변환(casting)
		// double -> int
		double pi = 3.14;
		int intPi = (int)pi;
		System.out.println(intPi); // 소수점 뒷자리 버림
		
		// int -> double
		int number = 8;
		double doubleNumber = (double)number;
		System.out.println(doubleNumber);
		
		int number1 = 7;
		// int / int의 결과값은 int이다.
		double result = number1 / 2;  // 예상값:3.5
		System.out.println(result);
		
		// <해결방법>
		// 1. 둘 중 하나의 값을 double로 형변환 한다.
		result = number1 / (double)2;
		System.out.println(result);
		
		// 2. 실수로 나눈다.
		result = number1 / 2.0;
		System.out.println(result);
		
		// 반올림 하는법
		// Math.round(실수) - 첫째자리에서 반올림 돼서 정수로 만든다.
		pi = 3.147592653;
		System.out.println(Math.round(pi));
		
		// 둘째자리까지 반올림해서 나타내는 방법
		//  1. pi에 100을 곱해서 314.1592653을 만든다.
		//  2. Math.round(314.1592653)    => 314
		//  3. 3.14로 만들어주기 위해 100.0을 나누어준다.
		System.out.println(Math.round(pi * 100) / (double)100);
	}
