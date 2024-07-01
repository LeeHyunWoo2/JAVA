package ch09.interfaceExam;

public class Television implements RemoteControl {
	// 리모컨 인터페이스를 사용하는 구현체
	// 필
	private int voulme; // 숫자로 된 볼륨

	// 기본 생성자 : Television tel = new Television

	// 메

	@Override // 재정의 (위에서 만든 메서드를 동작시킴)
	public void turnOn() {
		// 전원을 켠다
		System.out.println("tv의 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("tv의 전원을 끕니다.");
		// 전원을 끈다
	}

	@Override
	public void serVolume(int volume) {
		// 볼륨 조절용
		if (volume > RemoteControl.MAX_VOLUME) {
			this.voulme = RemoteControl.MAX_VOLUME;
			// this(지금 내가 가지고 있는 값에) MAX볼륨을 넣어라
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.voulme = RemoteControl.MIN_VOLUME;
		} else {
			this.voulme = volume;
		} // if 종료
		System.out.println("현재 TV의 볼륨은 : " + volume);
	} // 리모컨 인터페이스를 사용하는 구현체

	@Override
	public void serMute(boolean mute) {
		if (mute) {
			System.out.println("TV를 무음 처리 합니다.");
		} else {
			System.out.println("TV의 무음 처리를 해제합니다.");
		}
	}

}