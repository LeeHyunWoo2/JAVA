package ch08.extended.vehicle;

public class DriverExam {

	public static void main(String[] args) {
		// 운전자가 실행하는 코드
		
		Driver driver = new Driver();
		
		Vehicle vehicle = new Vehicle(); // 탈것 부모
		vehicle.name = "탈것";
		driver.drive(vehicle);
		
		Bus bus = new Bus();
		bus.name = "시내버스";
		bus.type = "전기형";
		bus.busCard();
		driver.drive(bus); // 버스 운전 (탈것 자식)
		
		Taxi taxi = new Taxi();
		taxi.model = "카카오 택시";
		taxi.name = "가스";
		taxi.taxiMeter();
		driver.drive(taxi);
		
		
	}

}
