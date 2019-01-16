package test;

//반환형을 자유롭게 호환할 수 있는 반환형함수
class test{
	Object func(Object val) {
		if(val instanceof Integer)
			val = (int)val;
		
		return val;
	}
}
public class Main {
	public static void main(String[] args) {
		
	}
}
