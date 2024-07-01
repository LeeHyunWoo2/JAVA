package ch05;

public class ArraySortASCExam {

	public static void main(String[] args) {
		// 버블 정렬 오름차순으로 구현
		// 오름차순은 작은 값 부터 큰 값으로 재배열함
		// 필수 항목 : temp 임시방 (변수명이라서 굳이 temp라고 안해도됨)
		
		int[] scores = new int[] { 79, 88, 91, 33, 100, 55, 95 };
		// scores 변수에 int 배열 7칸 생성 하며 정수가 들어있음
		
		System.out.println("====== 배열 초기 값 출력 ======");
		for(int i = 0; i < scores.length ; i++) {
			System.out.print(scores[i]+" ");
		}
		System.out.println();
		System.out.println("==========================\n");
		System.out.println("======오름 차순 정렬 시작======\n");
		
		
		for(int j=0; j < scores.length - 1 ; j++) { // a~b 까지 돌리는 변수
			for(int k=0; k < scores.length - 1 - j ; k++){ // 최대값이 점점 줄어드는 역할 하는 변수
				if(scores[k] > scores[k+1]) { // 큰지 비교함
					int temp = scores[k]; // 큰 값을 temp에 저장
					scores[k] = scores[k+1]; // 작은 값이 k 번째에 저장
					scores[k+1] = temp; // temp에 저장한 큰 값이 k+1 자리로 옮겨짐
							
				} // 옆자리랑 비교하여 큰지 묻는 if문
				
				System.out.println("=========== 배열 정렬 중 출력 ===========");
				for(int i = 0; i < scores.length ; i++) {
					System.out.print(scores[i]+" ");
				}
				System.out.println();
				System.out.println("====================================\n");
				
			} // 싸이클1 (0 ~ 6)  싸이클2 (0 ~ 5)  싸이클3 (0 ~ 4)
			
			System.out.println("싸이클 종료"+(j+1)+"\n");
			
		} // j = 0 ~ 6 까지 반복(싸이클 반복용)
			System.out.println("====== 배열 정렬 오름 차순 결과값 출력 ======");
			for(int i = 0; i < scores.length ; i++) {
				System.out.print(scores[i]+" ");
			}
			System.out.println();
			System.out.println("====================================\n");
			
	
		
	}

}
