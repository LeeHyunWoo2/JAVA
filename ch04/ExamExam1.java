package ch04;

import java.util.Scanner;

public class ExamExam1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("받아쓰기 테스트 test를 입력하시오");
		String asd = input.nextLine();
		
		if(asd.equalsIgnoreCase("test")) {
			System.out.println("잘햇어요");

		}else {
			System.out.println("다시쓰새요");
		}

	}

}