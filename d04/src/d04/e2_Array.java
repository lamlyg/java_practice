package d04;

import java.util.Scanner;

public class e2_Array {
	public static void main(String[] args) {
		//20명의 학생정보를 저장해야한다면?
		
		//우리가 생각하는 s1은 학생정보를 저장하기 위한 변수
		//num은 어떤 숫자를 저장하기 위한 변수
		//하지만 컴퓨터 입장에서는 s1과 s2의 차이나 s1과 num의 차이나 크게 다르지 않음
		
		//배열
		int[]s = new int[20];
		//정수배열의 위치를 저장할 변수
		//20개의 정수형 변수를 한번에 선언
		
		
		//배열로 접근하는 방법
		s[0]=1;
		s[1]=1;
		s[2]=1;
		s[3]=1;
		s[4]=1;
		s[19]=1;
		//s1,s2에서의 숫자는 그냥 변수명으로써의 글자
		//s[0]의 숫자 : 인덱스 
		
		//배열로 선언하면
		//s[0]과 s[1]은 서로연관있는 자료
		//num과 s[0]은 서로 연관없는 자료임을 인지할 수 있음
		
		//배열 선언
		
//		int[] intArray;
//		double[] doublArray;
//		String[] strArray;
//		
//		int intArray[];
//		double doubleArray[];
//		String strArray[];
		
		//배열도 객체이므로 힙영역에 생성되고 배열변수는 힙영역의 배열객체를 참조
		//참조할 객체가 없다면 배열변수는 null값으로 초기화 가능
		
		//값의 목록으로 배열을 생성
		//데이터타입[] 변수 = {값0, 값1, 값2, ... 값n};
		//주어진 값들을 항목으로 가지는 배열을 힙영역에 생성하고
		//배열 객체의 번지(주소)를 가져옴
		//배열 변수는 가져온 주소값을 저장함으로써 나중에 참조할 수 있게 됨!
		String[] names = {"홍길동","김자바","박찬호"};
		
		int[] scores = {83, 90, 87};
		
		int sum=0;
		
		System.out.println("scores[0] : "+scores[0]);
		System.out.println("scores[1] : "+scores[1]);
		System.out.println("scores[2] : "+scores[2]);
		
		for(int i=0;i<3;i++) {			
			sum+=scores[i];
		}
		
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+sum/3);
		
		//** new연산자 이용해서 배열생성
		//값의 목록을 가지고 있지는 않지만, 향후 값들을 저장할 배열을 미리 만들고싶다면
		//new연산자로 배열 객체를 생성할 수 있음
		//데이터타입 [] 변수 = new 데이터타입[배열길이];
		
		//길이가 5인 int형 배열 선언
		int[] intArr = new int[5];
		
		//intArr[0]~intArr[4]까지의 값이 저장될 수 있는 공간을 확보
		//배열의 생성 번지 (주소)를 리턴함
		//리턴된 주소는 intArr변수에 저장됨
//		new연산자로 배열을 생성하면 기본값으로 초기화 됨
		
		int[] salary = new int [2];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("직원1 월급 : ");
		salary[0] = sc.nextInt();
		
		System.out.println("직원2 월급 : ");
		salary[1] = sc.nextInt();
		
		final int STUDENT = 5;
		int kor[] = new int[STUDENT];
		int Ksum=0;
		
		//배열을 이용해서 학생 5명의 국어 성적을 입력 받아 평균을 출력하세요.
		for(int i =0;i<5;i++) {
			System.out.print("학생"+(i+1)+"의 국어성적 입력 : ");
			kor[i]=sc.nextInt();
			Ksum+=kor[i];
		}
		System.out.println("국어 성적의 평균 : "+(double)Ksum/5);
		
		
		
		
	}
}
