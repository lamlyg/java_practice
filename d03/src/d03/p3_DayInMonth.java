package d03;

import java.util.Scanner;

/*
 스위치 문을 이용해서 해당 월의 일수를 알려주는 프로그램을 작성하세요
 
 [출력예시]
 일수를 알고싶은 달을 입력하세요 : 8월
 2019년 1월의 일수는 31일
 
 -연도정보 : 2019년
 -12월 이상의 값 입력 시 : 월을 잘못 입력하셨습니다.
 -2월은 윤년 여부 판단해서 28일 또는 29일
 
 */

public class p3_DayInMonth {
	public static void main(String[] args) {
		int month, year;
		int day=0;
		
		boolean check = true;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("년도를 입력하세요 : ");
		year = input.nextInt();
		System.out.print("일수를 알고싶은 달을 입력하세요 : ");
		month = input.nextInt();
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		case 2:
			if(year%400==0) {
				day=29;
			}
			else {
				day = (year%4==0)?((year%100!=0)?29:28):28;			
			}
//			day = ((year%4==0)&&(year%100!=0))||(year%400==0)?29:28;
			break;
//		case 3:
//			day = 31;
//			break;
//		case 4:
//			day = 30;
//			break;
//		case 5:
//			day = 31;
//			break;
//		case 6:
//			day = 30;
//			break;
//		case 7:
//			day = 31;
//			break;
//		case 8:
//			day = 31;
//			break;
//		case 9:
//			day = 30;
//			break;
//		case 10:
//			day = 31;
//			break;
//		case 11:
//			day = 30;
//			break;
//		case 12:
//			day = 31;
//			break;
		default:
			System.out.println("월을 잘못 입력하셨습니다.");
			check = false;
			break;
		}
		
		if(check==true) {
		System.out.print(year+"년 "+month+"월의 일수는 "+day+"일");
		}
		
		input.close();
	}
}
