package d09_2;

import java.util.ArrayList;

/*
 	컬렉션
 	
 		자료구조를 바탕으로 객체들을 효율적으로 추가, 삭제, 검색할 수 있도록
 		java.util 패키지에 컬렉션 관련한 인터페이스와 클래스를 포함시켜 놓음
 		
 	컬렉션 종류
 		List : 순서가 있는 데이터 집합
 		stack
 		queue
 		set
 		map
 	
 	List 인터페이스
 	
 	ArrayList 클래스 : 배열 / 데이터가 삽입, 삭제될때마다 새로운 배열 생성  
 					(1,2,22,4)[4] -(추가)-> (1,2,22,4,5)[5] -( 2 삭제)-> (1,22,4,5)[4] (*삭제될 때도 새로운 배열 생성)
 					*검색이 많이 발생하는 자료 사용 多
 					(장점) 검색 용이 - 인덱스 이용 / (단점) 삽입, 삭제 불편
 					
 	LinkedList 클래스 : 데이터가 삽입, 삭제될 때마다 해당 칸만 추가/삭제하고 기억하고 있는 위치만 변경
 	 				  *수정이 많이 발생하는 자료
 	 				  (장점) 삽입, 삭제 용이 
 	
 */
public class ListTest {
	public static void main(String[] args) {
		//ArrayList 객체 생성
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("우유");
		list.add("빵");
		list.add("버터");
		
		System.out.println(list.get(1)); //get(인덱스값) : 해당인덱스의 값 가져오기
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		list.set(0, "milk");//set(인덱스값, 수정될 값) : 수정
		System.out.println(list);
		
		MyArrayList<String> myarrlist = new MyArrayList<String>(); //->MyArrayList.java
		//제네릭 <> : 객체를 생성할 때 컬렉션에 넣을 타입을 결정 
		
		
		myarrlist.add("A");
		myarrlist.add("B");
		myarrlist.add("C");
		System.out.println(myarrlist);
		System.out.println(myarrlist.get(1));
		myarrlist.set(2,"D");
		myarrlist.remove(1);
		
		System.out.println(myarrlist);
	}
}
