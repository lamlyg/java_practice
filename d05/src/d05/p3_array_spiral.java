package d05;

/*
 1  2  3  4  5
 16 17 18 19 6
 15 24 25 20 7
 14 23 22 21 8
 13 12 11 10 9
*/

/*
 */
public class p3_array_spiral {
	public static void main(String[] args) {
		int i=0,j=0;//반복계수
		int n=0,m=0;//행렬
		int count=0;
		int [][]arr 
		= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		
//		int [][]arr 
//		= {{1,2,3,4,5,6,7},{8,9,10,11,12,13,14},{15,16,17,18,19,20,21}
//		,{22,23,24,25,26,27,28},{29,30,31,32,33,34,35}
//		,{36,37,38,39,40,41,42},{43,44,45,46,47,48,49}};
		
		int [][]temp=new int[arr.length][arr[0].length];
		
		for(j=0;j<arr[0].length;j++) {
			if(count!=arr[0].length-1) {
				temp[i][j]=arr[n][m];
				count++;
				m++;
			}
			else {
				temp[i][j]=arr[n][m];
				count=0;
				n++; m=0;
			}
		}
		
		j-=1;
		for(i=1;i<arr.length;i++) {				
			if(count!=arr[0].length-1) {
				temp[i][j]=arr[n][m];
				count++;
				m++;
			}
			else {
				temp[i][j]=arr[n][m];
				count=0;
				n++; m=0;
			}
		}
		
		i-=1;
		for(j=arr.length-2;j>=0;j--) {
			if(count!=arr[0].length-1) {
				temp[i][j]=arr[n][m];
				count++;
				m++;
			}
			else {
				temp[i][j]=arr[n][m];
				count=0;
				n++; m=0;
			}
		}
		j+=1;
		
		for(i=arr.length-2;i>0;i--) {
			if(count!=arr[0].length-1) {
				temp[i][j]=arr[n][m];
				count++;
				m++;
			}
			else {
				temp[i][j]=arr[n][m];
				count=0;
				n++; m=0;
			}
		}
		i+=1;
		
		
		for(j=1;j<arr.length-1;j++) {
			if(count!=arr[0].length-1) {
				temp[i][j]=arr[n][m];
				count++;
				m++;
			}
			else {
				temp[i][j]=arr[n][m];
				count=0;
				n++; m=0;
			}
		}
		
		j-=1;
		for(i=2;i<arr.length-1;i++) {
			if(count!=arr[0].length-1) {
				temp[i][j]=arr[n][m];
				count++;
				m++;
			}
			else {
				temp[i][j]=arr[n][m];
				count=0;
				n++; m=0;
			}
		}
		i-=1;
		
		for(j=2;j>0;j--) {
			if(count!=arr[0].length-1) {
				temp[i][j]=arr[n][m];
				count++;
				m++;
			}
			else {
				temp[i][j]=arr[n][m];
				count=0;
				n++; m=0;
			}
		}
		j+=1;
		System.out.println();
		for(i=arr.length-3;i>1;i--) {
			if(count!=arr[0].length-1) {
				temp[i][j]=arr[n][m];
				count++;
				m++;
			}
			else {
				temp[i][j]=arr[n][m];
				count=0;
				n++; m=0;
			}
		}
		i+=1;
		j+=1;
		
		
		temp[i][j]=arr[n][m];
		
		for(i=0;i<temp.length;i++) {
			for(j=0;j<temp[i].length;j++) {
				System.out.print(temp[i][j]+"\t");
			}
			System.out.println();
		}
	}	
}
