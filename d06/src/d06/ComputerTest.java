package d06;

import java.util.Scanner;

public class ComputerTest {
	public static void main(String[] args) {
		
		Computer com = new Computer();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("CPU : ");
		int cpu=input.nextInt();
		com.getCPU(cpu);
		
		System.out.println("RAM : ");
		int ram=input.nextInt();
		com.getRAM(ram);
		
		System.out.println("SSD : ");
		int ssd=input.nextInt();
		com.getSSD(ssd);
		
		
		com.PlusE(10);
		
		System.out.println(com);
		
		
		input.close();
	}
}
