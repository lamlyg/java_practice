package d05;
/*
 1 2 3 4 5
 10 9 8 7 6
 11 12 13 14 15
 20 19 18 17 16
 21 22 23 24 25
 */


public class p2_array_zig_zag {
	public static void main(String[] args) {
		int [][]arr 
		= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {//짝수->0,2,4
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+" ");
				}
			}
			else {//홀수->1,3
				for(int k=arr.length-1;k>=0;k--) {
					System.out.print(arr[i][k]+" ");					
				}
			}
			System.out.println();
		}
		
	}
}

//0  0~4
//1  9~5
//2  10~14
//3  19~15
//4  20~24
//->짝수 그대로 / 홀수 거꾸로