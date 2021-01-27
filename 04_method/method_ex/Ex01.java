package method_ex;

public class Ex01 {

	public static void main(String[] args) {
		// 함수 사용하기
		
		// 큰 값
		int max = Math.max(1, 2); // 전달 인자값, Argument
		System.out.println(max);
		System.out.println(Math.max(111, 222));
		
		// 반올림
		double a = 3.68;
		long roundNum = Math.round(a);
		System.out.println(roundNum);
		System.out.println(Math.round(a));
		
		// 절대값
		int result = Math.abs(-100);
		System.out.println(result);
		System.out.println(Math.abs(-100));
	}

}
