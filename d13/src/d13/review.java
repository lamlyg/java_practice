package d13;

//자바의 기본 구성 (Review)
/*

 	package 선언;
 	import 선언;
 	
 	(접근제한자-public/default) class 클래스명 extends 부모클래스 implements 인터페이스{
 	
 		필드 선언 (① 변수 선언);
 		
 		생성자;
 		
 		(반환형) 메소드(② 매개변수){
 			③ 변수
 		
 		}
 	}
 	
 */
/* [변수]
 	① : 멤버변수(필드)
 	②, ③ : 지역변수
 	
 	[변수 선언]
 	(자료형) 변수명;
 	
 	[속성변수] int, char, boolean //데이터를 직접 담는 변수
 	[참조변수] String, My, System //
 	
 	
 */

/*
 	[상속]
 	Parent p = new Parent(); (O)
 	Child c = new Child();	 (O)
 	Parent p2 = new Child(); (O) 부 자
 	Child c2 = new Parent(); (X)
 	
 	(기본) 부모를 통해 자식 호출X
 	-> (예외) 오버라이딩 메소드가 존재하면 자식 메소드 호출
 	
 */


public class review {
	public static void main(String[] args) {
		
	}
}
