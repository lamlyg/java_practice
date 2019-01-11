package d10;

import java.util.HashMap;
import java.util.Map;

/*
 	Map : 사전과 같은 자료구조, Key와 Value로 구성된 데이터들의 집합
 	
 	키(Key)				값(Value)
 	firstname			gildong	//엔트리 : 키와 값으로 이뤄진 쌍
 	lastname			hong
 	location			seoul
 	
 */

class Student{
	int number;
	String name;
	
	public Student(int number, String name) {
		this.number = number;
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	
	
}

public class MapTest {
	public static void main(String[] args) {
		//Map 객체생성
		Map<String, Student> st = new HashMap<String, Student>();
		
		//맵에 자료 넣기
		st.put("20190001", new Student(0001,"홍길동"));
		st.put("20190002", new Student(0002,"김자바"));
		st.put("20190003", new Student(0003,"박철수"));
		
		System.out.println(st);
		
		//맵에 자료 삭제하기
		st.remove("20190003");//매개변수로 삭제할 자료의 키를 넘겨줌
		System.out.println(st);
		
		//맵에서 자료 가져오기
		Student s = st.get("20190001");
		System.out.println(s);
		
//		Set s = st.entrySet();
		
		for(Map.Entry<String, Student> s1: st.entrySet()) {
			String key = s1.getKey();
			Student value = s1.getValue();
			System.out.println(key + " : "+value);
		}
	}
}
