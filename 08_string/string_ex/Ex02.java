package string_ex;

public class Ex02 {

	public static void main(String[] args) {
		// 자료형 변환
		
		// 숫자 -> 문자열,   3 -> "3"
		int number = 3;
		String str1 = number + "";
		String str2 = String.valueOf(number);
		
		// "3" => 3
		String str3 = "3";
		int number2 = Integer.parseInt(str3);
		int number3 = Integer.valueOf(str3);
	}

}
