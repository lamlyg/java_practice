package d07;

//Class Point + Circle + CircleTest

public class CircleTest {
	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point(2,3);
		
		Circle c1 = new Circle();
		c1.setRad(20);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(c1);
		
		System.out.println(c1.getCenter());
		c1.setCenter(p2);
		System.out.println(c1.getCenter());
		System.out.println(c1);
		
		//c1.setCenter();
		p2.setX(12);
		p2.setY(17);
		

		System.out.println(p2);
		System.out.println(c1);
		System.out.println(p2);
		
	}
}
