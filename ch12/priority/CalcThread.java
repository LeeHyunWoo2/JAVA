package ch12.priority;

public class CalcThread extends Thread {
	// 스레드 객체

	public CalcThread(String name) {
		setName(name);
	} // CalcThread calcThread = new CalcThread("스레드 이름");

	@Override
	public void run() {
		for (int i = 0; i < 2147483647; i++) {

		}
		System.out.println(getName());
	} // 0~32비트한도까지 반복후 이름 출력
}
