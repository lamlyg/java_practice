package d02;

public class e1_condition {

	public static void main(String[] args) {
		//if조건문
		/*
		  if(배고프면){
		  	냉장고안에서 빵먹어 ㅋㅋ
		  }
		  () : 조건
		  {} : 조건이 맞으면 실행될 문장들
		*/
		
		int hunger = 40;
		//50이하면 "냉장고빵 먹" 출력
		if(hunger<=50) {
			System.out.println("냉장고 빵 먹");
		}
		
		//if-else 조건문
		/*
		 조건을 만족할 때, 실행할 문장과
		 조건을 만족하지 않을 때 실행할 문장을 지정
		 
		 비가오면 빨래를 방안에 널고, 아니면 밖에 널어
		 if(비가오면){
		 	빨래 안에 ㄱㄱ
		 }
		 else{
		 	밖에 ㄱㄱ
		 }
		 
		 () : 조건
		 if{} : 조건이 참일 때 실행
		 else{} : 조건이 거짓일 때 실행
		 */
		
		//복합문
		//중괄호를 이용해서 문장을 그룹핑하는 것
		//블록(block)
		int grade = 90;
		if(grade>=60) System.out.print("합격");
		else System.out.println("불합격");
		
		//중첩 조건문
		/*
		 if안에 다시 if문이 오는 경우
		 else안에 다시 if문이 오는 경우
		 
		*/
		if(grade >= 80) {
			if(grade >= 90) {
				System.out.println("너님 A");
			}
			else {
				System.out.println("B!!");
			}
		}
		else {
			System.out.println("당신은 A,B 못받음!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
