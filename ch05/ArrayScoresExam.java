package ch05;

import java.util.Scanner;

public class ArrayScoresExam {

	public static void main(String[] args) {
		// 배열을 이용해서 성적표를 만들어 보자
		// 학생 수를 파악한다.
		// 점수를 입력한다.
		// 총점과 평균을 구하여 출력한다.

		Scanner input = new Scanner(System.in);
		System.out.println("========== 성적표 ==========");
		System.out.println("학생 수를 입력 하세요.");
		System.out.print(">>>");
		int count = input.nextInt(); // 이 count가 표의 길이가 됨 (학생수)

		int[] scores = new int[count]; // 키보드로 입력 받은 값을 토대로 배열 길이 생성
		System.out.println("배열의 길이" + scores.length);

		for (int i = 0; i < scores.length; i++) { // .length (배열 길이) = 쓰지말것 0번부터 시작이니까
			System.out.println((i + 1) + "번째 학생의 점수를 입력하세요."); // 0번째 학생부터 라고 할순 없으니까 +1 넣음
			scores[i] = input.nextInt();
		} // 학생 수 만큼 배열의 점수를 입력한다. (Create)

		System.out.println("========== 입력된 점수 확인 ==========");
		for (int i = 0; i < scores.length; i++) { // (Read)
			System.out.print(scores[i] + " "); // 점수 점수 점수.... 이런식으로 나오게 빈칸하나 넣음
		}
		System.out.println();
		System.out.println("==========수정할 점수 번호 입력==========");
		int select = input.nextInt();
		System.out.println("==========수정할 점수 번호 입력==========");
		int score = input.nextInt();

		scores[select - 1] = score; // 사용자랑 개발자랑 시선이 다르니까 -1 넣음
		System.out.println("수정한 결과 확인");
		System.out.println(select + "번의 점수는 : " + score + "로 수정 완료.");

		// 총점과 평균을 구함
		int sum = total(scores);
		System.out.println("총점 : " + sum + " 입니다.");
		double ave = average(sum, count);
		System.out.println("평균 : " + ave + " 점 입니다.");

	} // 메인 종료

	static double average(int sum, int count) { // 어차피 계산했고, sum대신 scores 표 보내도 되긴 함 괄호에 타입 꼬박꼬박 쓰기
		double ave = 0;
		ave = sum / count;
		return ave;
	} // 평균 메서드 종료

	static int total(int[] scores) {
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i]; // scores의 모든 값을 sum에 누적
		} // scores 배열의 값을 모두 가져옴

		return sum; // 표가 들어와서 sum으로 나감
	} // scores 배열을 받아 int로 리턴해주는 메서드

} // 클래스 종료
