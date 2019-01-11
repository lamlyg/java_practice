package d10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 	3명의 학생정보를 map으로 저장하고
 	kim : 96
 	hong : 86
 	park : 92
 	평균, 최고점수, 최고득점자를 찾아서 출력
 */

public class MapScore {
	public static void main(String[] args) {
		
		Map<String,Integer> score = new HashMap<String,Integer>();
		score.put("kim", 96);
		score.put("hong", 86);
		score.put("park", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
//답1    --------------------------------------------------------
		//Set entrySet() : Map에 저장되어 있는 key-value쌍을 Map.Entry타입의 객체로
						 //저장한 Set으로 반환한다.
		for(Map.Entry<String, Integer> entry : score.entrySet()) {
			if(entry.getValue()>maxScore) {
				maxScore = entry.getValue();
				name = entry.getKey();
			}
			totalScore += entry.getValue();
		}
		int avgScore = totalScore/score.size();
		System.out.println("평균 : "+avgScore);
		System.out.println("최고득점 : "+maxScore);
		System.out.println("최고득점자 : "+name);
//      ---------------------------------------------------------
		
//답2	---------------------------------
		//반복자를 이용해서 map데이터 접근하기
		Iterator<String> na = score.keySet().iterator(); 
		//keySet() : map안에 key로 이뤄진 set 리턴하는 메소드
		//iterator() : key를 하나씩 순회하기 위한 반복자 리턴하는 메소드

		while(na.hasNext()) {
			String key = na.next();
			if(score.get(key)>maxScore) {
				name = key;
				maxScore = score.get(key);
			}
			totalScore += score.get(key);
		}
//		---------------------------------
		
		
//		//Map 객체생성
//		Map<String, Integer> stu = new HashMap<String, Integer>();
//		
//		//맵에 자료 넣기
//		stu.put("kim",96);
//		stu.put("hong",86);
//		stu.put("park",92);
//		
//		System.out.println(stu);
//			
//		int sum=0;
//		int count=0;
//		for(Map.Entry<String, Integer> s: stu.entrySet()) {
//			int score = s.getValue();
//			sum+=score;
//			count++;
//		}
//		System.out.println("평균: "+(double)sum/count);
//		for(Map.Entry<String, Integer> s: stu.entrySet()) {
//			int score = s.getValue();
//			sum+=score;
//			count++;
//		}
		
	}
}
