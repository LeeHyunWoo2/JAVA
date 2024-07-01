package ch04;

public class WhileSumExam {

	public static void main(String[] args) {
		// 1~100까지의 합을 구하고 싶을때 -> for문 할때 5050나왔음
		
		int x = 0; // 합을 구하는 상자
		int i = 1; // 반복용 상자
		
		while(i <= 100) { // i가 1~100까지 반복
			x = x+i;  // x += i ; -> i값을 x에 더함
			i ++ ; // i가 100까지 커지면서 반복
			
		}

		System.out.println(x);
	}

}
