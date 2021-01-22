package condition_ex;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("몸무게를 입력하세요:");
		int weight = scan.nextInt();
		
		// if문 - else문
		// 몸무게가 70키로 이하이면 "치킨", 아니면 "샐러드"
		if (weight <= 70) {
			System.out.println("치킨");
		} else {
			System.out.println("샐러드");
		}
		
		// if문  - else if문 - else 문
		if (weight <= 70) {   // 70키로 이하
			System.out.println("치킨");
		} else if (weight <= 75) { // 70 초과  ~ 75키로 이하
			System.out.println("닭가슴살");
		} else if (weight <= 80) { // 76 ~ 80
			System.out.println("샐러드");
		} else {  // 80키로 초과
			System.out.println("굶자");  
		}
	}

}
