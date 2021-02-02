package string_ex;

public class Ex01 {

	public static void main(String[] args) {
		// String 변수에 값 저장
		String a = "안녕";
		String b = new String("안녕");
		String c = new String("안녕");
		String d = "안녕";
		
		System.out.println(a);
		System.out.println(b);
		
		// String 끼리 값 비교하기
		System.out.println(a == d); // true
		System.out.println(a == b); // false
		System.out.println(b == c); // false: 주소값이 같은지 확인
		
		// 객체의 값을 비교하는 경우는 equals 메소드로 비교
		System.out.println(b.equals(c)); // true
	}

}
