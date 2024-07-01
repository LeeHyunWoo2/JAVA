package ch12.beepTest;

import java.awt.Toolkit;

public class Beeptask implements Runnable {

	@Override
	public void run() {

		Toolkit toolkit = Toolkit.getDefaultToolkit(); // 객체화
		for (int i = 0; i < 100; i++) {
			toolkit.beep(); // 사운드로 경고음이 출력됨
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// e.printStackTrace();
			}

		} // for

	}

}
