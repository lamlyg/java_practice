package d05;

import java.util.Scanner;

public class e3_electric_ver2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double fee=0.0;
		int use=0;
		int i=0,j=0;
		System.out.print("전기 사용량 : ");
		use = input.nextInt();
		
		final int[] BASIC_FEE = {910,1600, 7300};
		final double[] LV_USE_FEE = {93.3,187.9,280.6};
		int []usearr= {200,200,200};
		
		if(use<=200) i=1;
		else if(use <=400) i=2;
		else i=3;
		
		fee = (double)BASIC_FEE[i-1];
		
		usearr[i-1]=use-200*(i-1);
		
		for(j=0;j<i;j++) {
			fee+=(double)LV_USE_FEE[j]*usearr[j];
		}
		
		System.out.println("Result money : "+fee);
		
		input.close();
		
//		답안
//		int i =0;
//		while(true) {
//		if(use<=200 || i==2) {//입력한 사용량이 200이하인 경우 또는 현재단계가 3단계인 경우
//			fee = BASIC_FEE[i];//기본요금
//			fee = fee + LV_USE_FEE[i]*use; //현재단계 이전 + 현재단계 요금
//			break;
//		}
//			fee = fee + LV_USE_FEE[i]*200; //현재단계 이전 + 현재단계 요금
//			use = use -200;
//			i++;
//		}
		
	}
}
