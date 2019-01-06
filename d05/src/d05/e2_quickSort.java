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
		int k=0;
		
		int N =arr.length -1;
		Quick(arr, 0, N - 1);
        for (k = 0; k < N; k++) {
        	System.out.print(arr[k]+" ");
        }
	}

	private static int Quick(int []a,int left, int right){
			
			if(left<right) {
			int i = left;
			int j=right + 1;
			int pivot = a[left];
			int temp=0;
			}
			
			do {
				do i++{while(a[i]<pivot);
				do j--; while(a[j]>pivot);
				if(i<j) {
					temp=a[i];
					a[j]=a[i];
					a[i]=temp;
				}
			}
			temp=a[left];
			a[left]=a[j];
			a[j]=temp;
			//swap(a[left],a[j]);
			
			QuickSort(a,left,j-1);
			QuickSort(a,j+1,right);
		}
	}
}
