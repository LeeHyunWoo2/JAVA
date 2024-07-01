package ch08.extended.vehicle;

public class Driver {
	// 운전자 (서비스 클래스)
	
	public void drive(Vehicle vehicle) {
		// Vehicle vehicle = new Vehicle(); 이 생략된것
		vehicle.name = "탈것";
		vehicle.run();
		
		Bus bus = (Bus) vehicle;
		bus.name = "시내버스";
		bus.type = "전기버스";
		bus.busCard();
		
		Taxi taxi = (Taxi) vehicle;
		taxi.model = "카카오택시"; 
		taxi.name = "가스형";
		taxi.taxiMeter();
	}

}
