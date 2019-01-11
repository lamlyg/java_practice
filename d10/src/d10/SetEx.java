package d10;

import java.util.HashSet;
import java.util.Set; //인터페이스

/*
	set : 순서가 없는 데이터의 집합 (중복을 허용하지 않음)
	
 */
public class SetEx {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		
		set.add("우유");
		set.add("빵");
		set.add("커피");		
		set.add("커피");//중복을 허용하지 않음
		
		System.out.println(set);
		

		set2.add("우유");
		set2.add("커피");
		set2.add("마카롱");	
		
		//합집합 -> 중복을 허용하지 않음
		Set<String> union = new HashSet<String>();
		union.addAll(set2);
		System.out.println(union);
		union.addAll(set);
		System.out.println(union);
		
		//교집합
		Set<String> intersection = new HashSet<String>();
		intersection.addAll(set2);
		System.out.println(intersection);
		set.retainAll(set2); //set과 set2의 교집합 : 리턴값 boolean (교집합이 있는지 없는지)
		//set에 교집합 데이터 넣음
		System.out.println(set);
	}
}
