package two_d_array_quiz;

public class Quiz01 {

	public static void main(String[] args) {
		// 1. 10 입력하기
		int[][] arr1 = new int[2][3];
		
		// 입력
		for (int i = 0; i < arr1.length; i++) {   // 행  0, 1
			for (int j = 0; j < arr1[i].length; j++) { // 열 0, 1, 2
				arr1[i][j] = 10;
			}
		}
		
		// 출력
		printArray(arr1);
		
		// 2. 
		// 1 2 3 4
		// 1 2 3 4
		// 1 2 3 4
		int[][] arr2 = new int[3][4];
		// 입력
		for (int i = 0; i < arr2.length; i++) {  // 0 1 2
			for (int j = 0; j < arr2[i].length; j++) {  // 0 1 2 3
				arr2[i][j] = j + 1;
			}
		}
		
		// 출력
		printArray(arr2);
		
		// 3. 
//		1 1 1
//		2 2 2 
//		3 3 3 
		int[][] arr3 = new int[3][3];
		for (int i = 0; i < arr3.length; i++) {  // 0 1
			for (int j = 0; j < arr3[i].length; j++) { // 0 1 2
				arr3[i][j] = i + 1;
			}
		}
		
		printArray(arr3);
		
		// 4.
//		0 0 1 0 0 
//		0 0 1 0 0 
//		1 1 1 1 1 
//		0 0 1 0 0 
//		0 0 1 0 0 
		int[][] arr4 = new int[5][5];
		for (int i = 0; i < arr4.length; i++) {
			for (int j = 0; j < arr4[i].length; j++) {
				if (i == 2 || j == 2) {
					arr4[i][j] = 1;
				}
			}
		}
		
		printArray(arr4);
		
		
		// 5. 
//		1 2 3 
//		4 5 6 
//		7 8 9 
		// j + 1,    i:0  j:1   3  => 1    0*3 + 1
		// j + 1,    i:1  j:1   3  => 4    1*3 + 1
		// j값 +1,    i:2  j:1   3  => 7    2*3 + 1
		int[][] arr5 = new int[3][3];
		for (int i = 0; i < arr5.length; i++) {
			for (int j = 0; j < arr5[i].length; j++) {
				arr5[i][j] = (i * 3) + (j + 1);
			}
		}
		printArray(arr5);
		
		// 6. 
//		1 4 7 
//		2 5 8 
//		3 6 9 
		int[][] arr6 = new int[3][3];
		for (int i = 0; i < arr6.length; i++) {
			for (int j = 0; j < arr6[i].length; j++) {
				arr6[i][j] = (j * 3) + (i + 1);
			}
		}
		printArray(arr6);
	}
	
	// 출력
	public static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}
}
