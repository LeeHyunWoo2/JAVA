package ch08.extended.car;

public class Car { // 부모 자동차 클래스
	
	//필
	public int speed;
	
	
	//생
	public Car() {} // 기본생성자, 아무 생성자도 안적어두면 자동으로 생성됨
	// Car car = new Car();
	
	
	
	//메
	public void speedUP() {
		speed += 1;
	} // 메서드 호출 시 속도가 1씩 증가됨
	
	public final void stop() { // final 최종적
		System.out.println("자동차가 멈춥니다.");
		speed = 0;
	}

}
