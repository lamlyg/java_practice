package d09;

//생성자 생성 시, 필드값의 초기화 및 메모리 값을 확인하기 위함

class Init{
	static int cv =1;
	int iv=1;
	
	static { cv =2; }
	{iv=2;}
	Init(){
		iv=3;
	}
}

public class InitTest {
	public static void main(String[] args) {
		Init i = new Init();
		System.out.println(i.iv);
	}
}
