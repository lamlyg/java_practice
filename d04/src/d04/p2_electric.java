package d04;

import java.util.Scanner;

//사용자로부터 전기사용량(kwh)
public class p2_electric {
	public static void main(String[] args) {
		double e=0.0;
		final int basic1=910;
		final int basic2=1600;
		final int basic3=7300;
		final double k=1000;
		double money=0.0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input e (kwh) : ");
		e=input.nextInt();
		
		if(e>0&&e<=200) {
			money = 910+93.3*e;
		}
		else if(e<200&&e<=400) {
			money = 1600+(93.3*200+187.9*(e-200));
		}
		else {//e>400
			money = 7300+(93.3*200+187.9*200+280.6*(e-400));
		}
		
		System.out.println("Result money : "+money+"k");
		
	}
}
