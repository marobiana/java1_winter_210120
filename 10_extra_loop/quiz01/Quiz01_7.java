package quiz01;

public class Quiz01_7 {
	public static void main(String[] args) {
	//1
	for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5 - 1 - i; j++) {   // 4로 해도 되지만 5 - 1 인 이유는 나중에 기준이 되는 5를 바꾸면 더 여러줄을 찍을수 있게 확장성을 위해서 
                System.out.print(" ");
            }
        
            for(int j = 0; j < (2 * i) + 1; j++) { // 별의 개수는 홀수개, 공식만큼 돌린다.
                System.out.print("*");
            }
        
            System.out.println();
        }
        
	//2
        for(int i = 1; i <= 5; i++) {
            for(int j = 5 - i; j > 0; j--) {  // 첫행 공백을 4 3 2 1  4번찍을거라 4부터시작..
                System.out.print(" ");
            }
        
            for(int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
        
            System.out.println();
        }
        
	//3
        for(int i = 0; i < 5; i++) {
            for(int j = 5 - 1; j > i; j--) {  // 4부터 시작해서 행(0)보다 큰만큼 (4 > 0: 4 3 2 1 - 4번) 횟수를 돌린다.  그다음 행은 (4 > 1: 4 3 2 - 세번)
                System.out.print(" ");
            }
        
            for(int j = 0; j < (2 * i) + 1; j++) {
                System.out.print("*");
            }
        
            System.out.println();
        }
	}
}
