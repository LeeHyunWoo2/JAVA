package ch04;

public class WhilPrintExam {

	public static void main(String[] args) {
		// while 문은 ()안에 값이 true일때 무한 반복한다.
		// while(true) -> 반복 -> while(false) -> 종료
		// 대부분 최대값이 없는 반복문일 떄 활용 -> 메뉴용으로 활용(관리자에 의한 종료, 관리자가 꺼줄때까지 반복)
		
		int i = 1;
		while(i<=10) { // 1부터 10까지는 true -> 11부터는 false (while문 종료)
			// 반복 실행문
			
			System.out.println(i);
			i++;
			
		} // while 종료
		
		System.out.println("프로그램이 정상 종료 되었습니다.");

	} // main 종료

} // class 종료
