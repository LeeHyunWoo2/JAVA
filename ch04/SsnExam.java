package ch04;

import java.util.Scanner;

public class SsnExam {

	public static void main(String[] args) {
		// 주민등록번호 7번째 글자를 입력 받아 남/여 파악용
		
		Scanner input = new Scanner(System.in);
		System.out.print("주민등록번호 7번째 숫자 입력 : ");
		int ssn = input.nextInt();
		char man = ' ';

		
		
		if (ssn == 1 || ssn == 3) {
			man = '남';
		}
		
		else if(ssn == 2 || ssn == 4) {{
			man = '여';			
		}
		
		System.out.printf("당신의 성별은 : %s성 입니다." , man);
		
	}else { System.out.println("오류");
		
		}
		

	}

}
