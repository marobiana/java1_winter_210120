package string_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 1. jpg가 몇개인지
		String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
		
		int count = 0;
		for (int i = 0; i < files.length; i++) {
			boolean isJpg = files[i].endsWith("jpg");
			if (isJpg) {
				count++;   // count += 1;
			}
		}
		System.out.println("jpg 파일 개수:" + count);
		
		// 2. 영어 단어 퀴즈
		Scanner scan = new Scanner(System.in);
		System.out.print("1. 승리를 입력하세요:");
		String answer = scan.next();
		int score = 0;
		if (answer.equals("victory")) {
			score += 100 / 4;
		}
		
		System.out.print("2. 사랑을 영어로 입력 하세요 :");
		answer = scan.next();
		if (answer.equals("love")) {
			score += 100 / 4;
		}
		
		System.out.print("3. 컴퓨터를 영어로 입력 하세요 :");
		answer = scan.next();
		if (answer.equals("computer")) {
			score += 100 / 4;
		}
		
		System.out.print("4. 노트북을 영어로 입력하세요 :");
		answer = scan.next();
		if (answer.equals("notebook")) {
			score += 100 / 4;
		}
		
		System.out.println("점수는 " + score + "점 입니다.");
		
		// 3. 동명이인 종류 수
		String memberStr = "김혜수:송강호:정우성:이민정:송강호:이민정:이민정:이정재:이병헌:이정재";
		String[] names = memberStr.split(":");
		count = 0;
		for (int i = 0; i < names.length; i++) {
			String name = names[i];  // 검사할 기준 이름
			boolean isSame = false;
			
			if (name.equals("")) {
				continue;
			}
			
			for (int j = i + 1; j < names.length; j++) {
				if (name.equals(names[j])) {
					names[j] = "";
					isSame = true;
				}
			}
			
			if (isSame) {
				count++;
			}
		}
		
		System.out.println("동명이인 종류 수:" + count);
	}

}
