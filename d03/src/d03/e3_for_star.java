package d03;

public class e3_for_star {
	public static void main(String[] args) {
		//*********
		//*********
		//*********
		//*********
		//*********
		
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<10
//					;j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		int i,j;
		
		for(i=0;i<=5;i++) {
			for(j=0;j<i;j++) {
				System.out.print("*");
			}
			for(j=5-i;j>0;j--) {
				System.out.print(" ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		System.out.println("=========================");
		System.out.println("");
		
		for(i=0;i<5;i++) {
			for(j=0;j<5-i;j++) {
				System.out.print("*");
			}
			for(j=0;j<i;j++){
				System.out.print(" ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		System.out.println("=========================");
		System.out.println("");
		
		for(i=0;i<5;i++) {
			for(j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(j=0;j<5-i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
}
