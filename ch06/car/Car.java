package ch06.car;

public class Car {

	// 자동차 객체용 클래스

	// [필드] (멤버 변수)

	
	
	// 고유데이터
	String company;    // 제조사
	String model;      // 모델명
	String color;      // 색상
	int maxSpeed;      // 최고 속도
	
	// 상태
	int speed;         // 현재 속도
	int rpm;           // 현재 엔진 분당회전수
	boolean start;     // 시동 유무
	
	// 부품
	Body body;
	Engine engine;
	Tire tire;
	
	

	
	
	
	// [생성자] (new) -> 메뉴 -> Source -> 제너레이트컨스트럭터유징필드 -> 날먹
	public Car() {
		
	} // 기본 생성자는 자동으로 생성 안됨. 사용자 지정 생성자가 있을 경우
	
	public Car(String company, String model, String color, int maxSpeed, boolean start) {
		super(); // 상속에 관련된 메서드
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.start = start;
	}// Car 종료
	
	
	
	
	
	
	// [메서드] (동작)
	
	

	@Override // 오버라이드 = 재정의 코드 / toString = 객체를 문자열로 출력
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed
				+ ", speed=" + speed + ", rpm=" + rpm + ", start=" + start + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}// 클래스
