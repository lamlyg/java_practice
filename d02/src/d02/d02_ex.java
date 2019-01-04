package d02;

import java.util.Scanner;

public class d02_ex {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input pencil : ");
		int pencil=input.nextInt();
		System.out.print("Input Student : ");
		int stu=input.nextInt();
		int per=pencil/stu;
		int namuzi=pencil%stu;
		
		System.out.print("A student can have pencil : "+per);
		System.out.println("");
		System.out.print("left pencil : "+namuzi);
		
		
		input.close();
	}
}
