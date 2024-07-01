package ch08.lineage;

import java.util.Scanner;

import ch08.lineage.dto.AccountDTO;
import ch08.lineage.dto.ElfDTO;
import ch08.lineage.dto.HumanDTO;
import ch08.lineage.dto.KnightDTO;
import ch08.lineage.service.CharacterService;
import ch08.lineage.service.LoginService;

public class LineageExam {
	
	public static Scanner scanner = new Scanner(System.in);
	public static AccountDTO[] accounts = new AccountDTO[10]; //로그인용 배열
	public static AccountDTO loginAccount; //로그인 성공시 객체(세션)
	public static KnightDTO knightDTO = new KnightDTO();
	public static ElfDTO elfDTO = new ElfDTO();
	public static HumanDTO humanDTO = null;
	
	static {
		knightDTO.setSword("양손검");
		knightDTO.setArmor("징 박힌 갑옷");
		knightDTO.setShield("징 박힌 방패");
		knightDTO.setName("양기사");
		knightDTO.setSex("남자");
		knightDTO.setLevel(1);
		knightDTO.setHp(5000);
		knightDTO.setMp(50);
		knightDTO.setMoney(500000);
		
		elfDTO.setBow("양손활");
		elfDTO.setDress("천사드레스");
		elfDTO.setArrow("크리티컬 화살");
		elfDTO.setName("저요정");
		elfDTO.setSex("여자");
		elfDTO.setLevel(1);
		elfDTO.setHp(3000);
		elfDTO.setMp(2000);
		elfDTO.setMoney(1000000);
		
		AccountDTO accountDTO = new AccountDTO(); // 테스트용 계정 생성
		accountDTO.setId("kkk");
		accountDTO.setPw("kkk");
		accountDTO.setNickName("kkk");
		accounts[0] = accountDTO; // 배열 0 번에 계정 객체를 연결
		
	} //db대신 초기값 지정하는 역할 (생성자 대신)
	
	
	

	public static void main(String[] args) {
		// 객체 간의 상속을 알아본다.
		// 부모객체는 자식객체에게 모든 정보를 상속한다.
		// 자식객체는 부모객체의 정보를 받아 사용하며 추가적인 정보를 생성하여 활용함
		
		System.out.println("게임시작");
		boolean run = true;
		while (run) {
			System.out.println("1로그인 2캐선 3실행 4종료");
			System.out.print(">>>");
			int select = scanner.nextInt();
			switch(select) {
			case 1:
				System.out.println("로그인합니다");
				loginAccount = LoginService.menu(scanner, accounts, loginAccount);
				break;
			case 2:
				System.out.println("캐릭터를선택합니다");
				CharacterService.menu(scanner, loginAccount, knightDTO, elfDTO);
				break;
			case 3:
				System.out.println("게임 시작");
				break;
			case 4:
				System.out.println("종료");
				run = false;
				break;
			default:
				System.out.println("1~4");
			}// 스위치
			
		} // 와일

	}//메서드

} // 클
