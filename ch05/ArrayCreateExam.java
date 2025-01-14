package ch05;

public class ArrayCreateExam {

	public static void main(String[] args) {
		// 배열은 표 형식의 참조형
		// 타입[] 변수; <-- 객체 생성
		// 변수 = {값1,값2,값3}; <-- 값 삽입
		// 타입[]변수={값1,값2,값3}; <-- 이렇게 한번에 쓸수도 있음

		int[] scores = { 83, 90, 87 }; // int형 타입의 배열을 생성하고 값을 삽입
		//               [0] [1] [2] // 인덱스
		System.out.println(scores[0]); // 인덱스 0번인 값을 가져와 출력
		System.out.println(scores[1]); 
		System.out.println(scores[2]);
		//System.out.println(scores[3]); // Index 3 out of bounds for length 3
		
		scores[0] = 100; // 인덱스 0번의 값을 100으로 수정(덮어쓰기)
		System.out.println(scores[0]);
		
		scores = null; // 배열에 연결한 객체 삭제
		scores = new int[30]; // 새로운 배열을 30칸 생성하여 연결함
		scores[0] = 100; // 새로 만든 배열 인덱스 0번에 값 100 삽입
		System.out.println(scores[0]); // 출력
		
	}
}
