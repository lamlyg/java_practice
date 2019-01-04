package d03;

import java.util.Scanner;

/*
 반복문
 반복문을 이용하면 실행문을 원하는 횟수만큼 반복하여 실행할 수 있음
 */

public class e2_loop {
	public static void main(String[] args) {
		//while문
		/*
		 땀날 때까지 뛰기
		
		while(땀안나니?){
			뛰기
		}
		
		조건이 참인동안 문장을 반복적으로 수행
		조건은 참, 거짓을 판별할 수 있는 조건식이 옴
		반복이 끝날 수 있도록 조건식의 값이 바뀌도록 해야함 -> 그렇지 않으면 무한루프에 빠짐
		필요한 경우가 아니라면 무한루프에 빠지지 않게 조심
		 */
		
	/*	int i =0;
		
		while(i<5) {
			System.out.println("숫자" + i);
			i++;
		}
		*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input number : ");
		int num = input.nextInt();
		//while문을 이용한 구구단 출력하기
		//출력할 구구단의 단수는 사용자에게 입력받기
		
		int i=1;
		System.out.println("multiplication");
		while(i<=9) {
			System.out.println(num+" X "+i+"="+num*i);
			i++;
		}
		
		//===================================
		
		System.out.println("Input n : ");
		int n = input.nextInt();
		int j =1;
		
		System.out.println("n보다 작고 10으로 나누어 떨어지는 모든 양수 : ");
		if(n<10) {
			System.out.println("does not have");
		}
		else {
			while(j<n) {
				if(j%10==0) System.out.println(j);
				j++;
			}
		}
		
		//==========================================
		
		/*
		do-while문 
		조건이 참인동안 반복 수행, 조건을 나중에 확인
		조건의 참, 거짓과 상관없이 내부의 문장을 '최소한 한번'은 실행해야하는 경우
		 */
		int k =0; //반복계수 : 반복을 위한 변수
		
		do {
			System.out.println("숫자"+k);
			k++;
		}while(k<3); //세미콜론 ; 주의!
		//0부터 시작 -> 1씩 증가 -> 조건검사
		
		
		
		//==========================================
		
		//for문
		/*
		 앉았다 일어났다 5번하기
		 
		 for(횟수를 세기 위한 변수 ; 반복 조건 ; 괄호안 코드를 실행 후 실행됨 ){
		 
		 }
		 
		 for(int i = 0;i<5;i++){
		 	앉았다 일어나기
		 }
		 */
		
		for(int m=0;m<5;m++) {
			System.out.println("안녕"+m);
		}
		
		
		//1부터 10까지 더해서 결과 출력
		int sum=0;
		for(int number=1;number<=10;number++) {
			sum+=number;
		}
		System.out.println("Result : "+sum);
		
		
		//중첩 for문
		//반복문안에 다시 반복문
		/*
		for(초기값1;조건식1;증감1){
			for(초기값2;조건식2;증감2){
				수행문;
			}
			(수행문;)
		}
		 */
		
		
	
		
		input.close();
	}
	
}
