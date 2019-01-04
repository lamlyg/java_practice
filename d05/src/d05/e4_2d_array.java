package d05;

public class e4_2d_array {
	public static void main(String[] args) {
		//이차원 배열
		//데이터 타입[][] 변수 = new 데이터타입[길이][길이];
		
		//2by3크기의 2차원 정수형 배열을 생성하라
		
		int [][]arr = new int[2][3];
		
		int [][]arr2 = {{90,50,66,78},{90,50,78,45},{90,40,68,20}};
		int [][]arr3 = {{90,50,66},{90,50},{90,40,68,20}};
		
		int sum=0;
		int count =0;
		
		for(int i=0;i<arr3.length;i++) {//행의 길이 -> arr2.length
			sum=0; count=0;
			for(int j=0;j<arr3[i].length;j++) {//열의 길이->arr2[i].length
				sum+=arr3[i][j];
				count++;
				System.out.print(arr3[i][j]+" ");
			}
			System.out.print("-> Sum : "+sum+" Average : "+sum/count);
			System.out.println();
		}
	}
}
