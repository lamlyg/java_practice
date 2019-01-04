package d02;

/*
 	연산자 : 특정한 연산을 나타내는 기호
 	피연산자 : 연산의 대상
 	수식 : 상수나 변수, 함수와 같은 피연산자들의 조합
 	대입연산자 : 왼쪽의 변수에 오른쪽의 수식의 값을 계산하여 저장 
 */

public class ex3_Operator {
	public static void main(String[] args) {
		//산술연산자
		int result;
		double resultDouble;
		
		result = 3 + 2;
		System.out.println(result);
		result = 3 - 2;
		System.out.println(result);
		result = 3 * 2;
		System.out.println(result);
		result = 3 / 2;
		System.out.println(result);
		
		resultDouble = 3.0/2.0;
		System.out.println(resultDouble);
		
		result = 3%2;
		System.out.println(result);
		
		
		
		//증감연산자
		int x = 1;
		
		
		x +=1;
		System.out.println(x);
		
		//논리부정연산자
		//논리형 데이터를 반전시키는 연산자
		
		boolean isOK = true;
		System.out.println(isOK);
		
		isOK = !isOK;
		
		System.out.println(isOK);
		
		
		//복합대입연산자
		int i =10;
		int j = 12;
		
		i+=j;
		System.out.println(i);
		
		i-=j;
		System.out.println(i);
		
		
		//관계연산자
		//관계연산자는 두수의 값을 비교하기 위한 연산자를 의미함
		//주로 선택문과 반복문의 조건식으로 사용됨
		//관계연산자의 결과는 항상 true 또는 false가 됨
		
		int a = 3;
		int b = 4;
		
		System.out.println(a==b);//같은지 물어봄
		System.out.println(a!=b);//다른지 물어봄
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a<=b);
		
		
		//논리연산자
		//AND연산자 
		//: 두 값이 모두 1이면 결과 1, 아니면 결과 0 / 두 값이 모두 1이면 결과1, 아니면 결과 0 
//		0 AND 0 -> 0
//		0 AND 1 -> 0
//		1 AND 0 -> 0
//		1 AND 1 -> 0
		
//		(a==3)&&(b==7) -> 0
	  //true  AND  false -> false
		//OR연산자
//		0 OR 0 -> 0
//		0 OR 1 -> 1
//		1 OR 0 -> 1
//		1 OR 1 -> 1
		System.out.println((a==3) || (b==7));//->true
		System.out.println((a==3) || (b==4));//->true
		
		//NOT연산자
		
		//비트연산자
		//bit : 최소단위, 0과1로 표시
		//데이터를 비트단위로 연산
		
		int c = 10;
		int d = 7;
		
//		10 -> 1010
//		AND (&)
//		7 -> 0111
//		= 0010
		
		System.out.println(c&d);
		
		c = 10;
		d = 7;
		
//		10 -> 1010
//		OR (|)
//		7 -> 0111
//		= 1111
		
		System.out.println(c&d);
		
		//시프트연산자
		int g = c>>1;
		System.out.println(g);
		//1010
		// >> : 오른쪽으로 쉬프트
		//_1010 -> 0101(0) -> 0101 (Logical Right Shift)
		
		int k = c << 1;
		System.out.println(k);
		//1010 -> 10100 
		
		//1010
		// << :왼쪽으로 쉬프트
		//10100
		
		//연산자 우선순위
		//기본적으로 왼쪽에서 오른쪽으로
		//사칙연산 우선순위대로
		//괄호안이 먼저 계산
		//대입연산자는 가장 마지막에 
		
		
		//삼항연산자
//		(조건식) ? 참 : 거짓
		int result1 = (true)?1:2;
		System.out.println(result1);
		
		
		int score = 60;
		String result2 = (score>50)? "합격" : "불합격";
		
		System.out.println(result2);
		
		
		
	
		
	}
}
