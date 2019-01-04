package d03;

import java.util.Scanner;

//make big star

public class p7_forfor02 {
	public static void main(String[] args) {
		String symbol;
		int i,j,k;
		//Scanner input = new Scanner(System.in);
		//symbol = input.nextLine();
		
		for(i=0;i<5;i++) {
			for(j=i;j<15;j++) {
				System.out.print(" ");
			}
			for(k=0;k<2*i+1;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(i=0;i<5;i++) {
			for(k=0;k<=i;k++) {
				System.out.print(" ");
			}
			for(j=0;j<=27-(2*i-1);j++) {
				System.out.print("*");
			}
			for(k=0;k<=i;k++) {
				System.out.print(" ");
			}
			System.out.println("");
		}
		
		for(i=0;i<7;i++) {
			for(j=0;j<5;j++) {
				System.out.print(" ");
			}
			for(j=10-i;j>0;j--) {
				System.out.print("*");
			}
			for(j=0;j<2*i+1;j++) {
				System.out.print(" ");
			}
			for(j=10-i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
}
