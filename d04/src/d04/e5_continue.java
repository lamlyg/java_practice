package d04;

//continue문
/*
	continue
	반복문의 실행을 중단하고 조건식으로 감
	
주어진 문자열에 n이 몇 개 있는지 알아내는 프로그램
 */

public class e5_continue {
	public static void main(String[] args) {
		String s = "no news is good news";
		
		int count =0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='n') count++;
			else continue;
		}
		
		System.out.println("n is "+count+" numbers in s.");
	}
}