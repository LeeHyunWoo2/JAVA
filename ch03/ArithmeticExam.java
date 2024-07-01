package ch03;

public class ArithmeticExam {

	public static void main(String[] args) {
		// 이항 연산자는 2개의 항으로 계산되어 결과를 산출한다.
		// 사칙연산 + 나머지계산 등에 활용
		// 자동타입 변환으로 큰 타입으로 변경됨.
		
		
		int v1 = 5 ;
		int v2 = 2 ;
		int result1 = v1 + v2 ;
		System.out.println("reult1 = " + result1); // 7
		
		int result2 = v1 - v2 ;
		System.out.println("reult2 = " + result2); // 3

		int result3 = v1 * v2 ;
		System.out.println("reult3 = " + result3); // 10
		
		int result4 = v1 / v2 ;
		System.out.println("reult4 = " + result4); // 2
		
		int result5 = v1 % v2 ;
		System.out.println("reult5 = " + result5); // 1
		
		double result6 = v1 / v2 ;
		System.out.println("reult6 = " + result6); // 2.0

		double result7 = (double) v1 / v2 ; // 강제타입변환 + 자동타입변환 활용
		System.out.println("reult7 = " + result7); // 2.0
		// 나누기 할 때 주의사항 - 소수점 계산!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		
		
		int x = 1000000 ;
		int y = 1000000 ;
		int z = x * y ; // 1000000000000
		System.out.println("백만*백만 =" +z);
		
		long z1 = (long) x * y ;
		System.out.println("long 강제+자동타입 변환 : " +z1);
		
		System.out.println("소숫점 정확한 계산은 float, double?");
		// 정확한 계산은 부동소수점(실수) 타입은 사용하지 않는 것이 좋다.
		// 사과 1개를 0.1 단위인 10조각으로 보고(piece) 그 중 7개의 조각(0.7)을 뺀 3조각(0.3)계산
		
		
		int apple = 1 ; // 사과 1개
		double pieceUnit = 0.1 ; // 사과 1조각 (10등분)
		int piece = 7 ; // 먹은 조각 수
		
		
		double result = apple - (piece * pieceUnit) ;
							//   1 -  ( 7  *  0.1  =   0.7 ) = 0.3
		System.out.println("남은 사과 조각 수는 :" + result);
		// 남은 사과 조각 수는 : 0.29999999999999993
		// 결론 돈 계산할때는 double과 같은 실수형으로 사용하지 말것!!!!!!!!!!!!!!!!
		
		System.out.println("-----------------------------------------");
		
		int appleInt = 1 ; // 사과 1개
		int totalPieces = appleInt * 10 ; // 10등분으로 나누지 말고 곱함
		int number = 7 ; // 사과 7 조각
		int temp = totalPieces - number ; // 사과 10조각 - 7조각 = 3조각
		
		double resultInt = temp / 10.0 ; // 3/10.0 -> 0.3
		
		System.out.println("사과 1개에서 0.7조각을 빼면 : " + resultInt) ;
		
		
		int eng = 90 ;
		int sol = 80 ;
		int total = eng + sol ;
		
		System.out.println("영어점수 : "+ eng);
		System.out.println("사회점수 : "+ sol);
		System.out.println("총점 : "+ total);
		System.out.println((90 + 80)/2 + ": 평균 ");
		// 출력 시 앞 글자가 문자이면 뒤에 숫자는 자동 타입 변환으로 문자열 출력이 되버림
		// 출력 시 앞 글자가 계산정보이면 계산 후에 문자열이 붙는다.
		// 프로그래밍은 위부터 아래, 왼쪽부터 오른쪽으로 연산됨
		
	}

}
