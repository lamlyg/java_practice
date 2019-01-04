package d05;

import java.util.Scanner;

/*
 3년 동안의 분기별 강수량 구하기
 3 by 4 배열 만들어서 강수량 저장
 사용자에게 분기별 강수량을 입력받고 연도별 강수량을 출력하세요.
 */
public class p1_2d_array_rainfall {
	public static void main(String[] args) {
		
		int sum=0;
		int n = 1;
		int m = 1;
		int [][]arr = new int[3][4];
		String []season = {"봄","여름","가을","겨울"};
		Scanner input = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(n+"년도 강수량을 입력하세요 ");
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(season[j]+" ");
				arr[i][j]=input.nextInt();
				m++;
			}
			n++;
			m=0;
		}
		n=1;
		for(int k=0;k<arr.length;k++) {
			for(int o=0;o<arr[k].length;o++) {
				sum+=arr[k][o];
			}
			System.out.println(n+"년도 강수량 "+sum);
			System.out.println();
			n++; sum=0;
		}
		
	}
}
