package ch08.extended.calculator;

public class Computer extends Calculator {

	@Override // 재정의
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 재정의 결과");
		return Math.PI * r * r; // 리턴값을 이걸로 재정의함
	} // 최신형 컴퓨터 (자식 클래스)

}
