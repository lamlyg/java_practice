package d06;
/*
 	주사위의 번호를 무작위로 리턴하는 메소드 rollingDice를 설계하라
 	rollingDice는 정수형 숫자 int결과를 반환한다.
 	두개의 주사위를 굴려서 주사위의 합이 5인지 아닌지를 출력하는 프로그램을 생성하라.
 */
public class DiceEx {
	public static void main(String[] args) {
		DiceEx de = new DiceEx();
		
		int num1=de.rollingDice();
		int num2=de.rollingDice();
		int sum=num1+num2;
		
		System.out.println("num1:"+num1+" num2:"+num2+" sum:"+sum);
		
		if(sum==5) {
			System.out.println("합이 5임");
		}
		else {
			System.out.println("합이 5가 아님");
		}
		
	}
	
	public int rollingDice() {
		int result=0;
		
		result = (int)(Math.random()*6+1);
		//난수 최소(min)~최대(max) -> Math.random()*max + min
		
		return result;
	}
}
