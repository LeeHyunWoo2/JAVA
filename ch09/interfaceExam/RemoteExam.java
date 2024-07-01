package ch09.interfaceExam;

import java.util.Scanner;

public class RemoteExam {

	public static void main(String[] args) {
		// 인터페이스를 사용한 구현클래스를 이용해본다.
		
		RemoteControl.changeBattery();

		System.out.println("리모컨 인터페이스를 사용합니다.");
		Scanner scanner = new Scanner(System.in);

		RemoteControl rc;// 인터페이스를 변수에 연결

		boolean condition = true;
		while (condition) {
			System.out.println("==============================");
			System.out.println("1. TV | 2. 오디오 | 3. 스마트TV | 4. 종료");
			System.out.println("==============================");
			System.out.print(">>>");
			int select = scanner.nextInt();
			switch (select) {
			case 1:
				rc = new Television(); // RemoteControl rc = new Television(); 을 생략
				rc.turnOn();
				rc.turnOff();
				rc.serMute(true);   // 음소거 적용
				rc.serMute(false);  // 음소거 해제
				break;
			case 2:
				rc = new Audio(); // Audio rc = new Audio(); 을 생략
				rc.turnOn();
				rc.turnOff();
				break;
			case 3:
				rc = new SmartTelevision();
				rc.turnOn();
				Searchable se = new SmartTelevision();
				System.out.println(" 인터넷 검색을 시작합니다. ");
				System.out.print(">>>");
				String sc = scanner.next();
				((SmartTelevision) rc).search(sc);
				// 선생님은 예제에 rc.search(sc); 라고 하셨는데
				// 내가 중간에 뭘 놓쳤는지 그거 안되서 걍 캐스팅해둠
				rc.turnOff();
				break;
			case 4:
				condition = false;
				break;
			default:
				System.out.println("1~3");
			} // 스위치 문 종료

		} // 와일

	}

}
