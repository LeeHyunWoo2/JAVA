package ch09.interfaceExam;

public interface RemoteControl {
	// 상수 (변하지 않는 값) -> 초기 값이 있다.
	// 타입 상수명 = 값; static final을 생략해도 상수처리 됨
	public /* static final */ int MAX_VOLUME = 10; // 최대 볼륨
	public int MIN_VOLUME = 0; // 최소 볼륨

	// 상수 필드 : 인터페이스는 객체 사용설명서 임.
	// 런타임시 데이터를 저장할 수 있는 필드를 선언할 수 없다. (값 들어있는 제품 갖다 쓰는거니까)

	// 메서드 (추상, 디폴트, 정적)
	// 추상메서드 : abstract -> 자식에게 강제로 주입 / {} 중괄호 실행문이 없음 / ; 로 끝냄
	// abstract 역시 생략가능함
	public /* abstract */ void turnOn(); // 전원을 켠다

	public void turnOff(); // 전원을 끔

	public void serVolume(int volume); // 소리 조절

	// 디폴트 : 인스턴스 메서드용 new 로 객체 생성 가능 (재정의 가능)
	/* public */ default void serMute(boolean mute) { // mute = true, false
		if (mute) {
			System.out.println("무음 처리 합니다.");
		} else {
			System.out.println("무음 처리를 해제합니다.");
		}
	}

	// 정적 : new 없이 사용되는 메서드
	/* public */ static void changeBattery() { // static 이라 재정의 불가
		System.out.println("건전지를 교환해야 합니다.");
	}

}