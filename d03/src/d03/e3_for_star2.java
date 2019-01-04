package d03;

public class e3_for_star2 {
	public static void main(String[] args) {
		int i,j,k;
		
//==============================================
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*
		
		for(i=0;i<5;i++) {
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}

			System.out.println("");
		}
		for(i=0;i<4;i++) {
			for(j=4-i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("");
		System.out.println("");
		
//==============================================
//		*****
//		****
//		***
//		**
//		*
//		*
//		**
//		***
//		****
		
		for(i=0;i<5;i++) {
			System.out.println("");	
			for(j=5-i;j>0;j--) {
				System.out.print("*");
			}
		}
		for(i=0;i<5;i++) {
			for(j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		System.out.println("");
		System.out.println("");
//==============================================

//		***** *****
//		****   ****
//		***     ***
//		**       **
//		*         *
//		*         *
//		**       **
//		***     ***
//		****   ****
//		***** *****
		
		for(i=0;i<5;i++) {
			for(j=5-i;j>0;j--) {
				System.out.print("*");
			}
			for(j=0;j<2*i+1;j++) {
				System.out.print(" ");
			}
			for(j=5-i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(i=1;i<=5;i++) {
			for(j=0;j<i;j++) {
				System.out.print("*");
			}
			for(j=10-(2*i-1);j>0;j--) {
				System.out.print(" ");
			}
			for(j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		System.out.println("");
		System.out.println("");
//==============================================
//	      *
//	     ***
//	    *****
//	   *******
//	  *********
		
		for(i=0;i<5;i++) {
			for(j=i;j<5;j++) {
				System.out.print(" ");
			}
			for(k=0;k<2*i+1;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
