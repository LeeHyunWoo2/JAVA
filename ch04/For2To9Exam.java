package ch04;

public class For2To9Exam {

	public static void main(String[] args) {
		// 2단에서 9단까지 구구단을 찍어 보자.
		// for문 안쪽에 for를 또 작성하면 바깥쪽에 for가 돌면서 안쪽 for문이 돈다.
		// 블럭 {}을 조심할것!!!!  ex) for{for}
		
		System.out.println("---------------구구단 시작---------------");
		for (int m = 2 ; m <= 9 ; m++) { // 2~9까지 반복할것이다 (앞단)
			System.out.println("ㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ " +m+"단"+" ㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ");
		
			for(int n = 1 ; n <= 9 ; n++) { // 실제로 곱하는 코드
				System.out.println(m + "X" + n + " = " + (m*n));
				
			}
			
		}

	}

}
