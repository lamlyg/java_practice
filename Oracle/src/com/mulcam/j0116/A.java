package com.mulcam.j0116;

import java.util.ArrayList;
import java.util.List;

public class A {

	int su;

	void hello() {
		System.out.println("hello!");
	}

	void m1(Object val) {
		if(val instanceof Integer)
			val = (int)val;
		else if(val instanceof String)
			val = Integer.parseInt((String) val);

		System.out.println("m1():" + val);
	}

	void m2(int su, int su2, int su3) {
		System.out.println(su+" "+su2+" "+su3);
	}

	public void m3(int []arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"] : "+arr[i]);
		}

		for(int i : arr) {
			System.out.println(arr[i]);
		}
	}



	void m4(Person p) {
		System.out.println("나이 : "+p.getAge());
		System.out.println("이름 : "+p.getAge());
	}

	void m5(List<Person>list) {
		System.out.println("==============");
		System.out.println("m5() : ");
		System.out.println(list);
	}

	//---------리턴자료형이 있는 메소드------------------

	int m11() {
		System.out.println("m11()");
		int num=500;//메소드 안에서 생성된 데이터

		//return 데이터;
		return num;
	}

	//int,int,int m12() ---> 리턴형에는 한개의 자료형만 반환해야함!
	int[] m12() {
		int no1 = 600;
		int no2 = 700;
		int no3 = 800;

		int[] noArry = {no1,no2,no3};

		return noArry;
	}

	//Person
	Object m13() {//반환형 - 반환하는 자료형의 자료형으로 
		//"홍길동", 15, "학생"
		Person p = new Person("홍길동",15,"학생");

		//return new Person("홍길동", 15, "학생")

		return p;
	}

////	Person[] m14() {
//	ArrayList<Person> m14(){
//		//"길동",16,"학생"
//		//"라임",17,"학생"
//		//"주원",18,"학생"
//		Person p1 = new Person("길동",16,"학생");
//		Person p2 = new Person("라임",17,"학생");
//
//
//		Person []persons= {p1,p2,new Person("주원",18,"학생")};
//
//
//		ArrayList<Person> pList = new ArrayList();
//		pList.add(p1);
//		pList.add(p2);
//		pList.add(new Person("주원",18,"학생"));
//		
////		return list;
////		return persons;
//	}
}
