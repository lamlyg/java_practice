package d10;

import java.util.ArrayList;

public class ListTest {
	public static void main(String[] args) {
		//ArrayList 객체 생성
//		ArrayList<String> list = new ArrayList<String>();
//		
//		list.add("우유");
//		list.add("빵");
//		list.add("버터");
//		
//		System.out.println(list.get(1)); //get(인덱스값) : 해당인덱스의 값 가져오기
//		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		list.set(0, "milk");//set(인덱스값, 수정될 값) : 수정
//		System.out.println(list);
		
		MyArrayList<String> arrlist = new MyArrayList<String>(); //->MyArrayList.java
		//제네릭 <> : 객체를 생성할 때 컬렉션에 넣을 타입을 결정 
		
		System.out.println("[add] A");
		arrlist.add("A");
		System.out.println("[add] B");
		arrlist.add("B");
		System.out.println("[add] C");
		arrlist.add("C");
		System.out.println("[print]");
		arrlist.printArray();
		System.out.println("[get] 1 ");
		System.out.println(arrlist.get(1));
		System.out.println("[set] 2 -> D");
		arrlist.set(2,"D");
		System.out.println("[print]");
		arrlist.printArray();
		System.out.println("[remove] 1");
		arrlist.remove(1);
		System.out.println("[print]");
		arrlist.printArray();		
	}
}
