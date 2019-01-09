package d08;

class GrandParent {
	
	int data = 100;
	
	//Basic Constructor
//	public Parent() {
//		System.out.println("Basic Constructor of Parent");
//	}
	
	public GrandParent() {
		
	}
	
	//Non-Basic Constructor
	public GrandParent(int data) {
		this.data=data;
	}
	
	public void print() {
		System.out.println("I'm GrandParent!");
	}
}

class Parent extends GrandParent{
	
	int data = 100;
	
	//Basic Constructor
//	public Parent() {
//		System.out.println("Basic Constructor of Parent");
//	}
	
	public Parent() {
		super(500);
	}
	
	//Non-Basic Constructor
	public Parent(int data) {
		this.data=data;
	}
	
	public void print() {
		System.out.println("I'm Parent!");
		System.out.println("data : "+data);
		System.out.println("this.data : "+this.data);
		System.out.println("super.data : "+super.data);
	}
}

class Child extends Parent {
	
	int data = 200;
	
	public Child() {//Constructor Overriding
		/*
		 	자식생성자가 호출되기 전에 부모생성자가 먼저 호출됨
		 	- 상속을 받으면 자식클래스를 만들 때 부모객체를 먼저만들고 자식객체를 이어붙여서 만드므로 이런 현상 발생
		 */
//		super(); // 이 코드가 원래 생략되어있음 
		//super : 부모클래스의 기본 생성자를 호출 (기본생성자가 아닌 생성자만 선언되어있으면 Error)
		super(100);
		//부모클래스에 기본생성자가 없다면 super();가 제기능을 할 수 없음
		//명시적으로 부모생성자에 맞춰서 호출해야함
		System.out.println("Basic Constructor of Child");			
	}
	
	public void print() {//Method Overriding
		int data = 300;
		super.print(); //부모의 메소드 호출가능 -> 데이터에도 접근 가능
		System.out.println("I'm Child!");
		System.out.println("data : "+data);
		System.out.println("this.data : "+this.data);
		System.out.println("super.data : "+super.data);
	}
}

public class ParentTest {
	public static void main(String[] args) {
		new Parent().print();
		new Child().print();//->부모생성자가 생성되고 자식생성자가 생성됨 (결과확인을 통해 확인할 수 있음)
	}
}
