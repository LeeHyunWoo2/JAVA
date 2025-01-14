package ch11.tryCatch;

import java.util.Scanner;

public class TryCatchExam {

	public static void main(String[] args) {
		// 예외처리문의 기본은 try - catch - finally
		// try -> 예외발생가능 코드
		// catch -> 예외처리 코드
		// finally -> 항상 실행되는 코드
		// 예외처리는 대부분 이클립스가 빨간 밑줄로 알려주지만
		// 실행 후 발생하는 런타임 예외는 경험으로 처리해야함

		Scanner scanner = new Scanner(System.in);
		boolean condition = true;
		while (condition) {
			try {
				Class clazz = Class.forName(scanner.next()); // 스캐너 찾는 코드
				System.out.println("클래스가 존재합니다.");
				// 예외가 발생할 수 있는 확률이 있는 코드

			} catch (ClassNotFoundException e) {
				System.out.println("클래스가 존재하지 않습니다.");
				// e.printStackTrace();
				// printStackTrace 는 로그 뜨는걸 출력하는 코드
			} finally {
				System.out.println("프로그램이 종료 됩니다.");
			} 
		}

	}

}
