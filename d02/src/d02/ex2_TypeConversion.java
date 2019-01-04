package d02;

public class ex2_TypeConversion {
	public static void main(String[] args) {
		int i;
		double f;
		
		f=5/4;
		//연산결관느 1.25인데 정수연산이르모 소수점이하 무시됨
		//이후 실수자료형에 담았기 때문에 출력은 1.0으로 나옴
		System.out.println(f);
		f=(double)5/4;
		System.out.println(f);
		f=5/(double)4;
		System.out.println(f);
		//원래 정수형 데이터를 double형으로 형변환하여 실수형이됨
		//정수형과 실수형의 연산에서는 더 큰자료형을 따름
		//그러므로 연산결과 1.25나옴		
		f=(double)5/(double)4;
		System.out.println(f);
		
		i=(int)1.8+(int)1.3; //정수형으로 형변환했으므로 소수점 이하무시
		//1.8 -> 1
		//1.3 -> 1
		System.out.println(i);
		
		
	}
}
