package ch06.board;

import java.util.Date;

public class Board { // 게시판에 대한 CRUD
	// 필드
	int bno; // 게시물 번호 (중복되면 안되고, 정렬할 수 있어야하기 때문에 정수표기)
	String title; // 제목
	String content; // 내용
	String nickName; // 작성자닉 (Member에 있는게 메인이라 그거랑 맞춰줌)
	Date regDate; // 작성일

	// 생성자

	// 메서드

}
