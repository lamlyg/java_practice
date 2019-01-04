package d05;

/*
 버블정렬 -> 어딘가에 섞여있는 최댓값이 둥둥 떠올라서 위로 올라감 
 : 두개를 비교하고 작은것을 아래로 내리기
 
 [1번세트]
 3 2 5 4 1 : 첫번째값 두번째값
 2 3 5 4 1 : 두번째값 세번째값
 2 3 5 4 1 : 세번째값 네번째값
 2 3 4 5 1 : 네번째값 다섯번째값
 2 3 4 1 5 : 결과
 
 */

public class e1_bubbleSort {
	public static void main(String[] args) {
		
		int []arr= {3, 2, 5, 4, 1};
		int i=0,j=0;
		int temp=0;
		
		
		//min = arr[0];
		
		for(i=0;i<arr.length;i++) {
			for(j=1;j<arr.length-i;j++) {//->여기서 제대로 나중에 다시 볼 것!
				if(arr[j]<arr[j-1]) {
					temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp; //swap
				}
			}
		}
			for(i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		
	}
}
