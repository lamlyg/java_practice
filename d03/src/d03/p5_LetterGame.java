package d03;

import java.util.Random;
import java.util.Scanner;

/*
숫자 맞추기 프로그램 작성
답은 미리 변수에 저장 (ex) int answer = 59;
사용자가 숫자를 입력하면 정답보다 낮은지 높은지를 판단하여 결과 출력
정답을 맞추면 시도횟수를 출력
 */

public class p5_LetterGame {
	public static void main(String[] args) {
		int num, r;
		int m=0;
		
		Scanner input = new Scanner(System.in);
		Random rannum = new Random();
		
		r=rannum.nextInt(100);
		
		do {
			System.out.println("? : ");
			num=input.nextInt();
			if(num<r) {
				System.out.println("Up!");
				m++;
			}
			else if(num>r) {
				System.out.println("Down!");
				m++;
			}
			else {
				System.out.println("Correct!");
				System.out.println("count : "+m);
			}
		}while(num!=r);
		
		input.close();
	}
}
