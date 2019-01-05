package d05;

import java.util.Scanner;

/*
2019.01.04.FRI
팀과제 - 문제3
구현자 : 이윤지
*/

/*
 문제3. 출처 (백준 2941번) https://www.acmicpc.net/problem/2941
 예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다.
 따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.
 
 č -> c= 
 ć -> c- 
dž -> dz= 
 ñ -> d- 
lj -> lj 
nj -> nj 
 š -> s= 
 ž -> z= 
 
 예를 들어, ljes=njak은 
 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 
 단어가 주어졌을 때, 
 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
 
 dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. 
 lj와 nj도 마찬가지이다. 
 위 목록에 없는 알파벳은 한 글자씩 센다.
 
 첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.
문제 설명에 나와있는 크로아티아 알파벳만 주어진다.

 */
public class team_p3 {
	public static void main(String[] args) {
		
		int i=0;//반복계수 선언 및 초기화
		int count=0;//크로아티아 알파벳 갯수
		
		Scanner input = new Scanner(System.in);//Scanner 생성
		
		System.out.println("문자열을 입력하시오.(단,알파벳소문자,-,=을 이용)");
		String str = input.nextLine();//문자열입력
		
		char []ch = str.toCharArray();//문자열을 char형 배열로 변환
		
		for(i=ch.length-1;i>=0;i--) {
			if(ch[i]=='=') {
				if(ch[i-1]=='c'&&i>0) {
					count++;	
					i-=1;
				}
				else if(ch[i-1]=='s'&&i>0) {
					count++;
					i-=1;
				}
				else if(ch[i-1]=='z'&&i>0) {
					if(ch[i-2]=='d'&&i>1) {
						count++;
						i-=2;						
					}
					else {
						count++;
						i-=1;
					}
				}
				else {
					count++;
				}
			}
			else if(ch[i]=='-') {
				if(ch[i-1]=='c'&&i>0) {
					count++;	
					i-=1;
				}
				else if(ch[i-1]=='d'&&i>0) {
					count++;
					i-=1;
				}
				else {
					count++;
				}
			}
			else if(ch[i]=='j') {
				if(ch[i-1]=='l'&&i>0) {
					count++;	
					i-=1;
				}
				else if(ch[i-1]=='n'&&i>0) {
					count++;
					i-=1;
				}
				else {
					count++;
				}
			}
			else {
				count++;
			}
		}
		
		System.out.println("크로아티아 알파벳의 개수 : ");
		System.out.println(count);//결과 출력
		
		input.close();//Scanner 종료
	}
}
