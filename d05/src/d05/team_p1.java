package d05;

import java.util.Scanner;

/*
 문자열을 입력받아서,
 같은 문자가 연속적으로 반복되는 경우에 그 반복 횟수를 표시하여 문자열을 압축하기

 입력예시 : aaabbcccccca
 출력예시 : a3b2c6a1
 */

public class team_p1 {
	public static void main(String[] args) {

		int i=0,j=0;
		int count=0;
		String result = "";
		Scanner input = new Scanner(System.in);

		System.out.print("Input str : ");
		String str = input.nextLine();
		
		for(i=0;i<str.length();i++) {
			if(!result.contains(String.valueOf(str.charAt(i)))){
				result+=String.valueOf(str.charAt(i));
			}
		}

		char [] c_arr = result.toCharArray();

		for(i=0;i<c_arr.length;i++) {
			for(j=0;j<str.length();j++) {
				if(c_arr[i]==str.charAt(j)) {
					count++;
				}
			}
			System.out.print(c_arr[i]+""+count+" ");
			count=0;
		}

		input.close();
	}
}
