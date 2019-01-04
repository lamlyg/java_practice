package d04;

public class e3_ArrayCopy {
	public static void main(String[] args) {
		
		int[] arr = new int[3];
		System.out.println(arr);//arr이 담고 있는 배열의 주소 출력
//		int[] arr2;
//		System.out.println(arr2);//arr2를 초기화하지 않고 사용하려고하면 오류가 발생
		
		int[] arr2 = {0,0,0}; //아직 참조할 객체가 없다는 의미의 초기화
		
		//arr2 = arr;//arr2에다가 arr이 담고있는 주소 복사
		
		
		System.out.println(arr2);
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		
		for(int i=0;i<3;i++) {
			arr2[i]=arr[i];
		}
		
		for(int n : arr) {
			System.out.print(n+" ");
		}
		
		System.out.println();
		System.out.println("---------------");
		arr2[1] = 1000;
		
		for(int n : arr) {
			System.out.print(n+" ");			
		}
		System.out.println();
		for(int n : arr2) {
			System.out.print(n+" ");			
		}
	}
}