package ch10;

public class StringBuilderExam { // 신형
	
	public static void main(String[] args) {
		// StringBuilder는 신형 문자열 처리 방법으로 객체의 문자열을 수정, 추가 할 수 있다.
		// 동기화 되지 않는다는 점을 제외하고는 StringBuilder 클래스와 메서드가 같다. (비동기화)
		// 동기화 : 변수를 같이 쓰는 개념 (사용자 입장에선 새로고침처럼 보임)
		// 구현에서 빠르기 때문에 우선적으로 활용한다.
		

		StringBuilder stringBuilder = new StringBuilder(); // 16개 문자열 배열
		StringBuilder stringBuilder1 = new StringBuilder("Hello "); // 6개 문자열 배열
		StringBuilder stringBuilder2 = new StringBuilder(50); // 50개 문자열 배열
		StringBuilder stringBuilder3 = new StringBuilder("Hello ");

		stringBuilder1.append("Programming"); // Hello Programming
		System.out.println(stringBuilder1);

		stringBuilder1.insert(6, "Java ");
		System.out.println(stringBuilder1);

		stringBuilder1.replace(1, 4, "Good"); // 1번자리부터 4번직전자리까지 지워버리고 Good을 삽입
		System.out.println(stringBuilder1);

		stringBuilder1.delete(1, 5);
		System.out.println(stringBuilder1);

		stringBuilder1.reverse();
		System.out.println(stringBuilder1);

		System.out.println(stringBuilder1.equals(stringBuilder3));
		// 스트링버퍼는 equals 재정의가 안되서 비교용도로 못씀

		
	}

}
