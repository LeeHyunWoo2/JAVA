package ch06.board;

import java.util.Scanner;

public class Member { // 회원에 대한 CRUD
	// 필드 -> 멤버변수
	String id;
	String pw;
	String nickName;
	String email;

	// 생성자 -> new로 객체 생성시 사용(생략 시 기본 생성자가 자동으로 만들어 짐)
	// Member member = new Member();

	// 메서드 -> 동작( CRUD )

	public Member register(Scanner input) {
		// 새로운 Member 객체를 생성하여 키보드로 넣은 필드값을 삽입하고 객체로 리턴
		Member newMember = new Member(); // 압축파일 이름 짓는거랑 비슷

		// 이 아래 애들을 객체로 압축파일마냥 모아서 저쪽으로 보낸다는 뜻
		System.out.println("아이디를 입력하세요.");
		newMember.id = input.next();
		System.out.println("암호를 입력하세요.");
		newMember.pw = input.next();
		System.out.println("닉네임을 입력하세요.");
		newMember.nickName = input.next();
		System.out.println("이메일을 입력하세요.");
		newMember.email = input.next();
		return newMember;
	}

	public Member login(Scanner input, Member[] members) { // 기존의 배열
		// 매개값 키보드 입력 회원 배열
		Member loginMember = new Member(); // 키보드로 입력한 객체 생성
		System.out.println("아이디를 입력하세요.\n");
		loginMember.id = input.next(); // 키보드로 입력받은 id를 새로 만든 객체에 넣음
		System.out.println("암호를 입력하세요.\n");
		loginMember.pw = input.next(); // 키보드로 입력받은 pw를 새로 만든 객체에 넣음

		// 배열에 있는 객체와 새로만든 객체 비교 시작

		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) { // 배열에 빈칸이 "아니면"
				if (members[i].id.equals(loginMember.id) && members[i].pw.equals(loginMember.pw)) {
					// 배열에 있는 id와 키보드로 입력한 id가 같고, pw도 마찬가지라면
					// loginMember는 2개의 값, members[i]는 4개의 값을 갖고 있는데
					loginMember = members[i]; // 이 둘을 교체시킴
					// if문 종료 (id pw 비교 -> 객체 치환)
				} else {
					System.out.println("회원 정보가 없습니다.");
					System.out.println("아이디 패스워드를 확인하세요.\n");
					loginMember = null;
					// register(input); 이렇게 하면 즉시 회원가입으로 이어줄수 있음
				} // if문 종료
				break;

			} // if종료

		} // for종료
		return loginMember;
	}

	public void modify() {
		System.out.println("회원 정보 수정을 진행합니다.");
	}

	public void delete() {
		System.out.println("회원 탈퇴를 진행합니다.");
	}

	public void menu(Scanner input, Member[] members) { // 타입 스캐너 '인풋'을 받아옴
		// 매개값, 스캐너, 멤버배열
		System.out.println("======== 회원 전용 메뉴입니다. ========");
		boolean run = true;
		while (run) {
			System.out.println("1.가입\n2.로그인\n3.정보수정\n4.탈퇴\n5.종료");
			System.out.print(">>>");
			int select = input.nextInt();
			switch (select) {
			case 1:
				System.out.println("회원 가입을 진행합니다.");
				// 키보드로 입력받을 필드 완성후 객체로 받음
				Member newMember = register(input);
				// 멤버배열 null을 찾아 삽입
				for (int i = 0; i < members.length; i++) {
					if (members[i] == null) {
						members[i] = newMember;
						break; // for문이 끝나야함
					} // if종료
				} // for종료 (null을 찾아 객체를 삽입)
				System.out.println(newMember.id + "\n" + newMember.pw + "\n" + newMember.nickName + "\n"
						+ newMember.email + "\n" + "객체가 배열에 저장됨");
				break;
			case 2:
				System.out.println("로그인을 진행합니다.\n");
				Member loginMember = login(input, members); // 호출시 스캐너와 배열 객체 전달
				if (loginMember != null) {
					System.out.println(loginMember.nickName + "님 환영합니다.\n");
				}
				break;
			case 3:
				System.out.println("정보수정을 진행합니다.");
				modify();
				break;
			case 4:
				System.out.println("회원 탈퇴를 진행합니다.");
				delete();
				break;
			case 5:
				System.out.println("메인메뉴로 돌아갑니다.");
				run = false;
				break;
			default:
				System.out.println("1~5의 값만 입력해주세요.");

			} // 스위치
		} // 와일
	}// 메뉴
}// 클래스
