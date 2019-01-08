package d07_3;

/*
 		Animal
 		  |
 		|ㅡㅡㅡ| (inheritance)
 	   Dog  Cat
 	   
 	   
 */

class Animal {
	public void sound() {
		//아직 특정한 동물이 정해져 있지 않기 때문에 몸체 비어있음
		System.out.println("???");
	}
}

/*
//부모클래스인 Animal에 정의된 sound()메소드가 적절하지 않음 
//-> 메소드 오버라이딩 (메소드 재정의)
 		서브클래스가 필요에 따라 상속된 메소드를 다시 정의하는 것
*/
class Dog extends Animal {
	public void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	public void sound() {
		System.out.println("야옹");
	}
}

public class DogTest{//Dog클래스에는 정의되어있지 않지만, Animal클래스에 정의된 sound()메소드 사용가능
	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
		
	}
}

