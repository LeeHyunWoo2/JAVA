package ch08.lineage.service;

import java.util.Scanner;

import ch08.lineage.dto.AccountDTO;
import ch08.lineage.dto.ElfDTO;
import ch08.lineage.dto.HumanDTO;
import ch08.lineage.dto.KnightDTO;

public class CharacterService {

	// 객체를 이용하여 캐릭터 선택용 부메뉴

	public static void menu(Scanner scanner, AccountDTO logAccountDTO, KnightDTO knightDTO, ElfDTO elfDTO) {

		System.out.println("1기사 2엘프 3마법사 4도적 5종료");
		System.out.println(">>>");
		int select = scanner.nextInt();
		switch (select) {
		case 1:
			System.out.println("기사선택");
			logAccountDTO.setHumanDTO(knightDTO);
			// humanDTO = knightDTO;
			// System.out.println(logAccountDTO.getNickName() + "님" +
			// logAccountDTO.getKnightDTO() + "캐릭터를 선택하셨습니다.");
			System.out.println("님" + logAccountDTO.getHumanDTO().getName() + "캐릭터를 선택하셨습니다.");
			break;
		case 2:
			System.out.println("엘프선택");
			// humanDTO = elfDTO;
			logAccountDTO.setHumanDTO(elfDTO);
			System.out.println("님" + logAccountDTO.getHumanDTO().getName() + "캐릭터를 선택하셨습니다.");
			break;
		case 3:
			System.out.println("마법사선택");
			break;
		case 4:
			System.out.println("도적선택");
			break;
		case 5:
			System.out.println("종료");
			break;
		default:
			System.out.println("1~5");
		}// 스위치

	}// 메뉴

}// 클