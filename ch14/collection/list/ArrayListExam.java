package ch14.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListExam {

	public static void main(String[] args) {
		// list 컬렉션은 Arraylist, vector, Linkedlist 3가지를 주로 사용함
		// list 컬렉션은 배열 대신 활용도가 높다. (길이가 자유롭다)
		// list<String> 은 강한 타입체크로, String 만!!!!!! 들어감
		// list<String> list = new Arraylist<String>(); -> 10개가 만들어짐 (기본값)
		
		
		

		List<String> listS = new ArrayList<String>();
		listS.add("Java"); // 0번 인덱스
		listS.add("Oracle"); // DB
		listS.add("JDBC"); // java + DB 연동
		listS.add("HTML, CSS, JS"); // 프론트
		listS.add("JSP"); // java + DB + 프론트
		listS.add("Tomcat"); // 서버 프로그래밍 (servlet)
		listS.add("리눅스"); // 배포서버
		listS.add(5, "servlet"); // jsp + java
		listS.add("AWS"); // 가상 배포서버
		
		
		
		int size = listS.size();
		System.out.println("총 객체수 : " + size);
		System.out.println("\n=========================================\n");
		String skill = listS.get(2); // 2번 인덱스값을 가져와 skill 변수에 넣음

		listS.remove(2);
		listS.remove("JSP");
		
		System.out.println("2번째 인덱스 값 : " + skill);
		System.out.println("\n============== for 전체 출력 ==============\n");
		for (int i = 0; i < listS.size(); i++) {
			System.out.println(i + " 번째 값 : " + listS.get(i));
		}
		
		System.out.println("\n====== for each 전체 출력 (index 안씀) ======\n");
		for(String str : listS) {
			System.out.println(str);
		}

	}

}
