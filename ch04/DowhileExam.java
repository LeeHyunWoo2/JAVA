package ch04;

import java.util.Scanner;

public class DowhileExam {

	public static void main(String[] args) {
		// 업앤다운 게임 만들기
		// 컴퓨터가 랜덤 숫자를 생성한다. (1~50)
		// 사용자가 숫자를 입력한다.
		// 컴퓨터가 랜덤 숫자를 판단하여 업 / 다운을 알려준다.
		// 사용자의 숫자와 컴퓨터의 랜덤숫자가 일치하면 프로그램 종료와 함께 당첨여부를 알린다.

		int answer = (int) (Math.random() * 50) + 1; // 랜덤 숫자 생성 (1~50)
		Scanner input = new Scanner(System.in); // 키보드로 입력받는 객체 생성
		int question = 0; // 사용자가 입력하는 숫자 보관용
		int life = 4; // 초기 남은횟수 밑에서 한번 계산하면서 지나가니까 남은횟수는 3인데 1더해놓음
		int goal = 0;
		String end = "";

		System.out.println("1부터 50사이의 숫자를 입력하세요.");
		System.out.println("3번 안에 맞추시면 상품을 드립니다.\n");
		System.out.println("남은 횟수 :" + (life - 1) + "\n");
		do {
			question = input.nextInt(); // 사용자가 숫자를 키보드로 입력한다.
			System.out.println("남은 횟수 :" + (life - 2));
			life--; // 어차피 루프를 도니까 위에서 이렇게 계산 시키면 편함

			if (life <= 1) {
				end = "===== 게임오버 =====";
				goal = 1;
				break;
			} else if (question > answer) { // 사용자가 입력한 숫자가 답보다 크기 때문에 답이 아래에 있다
				System.out.println("다운\n");
			} else if (question < answer) { // 사용자가 입력한 숫자가 답보다 크기 때문에 답이 위에 있다
				System.out.println("업\n");
			} else if (question == answer) {
				end = "정답입니다.";
				goal = 1;
				break;
			}
		} while (goal != 1); // do~while문 종료
		// 랜덤숫자와 사용자가입력한 숫자가 같이 않으면 do문으로 올라감.
		// 랜덤숫자와 사용자가입력한 숫자가 같으면 내려옴.
		System.out.println("\n" + end);
	}
}
