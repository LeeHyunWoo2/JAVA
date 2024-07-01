package ch04;

import java.util.Scanner;

public class IfSsnExam {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("주민번호 써주세요 (-는제외) ");
		
		String ssn1 = input.next();
		
		char ssn2 = ssn1.charAt(6); // 문자열에서 해당 자릿수의 문자를 추출하는 메서드 (0부터 시작함)
		int num = Character.getNumericValue(ssn2); // 문자에서 코드값 int로 꺼내옴
		
		
		if(num% 2==0) {// 2로 딱 나눠지면
			System.out.println("여성");
		} else if(num% 2==1) {
			System.out.println("남성");
		} else {System.out.println("다시 입력해주세요");}
		
		
		int year = Integer.parseInt(ssn1.substring(0, 2)); // 태어난 년도 추출 (0번부터 2번"이전"의 자리까지 추출)
		
		if(num == 1 || num == 2 || num == 5 || num == 6){
			System.out.println("나이는" + (2024 - (1900 + year)) +" 입니다.");
				
			} else if(num == 3 || num == 4 || num == 7 || num == 8)
			System.out.println("나이는" + (2024 - (2000 + year)) +" 입니다.");
			else {
				System.out.println("다시 입력해주세요.");
			}
		
		int month = Integer.parseInt(ssn1.substring(2, 4)); // 태어난 달 추출
		
		
		
		
		

	}

}
