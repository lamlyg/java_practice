package d03;

//2단~9단 출력

public class p7_forfor01 {
	public static void main(String[] args) {
		for(int i=2;i<10;i++) {
			System.out.println("===="+i+"단"+"====");
			for(int j=1;j<10;j++) {
				System.out.println(j+"X"+i+"="+i*j);
			}
		}		
	}
}
