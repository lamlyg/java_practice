package d04;

/*
 선택정렬
 3 2 5 4 1  //가장 작은 값 고르기 -> 1 => 맨처음값과 바꾸기
 1 2 5 4 3  //2
 1 2 5 4 3  //3
 1 2 3 4 5
 
 */
public class e4_SelectionSort {
	public static void main(String[] args) {
		int[] arr = {1,5,2,7,8,3};
		
		int i=0,j=0;
		int minindex=0;
		int min=arr[0];
		int temp;
		
		for(i=0;i<arr.length;i++) {
			for(int k=0;k<arr.length;k++) {
				System.out.print(" "+arr[k]);
			}
			
			for(j=i;j<arr.length;j++) {
				if(arr[j]<min) {
					min=arr[j];
					minindex=j;
				}
				else {
					continue;
				}
			}
			
			temp=arr[minindex];
			arr[minindex]=arr[i];
			arr[i]=temp;
			
			min=100;
			System.out.println();
		}
	}
}