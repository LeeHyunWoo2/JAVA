package ch12.shareThread;

public class User1 extends Thread{
	
	// 필
	private Calculator calculator;
	
	
	
	// 생
	
	
	
	
	// 메
	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(100);
	}
	

}
