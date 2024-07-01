package ch14.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExam {

	public static void main(String[] args) {
		// set 인터페이스에는 HashSet, LinkedHashSet, TreeSet 등 이 있다.
		// set은 중복되지 않는 인덱스가 없는 객체를 담아놓은 구슬 주머니와 같음
		
		Set<String> setHashSet = new HashSet<String>();
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		Set<String> treeSet = new TreeSet<String>();

		setHashSet.add("Java");
		setHashSet.add("oracle");
		setHashSet.add("JDBC");
		setHashSet.add("HTML");
		setHashSet.add("CSS");
		setHashSet.add("JavaScript");

		int size = setHashSet.size(); // 객체수 반환
		System.out.println("set 객체 수 : " + size);

		System.out.println("======= 인덱스가 없어서 for문으로 전체출력 불가능 =======");
		// 반복자
		Iterator<String> iterator = setHashSet.iterator(); // 반복자 타입에 set 타입 연결

		int i = 0;
		while (iterator.hasNext()) { // .hasNext() 다음 객체가 있으면 true, 없으면 false
			String element = iterator.next(); // next()로 가져온 값을 element에 넣음
			System.out.println(++i + "객체 : " + element);
		}
		
		setHashSet.remove("CSS");
		
		int j = 0;
		System.out.println("======= 인덱스가 없어서 for each문으로 출력 =======");
		for(String entity : setHashSet) {
			System.out.println(++j + "객체 : " + entity);
		}

	}

}
