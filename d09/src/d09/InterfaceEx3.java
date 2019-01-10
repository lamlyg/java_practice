package d09;

//인터페이스&추상클래스
/*
 	Animal
 	Insect
 	Bird
 	Butterfly
 	Ant
 	Dog
 	
 	클래스를 설계해보세요
 	=> 
 		Animal				Insect
 	Bird	 Dog	 Butterfly    Ant
 	
 	(특징) Flyable & Walkable
 */

class Animal{}
class Insect{}

interface Walkable{
	void walk();
}
interface Flyable{
	void fly();
}
class Bird extends Animal implements Flyable {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	
}
class Dog extends Animal implements Walkable {

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}
	
}
class Ant extends Insect implements Walkable {

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}
	
}
class Butterfly extends Insect implements Flyable {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	
}

//interface Animal{
//	void sound();
//	void kind();
//}
//
//interface Insect{
//	void sound();
//	void kind();
//}
//
//class Bird implements Animal {
//
//	@Override
//	public void sound() {
//		// TODO Auto-generated method stub
//		System.out.println("짹짹");
//	}
//
//	@Override
//	public void kind() {
//		// TODO Auto-generated method stub
//		System.out.println("Animal-Bird");
//	}
//	
//}
//
//class Butterfly implements Insect{
//	@Override
//	public void sound() {
//		// TODO Auto-generated method stub
//		System.out.println("파닥파닥");
//	}
//
//	@Override
//	public void kind() {
//		// TODO Auto-generated method stub
//		System.out.println("Insect-Butterfly");
//	}
//}
//
//class Ant implements Insect{
//	@Override
//	public void sound() {
//		// TODO Auto-generated method stub
//		System.out.println("개미는 뚠뚠");
//	}
//
//	@Override
//	public void kind() {
//		// TODO Auto-generated method stub
//		System.out.println("Insect-Ant");
//	}
//}
//
//class Dog implements Animal {
//	@Override
//	public void sound() {
//		// TODO Auto-generated method stub
//		System.out.println("멍멍");
//	}
//
//	@Override
//	public void kind() {
//		// TODO Auto-generated method stub
//		System.out.println("Animal-Dog");
//	}
//}

public class InterfaceEx3 {
	public static void main(String[] args) {
//		Animal []a = new Animal[2];
//		a[0]=new Bird();
//		a[1]=new Dog();
//		
//		a[0].kind();
//		a[0].sound();
//		
//		a[1].kind();
//		a[1].sound();
//		
//		Insect []i = new Insect[2];
//		i[0]=new Ant();
//		i[1]=new Butterfly();
//		
//		i[0].kind();
//		i[0].sound();
//
//		i[1].kind();
//		i[1].sound();
	}
}
