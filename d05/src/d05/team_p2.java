package d05;
/*
2019.01.04.FRI
팀과제 - 문제2
구현자 : 이윤지
*/
import java.util.Scanner;

/*
 문자열을 입력받아서,
 같은 문자의 갯수를 세서, 문자열에서 나타나는 문자의 갯수를 표시하여 문자열을 압축하기

 입력예시 : aaabbcccccca
 출력예시 : a4b2c6
 */

public class team_p2 {
	public static void main(String[] args) {

		int i=0,j=0;//for문의 반복계수
		int count=0;
		String result = "";//문자열에서 반복된 문장을 제외한 문자들의 모임을 저장할 String형 변수
		Scanner input = new Scanner(System.in);//Scanner 선언

		System.out.print("Input str : ");
		String str = input.nextLine();//문자열입력
		
		for(i=0;i<str.length();i++) {//문자열전체에 대해
			if(!result.contains(String.valueOf(str.charAt(i)))){//문자열의 문자 하나씩 비교->contains :포함여부확인
				result+=String.valueOf(str.charAt(i));//if(포함여부==true)->result에 문자열추가
			}
		}

		char [] c_arr = result.toCharArray();//중복없이 문자열에 들어간 문자들 배열에 저장 

		for(i=0;i<c_arr.length;i++) {//문자열전체에 대해
			for(j=0;j<str.length();j++) {
				if(c_arr[i]==str.charAt(j)) {
					count++;//문자갯수세기
				}
			}
			System.out.print(c_arr[i]+""+count+"");//결과출력(각문자 + 문자에 대한 갯수)
			count=0;
		}

		input.close();//Scanner 종료
	}
}
