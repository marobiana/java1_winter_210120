package class_quiz01;

public class StudentTest {

	public static void main(String[] args) {
		// 나의 의식의 흐름
		Student st1 = new Student();
//		유재석
//		21
//		java
//		01023453223
//		성인입니다.
		st1.name = "유재석";
		st1.age = 21;
		st1.className = "java";
		st1.phoneNumber = "01023453223";
		
		System.out.println(st1.name);
		System.out.println(st1.age);
		System.out.println(st1.className);
		System.out.println(st1.phoneNumber);
		st1.isAdult();
		
		System.out.println();
//		이효리
//		17
//		java
//		01096482734
//		미성년자 입니다.
		Student st2 = new Student();
		st2.name = "이효리";
		st2.age = 17;
		st2.className = "java";
		st2.phoneNumber = "01096482734";
		System.out.println(st2.name);
		System.out.println(st2.age);
		System.out.println(st2.className);
		System.out.println(st2.phoneNumber);
		st2.isAdult();
	}
}
