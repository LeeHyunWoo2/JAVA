package ch08.lineage.service;

import java.util.Scanner;

import ch08.lineage.dto.AccountDTO;

public class LoginService {
	// 로그인에 관한 부메뉴 용도

	public static AccountDTO menu(Scanner scanner, AccountDTO[] accountDTOs, AccountDTO loginAccount) {

		System.out.println("1로그인 2회원가입 3정보수정 4메인메뉴로");
		System.out.print(">>>");
		int select = scanner.nextInt();
		switch (select) {
		case 1:
			System.out.println("로그인을 시작합니다.");
			System.out.print("ID : ");
			String id = scanner.next();
			System.out.print("PW : ");
			String pw = scanner.next();
			AccountDTO accountDTO = new AccountDTO();
			accountDTO.setId(id);
			accountDTO.setPw(pw); // 새로만든 account 객체에 id pw 삽입 (세터로)

			// 배열에 있는 값 비교
			for (int i = 0; i < accountDTOs.length; i++) {
				if (accountDTOs[i] != null) {
					if (accountDTOs[i].getId().equals(accountDTO.getId())) {
						System.out.println("해당 id가 있습니다");
						if (accountDTOs[i].getPw().equals(accountDTO.getPw())) {
							System.out.println("해당 pw가 있습니다");
							loginAccount = accountDTOs[i];
							break;
						} else {
							System.out.println("해당 pw가 없습니다");
						}
					} else {
						System.out.println("id가 없습니다");
					}
				} else {// 빈 객체 비교
					System.out.println("가입부터 하세요");
					break;
				}
			} // for문 종료

			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;

		} // 스위치

		return loginAccount;
	}// 메뉴

}// 클
