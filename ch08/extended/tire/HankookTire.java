package ch08.extended.tire;

public class HankookTire extends Tire {

	public HankookTire(int maxRotation, String lacation) {
		super(maxRotation, lacation);
		// OEM 타이어에서 만든 규격대로 생성자 만듦
	}// 자식 타이어

	
	
	
	@Override
	public boolean roll() { // 달리면서 마일리지 소모 (acc)
		accRotation += 3;
		if (accRotation < maxRotation) { // 타이어 소모 측정
			System.out.println(location + " 위치에 한국타이어 수명 " + (maxRotation - accRotation) + " 마일리지");
			return true;
		} else {
			System.out.println("------- 경고 --------");
			System.out.println(location + "위치에 한국타이어가 펑크 되었습니다.");
			return false;
		}

	}

}
