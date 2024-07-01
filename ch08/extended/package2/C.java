package ch08.extended.package2;

import ch08.extended.package1.A;

public class C extends A {

	// 필
	
	
	

	// 생 -> 다른 클래스에서는 생성자로 부모 객체를 연결
	public C() {
		super();
		this.field = "java";
		this.method();
	}

	
	
	// 메
	public void method() {

		// A a = new A;
		// a.field = "자바";
		// a.method(); // 다른 패키지라서 못받음 (protected)
	}

}
