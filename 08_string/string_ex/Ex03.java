package string_ex;

public class Ex03 {

	public static void main(String[] args) {
		String s1 = "eclipse";
		
		// charAt: n번째 index에 무슨 문자가 있는지 확인
		System.out.println("charAt:" + s1.charAt(4));
		
		// contains: 특정 문자열이 문자열 안에 포함되어 있는지 확인
		System.out.println("contains:" + s1.contains("lip"));
		
		// startsWith: 특정 문자열로 시작하는지 확인
		System.out.println("startsWith:" + s1.startsWith("ecl"));
		System.out.println("startsWith:" + s1.startsWith("a"));
		
		// endsWith: 특정 문자열로 끝나는지 확인
		System.out.println("endsWith:" + s1.endsWith("pse"));
		
		// length: 문자열의 길이를 확인. 알파벳이 몇 개인지 확인
		System.out.println("length:" + s1.length());
		
		// replace: 포함된 문자열 부분을 교체
		String s2 = "I stay hungry.";
		System.out.println("replace:" + s2.replace("I", "You"));
		
		// split: 특정 스트링을 기준으로 잘라서 배열에 넣는다.
		String s3 = "apple,melon,grape";
		String[] fruits = s3.split(",");
		System.out.println("split:" + fruits[0] + " " + fruits[1] + " " + fruits[2]);
		
		// substring: 문자열을 자른다.
		String s4 = "javastudy";
		// 전달인자값 1개: 시작위치 index부터 끝 문자열까지 잘라준다.
		System.out.println("substring:" + s4.substring(4)); // study
		
		// 전달인자값2개: 시작위치 index부터 end index + 1한 앞까지 잘라준다.
		System.out.println("substring:" + s4.substring(0, 4)); // java
		System.out.println("substring:" + s4.substring(4, 9)); // study
	}

}


