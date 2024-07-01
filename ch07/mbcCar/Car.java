package ch07.mbcCar;

import ch07.hankook.SnowTire;
import ch07.hankook.Tire;
import ch07.hyndai.Engine;
import ch07.kumho.EcoTire;
import ch07.nexen.*; // 넥센에서 만든 클래스는 모두 가져올 수 있음.

public class Car {
	//필
	Tire hTire = new Tire(); // 한국타이어 패키지에서 가져옴 import ch07.hankook.Tire;
	ch07.kumho.Tire kTire = new ch07.kumho.Tire(); // 금호타이어 패키지에서 가져옴. 이렇게 쓰는 사람도 있으니 맞춰주면됨
	// 아래꺼처럼 쓰면 이름이 같은 다른 클래스도 동시에 사용가능함 임포트쓰면 불가능
	// 요즘 트렌드는 아래처럼 쓰는 추세라고 함 워낙 임포트 보고 다시 내려오고 하기 번거로워서
	
	SnowTire sTire = new SnowTire();
	EcoTire eTire = new EcoTire();
	Engine hEngine = new Engine();
	
	BigWidthTire bTire = new BigWidthTire();
	SportTire spTire = new SportTire();
	
	
	//생
	
	
	
	
	//메
}
