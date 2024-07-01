package ch09.interfaceExam;

public class RemoteAnonymusExam {

	public static void main(String[] args) {

		RemoteControl remoteControl = new RemoteControl() {
			private int voulme;

			@Override
			public void turnOn() {
				System.out.println("익명으로 전원을 켭니다.");

			}

			@Override
			public void turnOff() {
				System.out.println("익명으로 전원을 끕니다.");

			}

			@Override
			public void serVolume(int volume) {
				if (volume > RemoteControl.MAX_VOLUME) {
					this.voulme = RemoteControl.MAX_VOLUME;
				} else if (volume < RemoteControl.MIN_VOLUME) {
					this.voulme = RemoteControl.MIN_VOLUME;
				} else {
					this.voulme = volume;
				} // if 종료
				System.out.println("현재 익명 개체의 볼륨은 : " + volume);

			}
		};
	}
}
