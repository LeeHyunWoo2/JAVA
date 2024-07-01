package ch02;

public class CastingExam {

	public static void main(String[] args) {
		// casting은 강제 타입 변환으로 큰타입을 강제타입으로 강제 주입할때 사용
		// 단, 손실이 발생 -> 2진법에 영향받음
		// int 변수명 = (int) double값 ;
		
		int intValue = 12345678 ;
		byte bytevalue = (byte) intValue ;  // Type mismatch: cannot convert from int to byte
		
		System.out.println("int 값 : " + intValue);
		System.out.println("byte 값 : " + bytevalue);
		
		
		
		System.out.println("--------------자동 타입 변환---------------");
		int intValue1 = 10 ;
		double doubleValue1 = 5.5 ;
		double result1 = intValue1 + doubleValue1 ;
		System.out.println("int10 + double 5.5 = " + result1 );
		
		
		System.out.println("----------정수로 결과를 봄----------");
		int result2 = intValue1 + (int)doubleValue1 ;  // 강제 타입 변환
		System.out.println("int 10 + double 5.5 = " + result2);

	}

}
