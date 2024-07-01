package ch11.throwsExam;

public class ThrowsExam {

	public static void main(String[] args) {
		// throws는 예외 발생시 예외처리하는 곳으로 떠넘기는 코드

		try { // 호출할곳은 try catch 사용
			findClass();
		} catch (ClassNotFoundException e) { // 떠넘긴게 여기로 옴
			System.out.println("클래스가 존재하지 않습니다.");
			// e.printStackTrace();
		}

	}
	
	// 그냥 Exception 만 써도 됨
	public static void findClass() throws ClassNotFoundException { // 클래스를 찾아주는 메서드
		 // 떠넘기는건 throws                호출한곳으로 떠넘김 (findClass)
		Class clazz = Class.forName("java.lang.String2");
		System.out.println(clazz + "가 존재합니다.");
	}

}