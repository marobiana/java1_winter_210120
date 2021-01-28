package quiz01;

public class Quiz01_6 {
	public static void main(String[] args) {
		// *****
		// ****
		// ***
		// **
		// *
		
		for (int i = 5; i >= 1; i--) { // 행: 5개의 행  5 4 3 2 1
			for (int j = i; j >= 1; j--) { // 별의 수: i개와 같다. 감소하는 행의 개수만큼 별을 출력한다
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < 5; i++) { 
			for (int j = 0; j < 5 - i; j++) { // 별의 수: i개와 같다. 5에서 증가하고 있는 i만큼을 감소시킨만큼 별을 출력한다. 
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < 5; i++) { 
			for (int j = 5; j > i; j--) { // 별의 수: i개와 같다. 5부터 행만큼 될 때까지 돈다.(행은 계속 증가) - 첫 행 5 4 3 2 1(5번)   둘째행 5 4 3 2 (4번)
				System.out.print("*");
			}
			System.out.println();
		}


	}
}
