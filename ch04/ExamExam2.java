package ch04;

import java.util.Scanner;

public class ExamExam2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("주민등록 번호를 입력해주세요.(숫자만)");
		
		String ssn = input.next();
		
		
		char ssn2 = ssn.charAt(6);
		int num = Character.getNumericValue(ssn2);
		String str = "";
		
		
		
		if(num% 2==0){
			str = "여성";
		}else if(num% 2== 1){
			str = "남성";
		}else {
			System.out.println("오류");
		}
		
		
		
		int year = Integer.parseInt(ssn.substring(0,2));
		int age = 0;
		
		switch(num){
		case 1,2,5,6 :
			age = 2024 - (1900 + year);
		    break;
		
		case 3,4,7,8 :
			age = 2024 - (2000 + year);
		    break;
		    
		default :
			System.out.println("잘못 입력하셨거나, 사람이 아닙니다.");
		    break;
		} // 스위치 종료
		
		System.out.printf("성별 : %s\n나이 : %d\n",str,age);
		
	} // 메인

} // 클래스