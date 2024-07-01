package ch04;

import java.util.Scanner;

public class ForSumExam {

	public static void main(String[] args) {
		// 키보드로 입력 받은 값을 반복 더해주는 코드
		
		Scanner inputInt = new Scanner(System.in);
		
		int sum = 0; // 반복해서 더해주는 결과값 (여기다 더한다)
		int x = 0; // 초기 값
		int y = 0; // 종료 값
		System.out.print("더할 처음값을 입력하세요. : ");
		x = inputInt.nextInt(); // 키보드로 입력한 초기값 저장
		int z = x;
		
		System.out.print("더할 마지막 값을 입력하세요. : ");
		y = inputInt.nextInt(); // 키보드로 입력한 종료값 저장
		
		
		for( ; x<=y ; x++  ) { // 위에 초기값 적어놔서 그냥 초기값 칸 비워도 됨
			sum = sum + x;
		}
		
		System.out.println(z +"~ "+y +"까지의 누적 합게 값은" + sum);

	}

}
