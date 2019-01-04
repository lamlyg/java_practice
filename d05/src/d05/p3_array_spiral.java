package d05;

/*
 1  2  3  4  5
 16 17 18 19 6
 15 24 25 20 7
 14 23 22 21 8
 13 12 11 10 9
 */

public class p3_array_spiral {
	public static void main(String[] args) {
		int i=0,j=0,k=0;
		int [][]arr 
		= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};

		//for(i=0;i<arr.length;i++) {
		for(j=0;j<arr[0].length;j++) {
			System.out.print(i+""+j);
			System.out.println();
		}
		System.out.println();
		j-=1;
		for(i=1;i<arr.length;i++) {				
			System.out.print(i+""+j);
			System.out.println();
		}
		System.out.println();
		i-=1;
		for(j=arr.length-2;j>=0;j--) {
			System.out.print(i+""+j);
			System.out.println();
		}
		j+=1;
		System.out.println();
		for(i=arr.length-2;i>0;i--) {
			System.out.print(i+""+j);
			System.out.println();
		}
		i+=1;
		
		System.out.println();
		for(j=1;j<arr.length-1;j++) {
			System.out.print(i+""+j);
			System.out.println();
		}
		System.out.println();
		j-=1;
		for(i=2;i<arr.length-1;i++) {
			System.out.print(i+""+j);
			System.out.println();
		}
		i-=1;
		System.out.println();
		for(j=2;j>0;j--) {
			System.out.print(i+""+j);
			System.out.println();
		}
		j+=1;
		System.out.println();
		for(i=arr.length-3;i>1;i--) {
			System.out.print(i+""+j);
			System.out.println();
		}
		i+=1;
		j+=1;
		System.out.println();
		System.out.print(i+""+j);
		System.out.println();
		//}
	}
}
