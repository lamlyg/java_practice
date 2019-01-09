package d08;

/*
 	다형성 (Polymorphism) 
 	: 여러가지 형태를 가질 수 있는 능력
 	- 같은 타입이지만 실행결과가 다양한 객체를 이용할 수 있는 성질
 	- 하나의 타입에 여러객체를 대입함으로써 다양한 기능을 이용할 수 있도록 해줌
 */

//Parent Class
class Shape{
	int x, y;
	public void draw() {
		System.out.println("Draw Shape!");
	}
	public void print() {
		System.out.println("print() of Shape");
	}
}

//Child Class1
class Circle extends Shape{
	private int radius;

	//Getter
	public int getRadius() {
		return radius;
	}
	
	//Setter
	public void setRadius(int radius) {
		this.radius = radius;
	}

	//Method Overriding
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw Circle");
	}
}


//Child Class2
class Rectangle extends Shape {
	//Field
	public int width;
	private int height;
	
	//Getter&Setter
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	//Method Overriding
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw Rectangle");
	}
}


//Excute Class
public class ShapeTest {
	public static void main(String[] args) {
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		c.draw();
		r.draw();
		
		Shape s1 = new Circle();//부모타입의 참조변수로 자식타입 객체 참조 가능
		Shape s2 = new Rectangle();
		s1.draw();
		s2.draw();
		
//		s2.setWidth(10);//부모로 참조변수를 받고난 이후에는 부모에 있는 것만 호출할 수 있음 
		//Rectangle에는 setWidth()메소드가 있지만 부모인 Shape에는 없으므로 호출불가
		
		s2.x = 10;
		s2.y = 20;
		//Shape 클래스의 필드에는 접근 가능
		
//		s2.width = 20;
//		s2.height = 10;
		//참조변수 s2를 통해서 Rectangle 클래스의 필드와 메소드에 접근하는 것은 안됨
		
//-------------------------------------------------------------------------------------------------
		/*
		 	=> How to Access?!
		 	하향 형변환 (강제타입변환)
		 	: 부모타입을 자식타입으로 형변환하는 것
		 	-> When? => 자식클래스 객체인데 형변환에 의해서 일시적으로 부모클래스 참조변수에 의해 참조되고 있는 경우
		 	
		 	형식 : (자식타입) 참조변수;
		 	Shape s1 = new Rectangle(); 
		 	(Rectangle) s1; 
		 	
		 */
		
		Rectangle r1 = (Rectangle) s2;//강제형변환을 통해 자식객체인 Rectangle안의 필드 height, width 접근가능
		r1.width=10;
		r1.getWidth();
//-------------------------------------------------------------------------------------------------


//-------------------------------------------------------------------------------------------------
		/*
		  	하향형변환을 할때 참조변수가 어떤 자식객체인지 알아야 제대로 형변환을 할 수 있음
		  	객체의 타입확인 => instanceof 사용
		  	
		  	[형식] 
		  		객체 instanceof 클래스타입 
		  		: 왼쪽의 객체가 오른쪽의 타입이면 true, 아니면 false 반환
		  		
		  	*상속관계가 아닌 클래스간의 형변환 불가
		*/
		
		boolean result = s2 instanceof Rectangle;
		System.out.println(result);
//-------------------------------------------------------------------------------------------------
		
		//Polymorphism(다형성)
		Shape[] s_arr = new Shape[3];
		s_arr[0] = new Circle();
		s_arr[1] = new Rectangle();
		s_arr[2] = new Shape();
		//부모타입의 참조변수로 자식 객체들을 모두 참조 가능
		//상속받은 자식객체들을 배열로 관리가능
		//서로다른 객체 (Circle, Rectangle)이더라도 배열로 관리 -> 반복문 사용가능
		
		for(int i=0;i<s_arr.length;i++) {
			s_arr[i].draw();
			if(s_arr[i] instanceof Rectangle) {
				System.out.println("s_arr["+i+"]"+" = Rectangle");
			}
			else if(s_arr[i] instanceof Circle) {
				System.out.println("s_arr["+i+"]"+" = Circle");				
			}
			else {
				System.out.println("Error : No Type");
			}
		}
		
	}
}
