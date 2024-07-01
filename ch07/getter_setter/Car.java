package ch07.getter_setter;

public class Car {

	// 필드에 직접적인 접근을 막는다. (private)
	// 메서드를 통해 검증 후에 데이터를 보낸다. (private 제외 선언)

	// 필
	private int speed; // Car 클래스 안에서만 호출 가능

	// 생

	// 메
	void setSpeed(int speed) { // 입력용 메서드
		// default = 같은 패키지에서만 사용
		if (speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}

	}// 세터 종료

	double getSpeed() { // 출력용 메서드
		return this.speed * 0.621371 ;
	}// 게터 종료

}// 클래스
