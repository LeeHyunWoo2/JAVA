package ch02;

public class LongExam {

	public static void main(String[] args) {
		// long 타입은 int타입의 2배인 64bit 값을 갖는다.
		// 대부분 금융, 은행, 증권 등 돈에 관련된 변수타입으로 사용됨.
		// 초기값 입력시 int와 차이를 주기 위해 숫자 뒤에 l,L울 붙인다. (헷갈릴 수 있으니 대문자를 주로 씀)
		
		long var1 = 10 ; // int 범위에서는 L 생략 가능함.
		long var2 = 20L ;
		long var3 = 2222222222222222222L ; // int 범위 초과시 L은 필수
		// The literal 2222222222222222222 of type int is out of range 

	}

}
