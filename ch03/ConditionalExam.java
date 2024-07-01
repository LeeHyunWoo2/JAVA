package ch03;

import java.util.Scanner;

public class ConditionalExam {

	public static void main(String[] args) {
		// 3항 연산자는 if를 간단히 처리하기 위해 활용된다.
		// (조건식) ? 참 : 거짓 ;
		
		int score = 85 ;
		char grade = (score > 90) ? 'A' : 'B' ;		
		System.out.println(score + "\t 점은 \n" + grade + "\t 등급입니다.");
		

	}

}
