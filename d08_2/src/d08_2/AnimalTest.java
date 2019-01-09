package d08_2;

abstract class Animal{
//	public void sound(){} => 추상메소드로 선언
	public abstract void sound();//추상메소드 선언
	
	
}

class Cat extends Animal{
	public void sound() {
		System.out.println("야옹");
	}
}

class Dog extends Animal{
	public void sound() {//*추상클래스를 상속받으면 상속받은 실체클래스 내에 추상메소드에 대해 실체클래스내에서 선언해야함 
		System.out.println("멍멍");
	}
}

public class AnimalTest {

}
