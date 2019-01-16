package com.mulcam.j0116;

import java.util.Scanner;

class B{
	int sum;
	
	public void add() {
		sum++;
	}
	
	public void search() {
		System.out.println("SUM="+sum);
	}
	
}

public class DBRequiredTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		B b = new B();
		String no;
		
		System.out.println();
		do {
			System.out.println("<메뉴>");
			System.out.println("1.증가 2.검색 3.종료");
			System.out.println("번호====>");
			no=input.nextLine();
			
			switch(no) {
			case "1": b.add();
				break;
				
			case "2": b.search();
				break;
			}
		}while(!no.equals("3"));
	
		System.out.println("종료");
		
		input.close();
	}
}
