package ch04;

public class ForPrintExam {

	public static void main(String[] args) {
		// for문은 횟수가 정해진 반복문이다.
		// for(초기값 ; 조건식 ; 증감식) { 실행문1; 실행문2; }실행블럭
		
		for(int i = 1 ;    // 초기값
				i <= 10 ;  // 조건식
				i++        // 증감식
				) {
			//실행문
			
			if(i% 2==1) {
				System.out.println("1~10까지 출력 : " + i);
			}
		} // for문 종료
		
		
		System.out.println("------------------------------");
		
		for(int x = 0 ;    // 초기값
				x <= 10 ;  // 조건식
				x+=2        // 증감식 (굳이 if문 안써도 이렇게 값과 식만 건드려도 짝수만 나오게 할 수 있음)
			){System.out.println("1~10까지 출력 : " + x);
		}
		
		System.out.println("------------------------------");
		int sum = 0; // 총합의 누적 계산용
		
		for(int y = 1; y <= 100 ; y++) {
			sum += y; // sum = sum + y
			System.out.println("1+2+3+4 ... 출력 :" +sum);
			
		}
	}
}