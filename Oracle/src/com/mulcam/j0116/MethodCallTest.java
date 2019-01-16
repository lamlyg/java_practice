package com.mulcam.j0116;

import java.util.ArrayList;
import java.util.List;

public class MethodCallTest {
	public static void main(String[] args) {
		
		A a = new A();//객체생성식
		//A클래스를 사용할 준비를 끝마쳤다.
		//a.~  : A클래스에 있는 (속해있는)
		//사용 : a.필드명; a.메소드();
		
		a.hello();
		
		
		/*
		 	<데이터>
		 100	true		3.14		홍길동	
		 int 	boolean 	double		String
		 
		 */
		int 홍길동 = 200;
		System.out.println(홍길동);
		
		int su=0,su2=1,su3=2;
//문제1) su데이터를 m1()에 전달하시오.
		//메소드 호출
		a.m1(10);
		//a.m1("a");
//		a.m1(a.su);
		
//문제2) su,su2,su3데이터를 m2()에 전달하세요
		//-> 매개변수 자리 늘리면 됨
		a.m2(su, su2, su3);
//문제3) su,su2,su3데이터를 한 개의 변수명으로 m3()에 전달하세요
		int[]arr= {su,su2,su3};
		//a.m3(arr);
		
		
		String name = "홍길동";
		int age = 13;
		String job = "학생";
		
//뮨제4) 관련있는 속성 name, age, job 데이터를 m4()에 전달하세요
		Person p = new Person(name, age, job); 
		
		//a.m4(p);
		
		Person p2 = new Person("김철수",14,"학생");
		Person p3 = new Person("길라임",15,"학생");
		Person p4 = new Person("김유신",16,"화랑");
		
//문제5) 여러 관련있는 속성 name,age,job 데이터를 m5()에 전달하세요
		//sol(i)
		Person [] pArry = {p2,p3,p4};
			//p2===>pArr[0]
		//sol(ii)
		List<Person> list = new ArrayList<>();
		a.m5(list);
//리턴이 void인 경우 -> 자료형 변수명 = a.m5(list); //에러
		//-----> 앞에 변수 선언을 할 수 없음!
		
//---------------------------------------------------
//문제6) m11()메소드 호출
		a.m11();
		int num = a.m11();
		System.out.println("결과 : "+num);
		
//문제7) m12()메소드 호출 - 반환형: 배열
		int[] noArr = a.m12();
		for (int i = 0; i < noArr.length; i++) {
			System.out.println(noArr[i]);
		}
//문제8) m13()메소드 호출
		System.out.println(a.m13());
//문제9) m14()메소드 호출
		//ArrayList<Person>persons=a.m14();
		System.out.println("=================");
		//System.out.println(persons);
		
	}
}
