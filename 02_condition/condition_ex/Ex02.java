import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 예제1
//		System.out.print("숫자를 입력하세요:");
//		int number = scan.nextInt();
//		
//		// 10 <= number <= 40 : number가 10 이상이고 40 이하이다.(그리고, AND)
//		// AND: 두 조건이 모두 만족해야 참(true)
//		if (number >= 10 && number <= 40) {
//			System.out.println("number가 10 이상이고 40 이하이다.");
//		}
//		
//		// number < 10 또는 number > 40 : number가 10보다 작거나 40보다 크다.(또는, OR)
//		// OR: 두 조건 중 하나만 만족해도 참(true)
//		if (number < 10 || number > 40) {
//			System.out.println("number가 10보다 작거나 40보다 크다.");
//		}
		
		// 예제2
		System.out.print("걸은 수와 몸무게를 입력하세요:");
		int walk = scan.nextInt();
		int weight = scan.nextInt();
		
		// 만약에 걸은수가 10000보를 초과하면서 몸무게가 70키로 이하이면 "치킨"
		if (walk > 10000 && weight <= 70) {
			System.out.println("둘 다 만족하니 치킨 먹자!!!");
		}
		
		// 만약에 걸은수가 10000보를 초과하거나 몸무게가 70키로 이하이면 "치킨"
		if (walk > 10000 || weight <= 70) {
			System.out.println("하나라도 만족하니 치킨 먹자!!!");
		}
		
	}
}
