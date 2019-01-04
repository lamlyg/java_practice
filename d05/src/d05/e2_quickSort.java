package d05;

public class e2_quickSort {
	public static void main(String[] args) {
		int []arr= {5,3,7,6,2,1,4};
		int p=0;
		int pivot=0;
		int temp=0;
		boolean isRun=true;
		p=arr.length-1;
		pivot=arr[p];
		int i=0, j=arr.length-2;
		
		Qsort(arr, i, j, pivot, p);
		
//		while(isRun) {
//			if(arr[i]>=pivot&&arr[j]<=pivot) {
//				temp=arr[i];
//				arr[i]=arr[j];
//				arr[j]=temp;
//				i++;
//				j--;
//			}
//			else if(i>=j) {
//				temp=arr[i];
//				arr[i]=pivot;
//				arr[p]=temp;
//				p=i;
//				for(int k=0;k<arr.length;k++) {
//					System.out.print(arr[k]+" ");
//				}
//				System.out.println();
//				break;
//			}
//			else {
//				i++;
//			}
//		}
		
		
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
		System.out.println();
	}
	
	static void Qsort(int []arr, int left, int right, int pivot, int p) {
		
		int temp=0;
		arr = new int[arr.length];
		
		while(true) {
			if(arr[left]>=pivot&&arr[right]<=pivot) {
				temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right--;
			}
			else if(left>=right) {
				temp=arr[left];
				arr[left]=pivot;
				arr[p]=temp;
				p=left;
				for(int k=0;k<arr.length;k++) {
					System.out.print(arr[k]+" ");
				}
				System.out.println();
				break;
			}
			else {
				left++;
			}
		}
		
		//return left, right, pivot, p;
	}
}
