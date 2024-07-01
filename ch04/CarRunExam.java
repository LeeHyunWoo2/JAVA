package ch04;

import java.util.Scanner;

public class CarRunExam {

	public static void main(String[] args) {
		// 자동차 주행 프로그램 만들기!!!!!!
		// CRUD를 항상 생각하고 필요하면 주석으로 써두기
		// C(reate) -> 시동을 건다. (START)
		// R(ead) -> 계기판 정보 출력
		// U(pdate)-> 주행 
		// D(elete) -> 시동을 끈다. (END)
		
		// while 문은 콘솔 정지 습관 가지기 안그럼 뻗음
		
		Scanner input = new Scanner(System.in);
		boolean run = true ; // 시동을 켠다.
		int speed = 0; // 차량 속도
		final int MAXSPEED = 300; // 최고속도 상수(변경안됨) final 처리하면 함부로 못바꿈, 대문자로만 쓰면 값이 이미 정해져있다는 국룰의미
		final int MINSPEED = 0; // 최저속도 상수(변경안됨)
		
		// MAXSPEED = 400;
		// The final local variable MAXSPEED cannot be assigned. It must be blank and not using a compound assignment
		// 상수에 final 붙였기 때문에 못바꿈
		
		System.out.println("포르쉐 911 Turbo S가 입고 되었습니다.");
		System.out.println("시동을 켭니다.");
		System.out.println("현재 속도 " +speed+ " km/h");
		
		
		
		while(run) {
			// 무한 반복 중 메뉴가 출력
			System.out.println("==================================");
			System.out.println("0. 시동 종료"); // 종료 테스트 성공
			System.out.println("1. 액셀"); // 30km/h 가속 + 최대속도 300km 테스트 성공
			System.out.println("2. 브레이크");
			System.out.println("3. 멀티미디어");
			System.out.println("4. 가까운 주유소 탐색");
			System.out.println("==================================");
			System.out.print("(0~4번 숫자 입력)>>>");
			int select = input.nextInt(); // 변수 만들고 키보드로 입력 받기
			
			switch(select) {
			case 0 :
				System.out.println("시동을 종료 합니다.");
				run = false; // 0번 입력 받으면 런이 false 되면서 while문 종료
				break;
			case 1 :
				System.out.println("가속합니다.");
				speed += 30; // speed가 30씩 증가함.
				
				if(speed >= MAXSPEED) { // 현재 속도가 최고속도보다 크거나 같으면
					speed = MAXSPEED; // 300이상 출력 안됨
				}
				System.out.println("현재 속도 " +speed+ " km/h");
				break;
			case 2 :
				System.out.println("감속합니다.");
				speed -= 30;
				if(speed<=MINSPEED) {
					speed = MINSPEED;
				}
				System.out.println("현재 속도 " +speed+ " km/h");
				break;
			case 3 :
				System.out.println("멀티미디어를 실행 합니다.");
				break;
			case 4 :
				System.out.println("가까운 주유소까지 경로를 탐색합니다.");
				break;
			default :
				System.out.println("다시 입력해주세요.");
				break;
			
			} // switch 종료
			
		} // while 종료
		System.out.println("포르쉐를 폐차합니다.");

	} // main 종료

} // class 종료
