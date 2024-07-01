package ch03;

import java.util.Scanner;

public class PrintfExam {

	public static void main(String[] args) {
		// System.out.printf()는 포멧팅용 출력을 진행함.
		// 대부분 규격, 양식을 맞출때 활용한다.
		
		
		Scanner input = new Scanner(System.in) ; // 키보드로 입력받을 객체 생성
		System.out.println("======================================");
		System.out.print("이름 : ");  // 길면 ln쓰고 짧으면 그냥 프린트로
		String name = input.next();  // 문자열 입력용
		
		System.out.print("나이 : ");
		int age = input.nextInt(); // 정수 입력용
		
		System.out.print("평균 : ");
		double ave = input.nextDouble(); // 실수 입력용
		
		
		System.out.printf("현재 당신의 이름은 %s\n  당신의 나이는 %d\n   평균은 %5.2f\n 입니다. ",name, age, ave);  // 문자, 숫자, 5칸에 + 소숫점2자리까지
		
		
		

	}

}
