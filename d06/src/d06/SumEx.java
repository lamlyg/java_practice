package d06;
/*
 변수, 데이터타입, 연산자(비교/사칙/비트/관계/증감...), 제어문, 반복문 
 
 1에서부터 100까지 합을 구하는 프로그램을 만든다면?
 
 나중에 해당 코드를 재사용하려면?
 1. 복사붙여넣기->but, 단점: 수정시에 복붙한곳의 모든곳을 수정해야함
 2. 로직이나 기능을 하나로 묶어서 한덩어리로 만들고 관리 : 메소드/method(~=함수)
 
메소드 문법
	[public] 반환형 메소드이름(매개변수){
		실행문;
	}

 	public void add(){
 		
 	}
 */

public class SumEx {
	/*
	 	메소드 만들기
	 	1. 어떤것을 만들지 결정->숫자둘사이의 모든 값을 더하기 : 0~100까지
	 	2. 이름정하기->더하기=>add
	 	3. 형식에 맞게 구현
	 	4. 실행여부 판단
	 */
	
	public static void main(String[] args) {
		SumEx se = new SumEx(); //메소드를 사용하기 위해서 객체를 생성하는 명령어(내가 만든 기능을 이용하기 위해 객체 생성)
		int result=0;
		result=se.add(10,1000);//기능호출(se에 add라는 함수가 들어있음)
		
		if(result>=10000) {
			System.out.println("Result: "+result);			
			System.out.println("10000이상입니다.");
		}
		else {
			System.out.println("Result: "+result);			
		}
	}
	
	public int add(int a,int b) {
		int i=0;
		int sum=0;
		
		for(i=a;i<=b;i++) {
			sum+=i;
		}
		
//		System.out.println(sum);
		return sum;//결과값 반환->나를 호출한 곳으로 돌아가 + 결과값 sum을 가지고
	}
	/*
	 	결과값 리턴
	 	1. 돌려줄 결과값의 형태를 미리 정해둠
	 	2. 작업이 끝나고 결과값을 돌려줌
	 	3. 메소드를 호출하고 얻은 결과값을 특정변수에 저장
	 */
	
}
