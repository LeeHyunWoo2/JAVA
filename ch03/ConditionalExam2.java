package ch03;

import java.util.Scanner;

public class ConditionalExam2 {

	public static void main(String[] args) {
		
		int score = 0 ;
		Scanner input = new Scanner(System.in) ;
		
		System.out.println("점수를 입력하세요.");
		score = input.nextInt() ;
		
		char grade = (score > 90) ? 'A' : (score > 80) ? 'B' : (score > 70) ? 'C' : (score >= 60) ?	'D' : 'F' ;
		System.out.println(score + "\t 점은 \n" + grade + "\t 등급입니다.");
		

	}

}