package ch12.shareThread;

public class User2 extends Thread{
	
	// 필
	private Calculator calculator;
	
	
	
	// 생
	
	
	
	
	// 메
	public void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(50);
	}
	

}
