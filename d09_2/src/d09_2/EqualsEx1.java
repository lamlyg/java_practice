package d09_2;

/*
 	java.lang패키지 : 자바프로그래밍에 가장 기본이 되는 클래스 포함 (-> import문 없이 사용가능)
 	
 	Object 클래스
 	: 멤버변수 X / 11개의 메소드
 */
//equals(Object obj) : 매개변수로 객체의 참조변수의 값을 받아서 비교 -> boolean값 return
class EqualsEx1{
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2))
			System.out.println("v1과 v2는 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다.");
		
		v2 = v1;
		if(v1.equals(v2))
			System.out.println("v1과 v2는 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다.");
	}
}

class Value {
	int value;
	
	Value(int value) {
		this.value = value;
	}
}
