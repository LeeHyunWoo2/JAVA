package ch10;

public class StringBufferExam { // 구형

	public static void main(String[] args) {
		// String으로 만든 문자열은 객체로 추가나 변경이 안되고 새로운 객체로 또 만듦.
		// StringBuffer는 문자열을 수정과 변경 할 수 있다.
		// StringBuilder는 StringBuffer와 다르게 멀티 스레드 환경에서 안정적이지 않음
		// StringBuilder는 싱글 스레드 환경에서 StringBuffer보다 더 빠른 성능을 가짐

		StringBuffer stringBuffer = new StringBuffer(); // 16개 문자열 배열
		StringBuffer stringBuffer1 = new StringBuffer("Hello "); // 6개 문자열 배열
		StringBuffer stringBuffer2 = new StringBuffer(50); // 50개 문자열 배열
		StringBuffer stringBuffer3 = new StringBuffer("Hello ");

		stringBuffer1.append("Programming"); // Hello Programming
		System.out.println(stringBuffer1);

		stringBuffer1.insert(6, "Java ");
		System.out.println(stringBuffer1);

		stringBuffer1.replace(1, 4, "Good"); // 1번자리부터 4번직전자리까지 지워버리고 Good을 삽입
		System.out.println(stringBuffer1);

		stringBuffer1.delete(1, 5);
		System.out.println(stringBuffer1);

		stringBuffer1.reverse();
		System.out.println(stringBuffer1);

		System.out.println(stringBuffer1.equals(stringBuffer3));
		// 스트링버퍼는 equals 재정의가 안되서 비교용도로 못씀

	}
	
	// 그래서 밑에 이거 쓴다는데 나중에 배우기로함

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

}
