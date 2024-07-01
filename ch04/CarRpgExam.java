package ch04;

import java.util.Scanner;

public class CarRpgExam {

	public static void main(String[] args) {
		// 메뉴 출력
		// 시동 확인
		// 현재속도 출력
		// 주행
		// 종료하기

		Scanner input = new Scanner(System.in);

		boolean start = true; // 변수 선언하고 트루로 시작해서 밑에 쓸 와일에서 start가 false 되면 종료되게끔
		int speed = 0; // 시동걸고 첫 속도
		final int MAXSPD = 200; // 최대속도로 써먹을 고정상수 선언

		System.out.println("탑승을 환영합니다.");
		System.out.println("현재속도 " + speed + " km/h"); // 처음에 보여줄 화면
		System.out.println("1.시동");

		int type = input.nextInt(); // 키보드 입력 받음
		if (type == 1) { // 시동을 켜려고 하면
			Boolean pswd = true;

			while (pswd) { // 인증 루프 시작
				System.out.println("사용자 인증이 필요합니다.");
				System.out.println("성함을 입력해주세요");
				String type5 = input.next();
				if (!type5.equals("1")) { // 이현우가 '아닐' 경우 출력
					System.out.println(type5 + " 님은 차량 소유주가 아닙니다.\n");
				} else {
					System.out.println("비밀번호를 입력해주세요 (P@ssw0rd)");
					String type4 = input.next();

					if (type4.equals("1")) { // 문자열 비교니까 .이퀄스
						System.out.println(type5 + "님 탑승을 환영합니다.");
						pswd = false;
						break;
					} else {
						System.out.println("비밀번호가 틀렸습니다.");
					}
				}
			}

			// =================== 메뉴 시작 ===================

			while (start) { // while문 시작. 계속 메뉴를 불러옴
							// 이 안에서 루프되야할것과 되면 안되는걸 잘 생각해서 분리해야함

				System.out.println("=======================");
				System.out.println("1.가속");
				System.out.println("2.감속");
				System.out.println("3.네비게이션");
				System.out.println("4.정지 및 종료");
				System.out.println("=======================");

				int type2 = input.nextInt(); // 무한반복 메뉴 안에서 입력받을거니까 와일 안에다가 입력받는 코드 넣음

				switch (type2) {
				case 1:
					System.out.println("가속합니다.");
					speed += 20;
					if (speed >= MAXSPD) {// 만약 스피드가 맥스피드 이상이면
						speed = MAXSPD; // 맥스피드로 출력
					}
					System.out.println(speed + " km/h");
					break;
				case 2:
					System.out.println("감속합니다.");
					speed -= 20;
					if (speed < 0) {
						System.out.println("당신은 물리법칙을 무시하셨습니다.");
						System.out.println("-100km/h 가 되면 자폭합니다");
					}
					System.out.println(speed + " km/h");
					break;
				case 3:
					boolean map = true; // 별도의 메뉴를 만들거라서 불리언 변수 하나 추가함

					while (map) { // 네비 똑바로 고를때까지 루프
						System.out.println("네비게이션으로 전환합니다.\n 1.집 2.회사 3.주유소");
						int type3 = input.nextInt();
						switch (type3) {
						case 1:
							System.out.println("집으로 향하는 최적경로를 탐색합니다.");
							map = false;
							break;
						case 2:
							System.out.println("회사로 향하는 최적경로를 탐색합니다.");
							boolean combat = true;
							while (combat) {
								System.out.println("\n이런, 당신은 주차장에서 악덕 사장을(를) 만났다!");
								System.out.println("행동목록\n\n1.변신\n2.도망치기 ");
								int type6 = input.nextInt();
								switch (type6) {
								case 1:
									int enemy = 1000; // 적 초기 HP
									int hp = 1000; // 플레이어 초기 HP
									int guard = 0; // 플레이어 초기 방어도
									boolean combat2 = true;
									System.out.println("당신의 차량은 사실 범블비였고 오토봇으로 변신했다!");
									System.out.println("\n\n전투 돌입\n\n");
									System.out.println("\n==========\n행동목록\n\n1.공격\n2.방어\n==========");
									while (combat2) { // 아까 boolean 안넣어서 빨간줄 뜬채로 5분은 멍때렸음 까먹기 쉬운듯
										String hpbar = "";
										String hpbar2 = "";
										switch (enemy / 100) { // 이거 보기 드럽긴한데 두 switch를 하나로 합칠 방법을 모르겠습니다 변수가 두개라 팁좀....
										case 10:
											hpbar = "■■■■■■■■■■";
											break;
										case 9:
											hpbar = "■■■■■■■■■□";
											break;
										case 8:
											hpbar = "■■■■■■■■□□";
											break;
										case 7:
											hpbar = "■■■■■■■□□□";
											break;
										case 6:
											hpbar = "■■■■■■□□□□";
											break;
										case 5:
											hpbar = "■■■■■□□□□□";
											break;
										case 4:
											hpbar = "■■■■□□□□□□";
											break;
										case 3:
											hpbar = "■■■□□□□□□□";
											break;
										case 2:
											hpbar = "■■□□□□□□□□";
											break;
										case 1:
											hpbar = "■□□□□□□□□□";
											break;
										}
										switch (hp / 100) {
										case 13:
											hpbar2 = "■■■■■■■■■■+■■■";
											break;
										case 12:
											hpbar2 = "■■■■■■■■■■+■■";
											break;
										case 11:
											hpbar2 = "■■■■■■■■■■+■";
											break;
										case 10:
											hpbar2 = "■■■■■■■■■■";
											break;
										case 9:
											hpbar2 = "■■■■■■■■■□";
											break;
										case 8:
											hpbar2 = "■■■■■■■■□□";
											break;
										case 7:
											hpbar2 = "■■■■■■■□□□";
											break;
										case 6:
											hpbar2 = "■■■■■■□□□□";
											break;
										case 5:
											hpbar2 = "■■■■■□□□□□";
											break;
										case 4:
											hpbar2 = "■■■■□□□□□□";
											break;
										case 3:
											hpbar2 = "■■■□□□□□□□";
											break;
										case 2:
											hpbar2 = "■■□□□□□□□□";
											break;
										case 1:
											hpbar2 = "■□□□□□□□□□";
											break;
										}
										System.out.println("\n사장 : " + hpbar); // hp바 표시 보기
										System.out.println("사장의 체력 : " + enemy); // hp수치 보기
										System.out.println("\n플레이어 : " + hpbar2);
										System.out.println("플레이어의 체력 : " + hp);

										int type7 = input.nextInt();
										System.out.println("\n==========\n행동목록\n\n1.공격\n2.방어\n==========");
										switch (type7) {
										case 1:
											int attack = (int) (Math.random() * 300 + 1); // *(최대값 - 최소값)) + 최소값)범위공식
											int damaged = (int) (Math.random() * 250 + 1);
											System.out.println("\n" + attack + "의 데미지를 줬다!");
											System.out.println("하지만 사장이 당신에게" + damaged + "만큼의 공격을 했다!");
											enemy -= attack;
											hp -= damaged;
											break;

										case 2:
											int guard2 = (int) (Math.random() * 300 + 1);
											int damaged2 = (int) (Math.random() * 250 + 1);
											System.out.println("당신은" + guard + "만큼의 방어도를 얻었다!");
											System.out.println("하지만 사장이 당신에게" + damaged2 + "만큼의 공격을 했다!\n\n");
											hp += (guard2 - damaged2);
											if(hp>=1300) {
												System.out.println("방어도가 가득 찼다.");
												hp = 1300;
											}
											break;
										}
										if (enemy <= 0 && hp <= 0) {
											System.out.println(
													"\n=======================\n\n\n☠ 둘다 죽었습니다. ☠\n\n\n=======================");
											combat2 = false;
											break;
										} else if (enemy <= 0) {
											System.out.println("\n============\n\n사장이 쓰러졌다!\n\n============");
											System.out.println("\n당신은 평화로운 일상을 쟁취했다.\n\n\n\n=======================");
											combat2 = false;
											break;
										} else if (hp <= 0) {
											System.out.println(
													"\n=======================\n\n\n☠ 당신의 차가 죽었습니다. ☠\n\n\n=======================");
											combat2 = false;
											break;
										}
									}
									combat = false;
									speed = 0; // 전투가 끝났을때 속도가 0부터 시작하도록 설정
									break;
								case 2:
									System.out.println("당신은 사무실로 도망쳤다!");
									System.out.println("일과를 마친 후 다시 차량에 탑승했다.");
									combat = false;
									break;

								default:
									System.out.println("다시 입력해주세요.");
								}

							} // 여기까지가 전투 반복문
							map = false;
							break;
						case 3:
							System.out.println("가까운 주유소로 향하는 경로를 탐색합니다.");
							map = false;
							break;
						default:
							System.out.println("다시 입력해주세요.");
							break; // 여기엔 map = false를 하지않음 제대로 고를때까지 반복해야 하기 때문
						}
					}
					System.out.println(speed + " km/h");
					break;
				case 4:
					System.out.println("시동정지 및 시스템을 종료합니다.");
					start = false;
					break;
				default:
					System.out.println("다시 입력해주세요.");
					break;

				} // 스위치 (메뉴 역할이라서 와일 안에서 같이 도는 스위치)
				if (speed <= -100) { // 과속센서마냥 속도가 특정 값을 넘어갈경우 작동하는 트리거 만들어보고싶었음 그래서 마이너스엔 한계치 안넣음
					System.out.println("\n=======================\n\n\n☠ 당신은 죽었습니다. ☠\n\n\n=======================");
					break;
				}

			} // 와일

		} // 맨 위에 if

	} // 메인메서드

} // 클래스
