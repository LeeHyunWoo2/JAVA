package ch14.collection.list;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class VectorExam {

	public static void main(String[] args) {
		// Vector는 List 컬렉션의 자식 객체로 메서드가 같다.
		// 단, 동기화된 메서드로 구성되어 있어 멀티스레드가 동시에 이 메서드를 실행할 수 없다.
		// 하나의 스레드가 실행을 완료해야 다른 스레드를 실행할 수 있다.
		// 멀티 스레드 환경에서 안전하게 객체를 추가, 삭제(좌석 예약, 상품 재고) 할때 사용

		List<BoardDTO> listB = new Vector<BoardDTO>(); // 강한 타입체크

		listB.add(new BoardDTO("제목1", "내용1", "작성자1"));
		listB.add(new BoardDTO("제목2", "내용2", "작성자2"));
		listB.add(new BoardDTO("제목3", "내용3", "작성자3"));
		listB.add(new BoardDTO("제목4", "내용4", "작성자4"));
		listB.add(new BoardDTO("제목5", "내용5", "작성자5"));
		listB.add(new BoardDTO("제목6", "내용6", "작성자6"));

		BoardDTO boardDTO = listB.get(1);
		System.out.println("====== 벡터 객체의 1번 인덱스 정보 =====");
		System.out.println(boardDTO.getSubject() + "제목");
		System.out.println(boardDTO.getContent() + "내용");
		System.out.println(boardDTO.getWriter() + "작성자");

		// BoardDTO newBoardDTO = new BoardDTO();

		Scanner scanner = new Scanner(System.in);
		System.out.println("제목을 입력하세요.");
		System.out.print(">>>");
		// newBoardDTO.setSubject(scanner.next());
		String title = scanner.next();

		System.out.println("내용을 입력하세요.");
		System.out.print(">>>");
		// newBoardDTO.setContent(scanner.next());
		String content = scanner.next();

		System.out.println("작성자를 입력하세요.");
		System.out.print(">>>");
		// newBoardDTO.setWriter(scanner.next());
		String writer = scanner.next();
		BoardDTO newBoardDTO = new BoardDTO(title, content, writer);
		listB.add(newBoardDTO); // 이러면 타이틀 컨텐츠 작성자 싹알아서 맨뒷자리에 붙음

		// 이 위에 주석 친건 다른 방법으로 구현한것들 (setter사용)
		// System.out.println(newBoardDTO.getSubject() + " 가 등록되었습니다.");

		System.out.println(newBoardDTO.toString()); // toString은 테스트용도로 주로 씀
		System.out.println("\n========= 전체 리스트 =========\n");

		for (BoardDTO list : listB) {
			System.out.println(list.getSubject() + " : " + list.getContent() + " : " + list.getWriter());
		}

	}

}
