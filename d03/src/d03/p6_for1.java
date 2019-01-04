package d03;

//문제1
//1+(1+2)+(1+2+3)+....
public class p6_for1 {
	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=1;i<=10;i++) {
			sum+=i;
			System.out.println(sum);
		}
	
	}
}
