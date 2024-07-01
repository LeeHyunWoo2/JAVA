package ch08.extended.tire;

public class Car {
	// 필
	Tire fl = new Tire(30, "앞왼"); // maxRotation, 위치 받음
	Tire fr = new Tire(26, "앞오");
	Tire bl = new Tire(20, "뒤왼");
	Tire br = new Tire(15, "뒤오");

	// 생

	// 메
	// roll 메서드를 호출하여 마일리지 소모

	int run() { // 달리고 고장 판단
		if (fl.roll() == false) {
			stop();
			return 1; // 앞왼쪽 고장
		}
		if (fr.roll() == false) {
			stop();
			return 2; // 앞오른쪽 고장
		}
		if (bl.roll() == false) {
			stop();
			return 3; // 뒤왼쪽 고장
		}
		if (br.roll() == false) {
			stop();
			return 4; // 뒤오른쪽 고장
		}
		return 0; // 정상주행
	}

	void stop() { // 펑크났을때 호출
		System.out.println("자동차가 멈춥니다.\n");

	}

}
