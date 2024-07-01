package ch06.board;

import java.util.Scanner;

public class BoardExam {

	public static Scanner input = new Scanner(System.in);
	public static Member[] members = new Member[100];
	// 멤버의 배열 생성
	public static Board[] boards = new Board[1000];
	// 게시판 배열 생성

	public static void main(String[] args) {
		// 게시판을 구현해보자.
		// 객체는 2개 (Member, Board)
		// 회원제용 게시판 구현 용도
		System.out.println("===========회원제 게시판============");

		boolean run = true;
		while (run) {
			System.out.println("=========== 메인 메뉴 ===========");
			System.out.println("1.회원관리\n2.게시판\n3.종료");
			System.out.print(">>>");
			int select = input.nextInt();
			System.out.println();
			switch (select) {
			case 1:
				System.out.println("회원가입 클래스로 진입합니다.");
				Member member = new Member(); // 빈 객체 생성
				member.menu(input, members); // 멤버 메뉴로 이동하고, input을 보내줌
				break;
			case 2:
				System.out.println("게시판 관리 클래스로 진입합니다.");

				break;
			case 3:
				System.out.println("종료합니다.");
				run = false;
				break;
			default:
				System.out.println("1~3의 숫자만 입력해주세요.");

			} // 스위치

		} // 와일

	} // 메인메서드

} // 클래스