package ch06.circle;

public class CircleExam {

	public static void main(String[] args) {
		// 주 메뉴가 되는 클래스로 내가 만든 라이브러리 클래스를 new로 인스턴스화

		Circle circle = new Circle();
		// 스택 힙

		
		
		
		circle.name = "이현우"; // new String("이현우"); 가 원래 모습인데 생략가능
		circle.radius = 20;

		
		
		
		// 동작
		double result = circle.getArea(); // 메서드 호출(동작 -> 리턴)
		System.out.println("원의 넓이 : " + circle.radius);
		System.out.println("작성자 : " + circle.name);
		System.out.println("동작 결과 + " + result);

		
		
		
	}// 메인

}// 클래스
