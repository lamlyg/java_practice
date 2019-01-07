package d06;

//상태 : cpu, ram, ssd 스펙에 대한 정보, 지금까지의 소비전력
//기능 : 소비전력을 추가 / 컴퓨터 사용시간을 매개변수로 받아서 사용시간에 해당하는 전기사용량을 누적시키는 기능을 하는 메소드
	 //소비전력은 시간당 10씩 증가
	 //현재상태를 출력하는 메소드

//+ 현재까지 소비한 전력에 대한 전기 사용금액 구하는 메소드

//실행클래스 : ComputerTest

public class Computer {
	int cpu;
	int ram;
	int ssd;
	int elec;
	int Power=0;
	
	public void getCPU(int input_cpu) {
		cpu=input_cpu;
	}
	public void getRAM(int input_ram) {
		ram=input_ram;
	}
	public void getSSD(int input_ssd) {
		ssd=input_ssd;
	}
//	public int setCPU() {
//		return cpu;
//	}
//	public int setRAM() {
//		return ram;
//	}
//	public int setSSD() {
//		return ssd;
//	}
	
	public void PlusE(int hour) {
		elec += hour*10;
//		for(int i=0;i<=hour;i++) {
//			Power+=10;
//		}
	}
	
	
	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", ram=" + ram + ", ssd=" + ssd + ", Power=" + Power + "]";
	}
	//== (위와 아래는 같은 기능을 하는 메소드)
//	public void PrintState() {
//		System.out.println("cpu : "+cpu);
//		System.out.println("ram : "+ram);
//		System.out.println("cpu : "+ssd);
//	}
	
	
}
