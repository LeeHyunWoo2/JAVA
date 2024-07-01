package ch12.beepTest;

public class BeepExam {

	public static void main(String[] args) {
		// 소리와 자막이 동시에 나오고 싶은 프로그램

		Runnable beepTask = new Beeptask();
		// 스레드 run용 객체 생성
		
		Thread th1 = new Thread(beepTask);
		// run 메서드가 들어 있는 객체를 스레드에 넣음

		th1.start();
		// 스레드 시작
		
		
		
		for (int i = 0; i < 100; i++) {

			System.out.println("띠리링");
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// e.printStackTrace();
			}

		}

	}

}
