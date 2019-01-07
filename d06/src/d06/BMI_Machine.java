package d06;

import java.util.Scanner;

/*
 	비만지수 측정하는 프로그램
 	bmi = 체중/(신장^2)
 	
 	method 이름 : calculate
 	필요한 데이터 : 체중(double), 신장(double)
 	출력 : BMI지수
 	
 	calculate 메소드로 얻어진 결과 데이터인 bmi지수를 토대로 진단결과를 나타내고 싶다면?
 	1. 기존에 개발해둔 메소드를 수정해서 사용
 	2. 기존의 메소드는 그대로 두고 새로운 메소드를 작성해서 연동
 	
 	30 ~ : 비만
 	20~30 : 정상
 	13~20 :
 */

/*
 	한번 입력한 데이터나 결과데이터를 가지고 있다면 좋을텐데..! -> 객체활용
 	객체 : 로직(기능)과 데이터를 결합한 형태의 구조
 	->class(클래스)개념 등장
 	
 	객체 : 데이터 + 기능 결합한 구조
 	클래스와 객체  
 	->클래스 :데이터와 로직을 묶어서 누구나 동일한 기능을 사용할 수 있게 하고, 
 			누구나 필요한 자기만의 데이터를 보관하기 위한 스펙을 미리 결정해둔 것
 	->객체 : 실체
 */

public class BMI_Machine {
	public static void main(String[] args) {
		BMI_Machine BMI = new BMI_Machine();
		Scanner input = new Scanner(System.in);
		System.out.println("Input weight :");
		double w = input.nextDouble();
		System.out.println("Input height (height unit=m) :");		
		double h = input.nextDouble();
		
		double result = BMI.calculate(w, h);
		
		System.out.println("BMI: "+result);
		
		BMI.getResult(result);
		
		input.close();
	}
	
	public double calculate(double weight, double height) {
		double bmi=0.0;
		
		height = (height)*(height);
		bmi = weight/(height);
		return bmi;
	}
	
	public void getResult(double BMI_result) {
		if(BMI_result>30) {
			System.out.println("비만");
		}
		else if(BMI_result>=20&&BMI_result<30) {
			System.out.println("정상");			
		}
		else if(BMI_result>=13&&BMI_result<20) {
			System.out.println("마름");						
		}
		else if(BMI_result>=10&&BMI_result<13) {
			System.out.println("영양실조");									
		}
		else {
			System.out.println("비정상");												
		}
	}
}
