package ch07.exam1.package1;

public class A {
	
	// 접근 제한자를 생략하면 default 처리됨
	//필
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("아무말");
	
	
	//생
	public A(boolean b) {
		// public 공용 -> 어디서나 사용 가능
	}
	A(int b){ // default 접근 제한
	}
	private A (String s) { // private 접근 제한
						   // 자신 클래스 안에서만 허용
	}

	
	//메

}
