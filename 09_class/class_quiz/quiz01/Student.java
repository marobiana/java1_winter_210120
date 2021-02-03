package class_quiz01;

public class Student {
	// 필드 (속성)
	String name;
	String className;
	int age;
	String phoneNumber;
	
	// 메소드 (행동하는 것)
	public void isAdult() {
		if (this.age >= 20) {
			System.out.println(this.name + "은 성인입니다.");
		} else {
			System.out.println(this.name + "은 미성년자입니다.");
		}
	}
}


