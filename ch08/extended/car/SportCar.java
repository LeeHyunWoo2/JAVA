package ch08.extended.car;

public class SportCar extends Car{

	@Override
	public void speedUP() {
		
		speed += 5;
		
	} // 자식
	
	//@Override
	public void stop1() { // 이러면 그냥 다른변수
		
	}

}