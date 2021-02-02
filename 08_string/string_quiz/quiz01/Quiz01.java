package string_quiz;

public class Quiz01 {

	public static void main(String[] args) {
		String birthday = "1995";
		int age = 2021 - Integer.parseInt(birthday) + 1;
		System.out.println(age + "세");
	}

}
