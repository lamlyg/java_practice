package d05;
/*
 2019.01.04.FRI
 팀과제 - 문제1
 구현자 : 이윤지
 */
import java.util.Scanner;

/*
 문자열을 입력받아서,
 같은 문자가 연속적으로 반복되는 경우에 그 반복 횟수를 표시하여 문자열을 압축하기

 입력예시 : aaabbcccccca
 출력예시 : a3b2c6a1
 */

public class team_p1 {
	public static void main(String[] args) {

		int i=0;
		int count=0;
	
		Scanner input = new Scanner(System.in);//입력을 위한 Scanner 선언

		System.out.print("Input str : ");
		String str = input.nextLine();//문자열 입력받기

		char [] c_arr = str.toCharArray();
		//char형 배열 c_arr에 입력받은 String형 변수 result에 String함수의 toCharArray함수를 이용하여 문자열에서 문자로 변환

		count=1;//연속된 문자를 세기위한 변수 count

		for(i=1;i<c_arr.length;i++) {//연속된 문자 비교
			if(c_arr[i-1]==c_arr[i]) {
				count++;
			}	
			else {
				System.out.print(c_arr[i-1]+""+count);
				count=1;
			}
		}
		
		if(c_arr[c_arr.length-2]!=c_arr[c_arr.length-1]) {//마지막문자의 연속여부를 확인하기 위한 조건문
			count=1;
			System.out.print(c_arr[c_arr.length-1]+""+count);
		}
		else {			
			System.out.print(c_arr[c_arr.length-1]+""+count);					
		}

		input.close();//Scanner 종료
	}//main종료
}
