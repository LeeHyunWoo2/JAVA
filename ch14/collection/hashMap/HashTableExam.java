package ch14.collection.hashMap;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExam {

	public static void main(String[] args) {
		// 키보드로 입력받은 id와 pw를 이용한 로그인 성공!!! 테스트

		Map<String, String> login = new Hashtable<>();

		login.put("kkw1", "1");
		login.put("kkw2", "2");
		login.put("kkw3", "3");
		login.put("kkw4", "4");
		login.put("kkw5", "5"); // <id, pw>

		Scanner scanner = new Scanner(System.in);
		while (true) { // 무한루프
			System.out.println("아이디를 입력하세요.");
			System.out.print(">>>");
			String id = scanner.next();

			System.out.println("비밀번호를 입력하세요.");
			System.out.print(">>>");
			String pw = scanner.next();

			if (login.containsKey(id)) { // 테이블에 키가 id와 같은것을 찾음
				if (login.get(id).equals(pw)) { // id와 pw 모두 같은것을 찾음
					System.out.println("로그인 성공!!!");
					break;
				} else {
					System.out.println("비밀번호가 틀렸습니다");
				} // 패스워드 일치 if문

			} else {
				System.out.println("입력된 id 정보가 존재하지 않습니다.");
			} // 아이디 일치 if문

		}

	}

}
