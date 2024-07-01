package ch02;

public class ShortExam {

	public static void main(String[] args) {
		// short은 char와 같이 16bit로 처리되는데 양수, 음수 처리가 됨. (-32,678 ~ 32767 까지 표현)
		
		short sh1 = -32768 ;
		int sh2 = -32769 ; // Type mismatch: cannot convert from int to short
		short sh3 = 32767 ;
		int sh4 = 32768 ; // Type mismatch: cannot convert from int to short
		System.out.print(sh1) ;
	}
}
