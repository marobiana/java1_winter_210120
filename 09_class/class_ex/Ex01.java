package class_ex;

public class Ex01 {

	public static void main(String[] args) {
		ScoreData sd1 = new ScoreData(); // 객체(Object), ScoreData의 instance
		// 필드에 값 넣기
		sd1.subject = "국어";
		sd1.score = 85;
		sd1.ranking = 15;
		
		// 필드 값 출력하기
		System.out.println(sd1.subject);
		System.out.println(sd1.score);
		System.out.println(sd1.ranking);
		
		// 메소드 호출하기
		sd1.printInfo();
	}

}
