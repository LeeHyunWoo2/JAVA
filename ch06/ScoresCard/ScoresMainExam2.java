package ch06.ScoresCard;

import java.util.Scanner;

public class ScoresMainExam2 {

	private static Scanner input = new Scanner(System.in); // 현재 클래스에서 쓸 스캐너
	private static Student2[] stdt1 = new Student2[4]; // Students에 배열 stdt1라는걸 객체용 배열 4칸 생성

	public static void main(String[] args) { // 문자열 배열을 사용하겠다. 변수명은 args

		boolean run = true; // 메뉴를 계속 켜기 위해 run이라는 변수를 뺑뻉이돌림
		while (run) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1.학생등록\n2.정보열람\n3.정보수정\n4.정보삭제\n5.종료");
			System.out.println("===============");
			System.out.print(">>>");
			int menu1 = input.nextInt();
			switch (menu1) {
			case 1:
				System.out.println("학생 등록 메뉴입니다.");
				Student2 Studentsinfo = new Student2(); // Students 클래스에 곧 입력될 정보를 넣을거고 Studentsinfo라고 변수선언함
				System.out.println("학생의 이름을 입력해주세요.");
				Studentsinfo.name = input.next(); // 키입력 받는걸 스튜던트인포.name에 넣음
				System.out.println("학생의 학년을 입력해주세요.");
				Studentsinfo.grade = input.nextInt();
				System.out.println("학생의 반을 입력해주세요.");
				Studentsinfo.classroom = input.nextInt();
				System.out.println("학생의 번호를 입력해주세요.");
				Studentsinfo.number = input.nextInt();
				System.out.println("입력완료, 빈칸을 찾아 저장합니다."); // Students 라는 클래스에 만들어진 배열을 검사함
				for (int i = 0; i < stdt1.length; i++) { // 따라서 위에 선언한 stdt1을 사용, .length로 자릿수를 확인
					if (stdt1[i] == null) { // 해당위치가 만약 null 즉 빈칸이라면
						stdt1[i] = Studentsinfo; // 거기다 위에 만든 Studentsinfo 객체를 넣음
						System.out.println("저장 성공");
						break;
					} // if문 종료
				} // for문 종료
				break;
			case 2:
				System.out.println("정보열람 메뉴로 이동합니다.\n");
				Boolean inforun = true;
				while (inforun) {
					System.out.println("================정보열람 메뉴 ================");
					System.out.println("\n    어떤 정보를 불러오시겠습니까?    \n");
					System.out.println("1.전체\n2.학년\n3.학년+반\n4.특정학생\n5.나가기");
					System.out.print(">>>");
					int menu2 = input.nextInt();
					switch (menu2) {
					case 1:
						System.out.println("전체 정보를 불러옵니다.\n");
						for (int i = 0; i < stdt1.length; i++) {
							if (stdt1[i] != null) { // stdt의 i번 인덱스가 null이 아닐 경우에만 아래를 출력
								System.out.println("이름 : " + stdt1[i].name);
								System.out.println("학년 : " + stdt1[i].grade);
								System.out.println("반 : " + stdt1[i].classroom);
								System.out.println("번호 : " + stdt1[i].number);
								System.out.println();
							} // if종료
						} // for 종료
						break;
					case 2:
						System.out.println("\n학년별 정보를 불러옵니다.");
						System.out.println("1~3중 원하시는 학년을 입력해주세요");
						System.out.print(">>>");
						int menu3 = input.nextInt();
						switch (menu3) {
						case 1, 2, 3:
							for (int i = 0; i < stdt1.length; i++) {
								if (stdt1[i] != null) { // 여기서 null체크를 먼저 안적고
									if (stdt1[i].grade == menu3) { // 여기다 and로 널체크했더니 남은 자리까지 다읽어버려서 오류뜸
										System.out.println("\n이름 : " + stdt1[i].name);
										System.out.println("학년 : " + stdt1[i].grade);
										System.out.println("반 : " + stdt1[i].classroom);
										System.out.println("번호 : " + stdt1[i].number);
										System.out.println();
									} // if
								} // 널체크if
							} // for
							break;
						default:
							System.out.println("1~3중 입력해주세요.");
						} // switch
						break;
					case 3:
						System.out.println("학년+반 정보를 불러옵니다.");
						System.out.println("원하시는 학년을 입력해주세요.");
						System.out.print(">>>");
						int menu4 = input.nextInt();
						switch (menu4) {
						case 1, 2, 3:
							System.out.println("원하시는 반을 입력해주세요.");
							System.out.print(">>>");
							int menu5 = input.nextInt();
							for (int i = 0; i < stdt1.length; i++) {
								if (stdt1[i] != null) { // 여기서 null체크를 먼저 안적고
									if (stdt1[i].grade == menu4 && stdt1[i].classroom == menu5) {
										System.out.println("\n이름 : " + stdt1[i].name);
										System.out.println("학년 : " + stdt1[i].grade);
										System.out.println("반 : " + stdt1[i].classroom);
										System.out.println("번호 : " + stdt1[i].number);
										System.out.println();
									} // if
								} // 널체크if
							} // for
							break;
						default:
							System.out.println("1~3중 입력해주세요.");
						} // switch
						break;
					case 4:
						System.out.println("특정 학생 정보를 불러옵니다.");
						break;
					case 5:
						System.out.println("나갑니다.");
						inforun = false;
						break;
					default:
						System.out.println("1~5번을 입력해주세요.");
					} // switch 종료
				} // while 종료
				break;

			} // switch 종료

		} // 메인화면 while 종료

	} // main 종료

} // 클래스 종료
