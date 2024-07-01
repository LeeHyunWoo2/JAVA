package ch06.ScoresCard;

import java.util.Scanner;

public class ScoresMainExam {
	// 필드 -> 멤버 변수로 main에서 사용할 배열이나 객체등을 생성
	private static Scanner input = new Scanner(System.in); // 현재 Class 내의 메서드에서 호출되어 사용함
	// 여러곳에서 쓰러면 앞에 저거 써야함 두개
	private static Student[] st = new Student[5]; // 학생 객체용으로 5칸 배열 생성
	String[] String = new String[5];

	// 생성자 -> main일 경우 new 사용하지 않음 ( 정적(static)으로 사용하지 않음 )

	// 메서드
	public static void main(String[] args) {
		// 주 실행 클래스로, 메뉴와 클래스.메서드 호출용으로 작업
		// 객체 : 학생, 성적, 통계.....

		boolean run = true; // 반복실행 시작을 위한 변수 선언
		while (run) { // 종료시 run = false;

			System.out.println("========== 학생 관리 프로그램 v2(객체) ==========");
			System.out.println("\n1. 학생관리 | 2. 성적입력 | 3. 통계 | 4. 종료");
			System.out.println("\n==========================================");
			System.out.print(">>>");
			int select = input.nextInt(); // 객체 사용 전 private static 확인 필수
			switch (select) {
			case 1:
				System.out.println("\n학생관리 클래스로 진입\n");

				boolean subMenuRun = true;
				while (subMenuRun) {
					System.out.println("1. 학생등록 | 2. 학생보기 | 3. 학생수정 | 4. 학생삭제 | 5.메인메뉴로\n");
					System.out.print(">>>");
					int subMenuSelect = input.nextInt();
					switch (subMenuSelect) {
					case 1:
						System.out.println("학생등록 메뉴 입니다.");
						Student regStudent = new Student(); // Student 객체 생성, 내용물을 넣기위해 불러옴
						System.out.println("이름 : ");
						regStudent.name = input.next(); // 키보드로 받은 이름
						System.out.println("성별 : ");
						regStudent.sex = input.next(); // 키보드로 받은 성별
						System.out.println("학년 : ");
						regStudent.grade = input.nextInt(); // 키보드로 받은 학년
						System.out.println("반 : ");
						regStudent.classroom = input.nextInt(); // 키보드로 받은 반
						System.out.println("학번 : ");
						regStudent.num = input.nextInt(); // 키보드로 받은 학번
						System.out.println("-------- 객체 생성 완료 --------");
						System.out.println("------ 배열 빈칸을 찾아 저장 ------");
						for (int i = 0; i < st.length; i++) {
							if (st[i] == null) { // st배열이 빈칸인지 찾음.
								st[i] = regStudent; // 위에 만든 객체를 넣음
								System.out.println("저장 성공");
								break; // 저장 후 종료
							} // if문 종료

						} // for문 종료 / null을 찾음
						break; // 학생 등록용 정지, case 2가 바로 튀어나오니까
					case 2:
						System.out.println("전체 학생정보 열람");
						for (int i = 0; i < st.length; i++) {
							if (st[i] != null) { // st배열 i칸이 null이 아니면
								System.out.println("---------------------");
								System.out.println("이름 : " + st[i].name); // st[i]에 있는 name을 불러와서 보여줌
								System.out.println("성별 : " + st[i].sex);
								System.out.println("학년 : " + st[i].grade);
								System.out.println("반 : " + st[i].classroom);
								System.out.println("학번 : " + st[i].num);
							} // if문 종료

						} // for st배열 전체 반복
						break; // 학생 보기 브레이크
					case 3:
						System.out.println("수정할 학생명을 입력하세요.");
						System.out.print(">>>");
						String searchName = input.next(); // 키보드로 입력받음
						Student studentInfo = find(searchName); // 아래 만든 메서드가 찾아다줌
						if (studentInfo == null) {
							System.out.println("찾은 학생이 없습니다.");
						} else { // 찾은 학생이 있으면
							System.out.println("수정할 학생 번호를 입력하세요.");
							studentInfo.num = input.nextInt();
							System.out.println("학생 정보 수정 완료");
						} // if문 종료
						break;
					case 4:
						System.out.println("삭제할 학생명을 입력하세요.");
						System.out.print(">>>");
						String deleteName = input.next(); // 지울 이름 입력값 받음
						Student deleteStudent = find(deleteName); // 아래 만든 메서드가 객체를 찾아다줌
						if (deleteStudent == null) {
							System.out.println("입력하신 학생 정보가 없습니다.");
						} else { // 삭제할 학생이 있으면
							for (int i = 0; i < st.length; i++) {
								if (st[i].name.equals(deleteStudent.name)) {
									st[i] = null; // st배열에서 i번 인덱스를 삭제처리
									System.out.println("삭제 완료");
									break; // 지우고 프린트해주고 바로 브레이크 걸어줌. 안걸어주니까 오류뜸
								} // if문 종료
							} // for문 종료
						} // 더 위에 if문 종료
						break;
					case 5:
						System.out.println("메인 메뉴로 복귀합니다.\n");
						subMenuRun = false;
						break;
					default:
						System.out.println("1~5번 값만 입력해주세요.");
					} // switch문 종료

				} // while문 종료

				break;
			case 2:
				System.out.println("\n성적관리 클래스로 진입\n");
				break;
			case 3:
				System.out.println("\n통계 클래스로 진입\n");
				break;
			case 4:
				System.out.println("\n학생 관리 프로그램 종료\n");
				run = false;
				break;
			default:
				System.out.println("\n1~4번 값만 입력하세요.\n");
				// 다시 입력하게 해야 하기 때문에 break;를 작성하면 종료되버림.

			} // 주 메뉴용 switch문 종료

		} // while문 종료

	} // main 메서드 종료

	private static Student find(String name) {
		// 이름으로 객체를 찾아오는 메서드 -> 리턴은 Student 객체
		Student studentInfo = null; // 빈 객체 생성
		for (int i = 0; i < st.length; i++) {
			if (st[i] != null) {
				String arrayName = st[i].name; // st배열 i번째까지 있는 name을 가져옴
				if (arrayName.equals(name)) { // 배열 name과 키보드 name을 비교함
					studentInfo = st[i]; // 찾은 객체를 빈 객체에 넣는다.
					break;
				} // if문안에 if문 종료
			} // if문 종료
		} // for문 종료
		return studentInfo; // 리턴 객체
	} // 학생 찾는 메서드 종료
} // Class 종료
