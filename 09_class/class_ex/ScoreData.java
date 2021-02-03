package class_ex;

// 설계도: 붕어빵 틀
public class ScoreData {
	// 멤버 변수, 필드(field)
	int score;
	String subject;
	int ranking;
	
	// 메소드
	public void printInfo() {
		System.out.println(score + " " + subject + " " + ranking);
	}
}
