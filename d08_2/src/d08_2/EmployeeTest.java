package d08_2;

/*
 	Employee 클래스
 	추상클래스
 	필드  : 이름, 나이, 연봉
 	추상메소드
 		pay();
 	메소드
 		print() : 직원정보출력 (예 : [정규직] 홍길동, 23, 3000)
 	
 	Regular 클래스
 		구현클래스
 		필드 : 상여금, 월급;
 		pay() : 월급에 따른 상여금 계산해서 연봉계산
 		- 250만 이상 : 연봉의 6%
 		- 200만 이상 : 연봉의 5%
 		- 200만 미만 : 연봉의 4%
 		
 	Temporary 클래스
 		구현클래스
 		필드 : 근무일수, 하루치 급여
 		pay() : 급여계산
 */

abstract class Employee{
	private String name;
	private int age;
	private double yearsalary;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getYearsalary() {
		return yearsalary;
	}

	public void setYearsalary(double yearsalary) {
		this.yearsalary = yearsalary;
	}

	abstract void pay();
	
	public void print(Employee e) {
		pay();
		if(e instanceof Regular) {
			System.out.println("[정규직] "+e.getName()+","+e.getAge()+","+(int)e.getYearsalary());
		}
		else if (e instanceof Temporary) {
			System.out.println("[비정규직] "+e.getName()+","+e.getAge()+","+(int)e.getYearsalary());			
		}
		else {
			System.out.println("Error");
		}	
	}
	
//	public void print() {
//		String result = null;
//		if(this instanceof Regular) {
//			result = "[정규직]";
//		}
//		else if (this instanceof Temporary) {
//			result = "[비정규직]";
//		}
//		else {
//			System.out.println("Error");
//		}
//		System.out.println(result+name+","+age+","+(int)yearsalary);			
//	}
		
	
	
	public Employee() {
		
	}
	
	public Employee(String name, int age, double yearsalary) {
		this.name = name;
		this.age = age;
		this.yearsalary = yearsalary;
	}
	
	
}

class Regular extends Employee {
	private double bonus;
	private double monthsalary;
	
	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getMonthsalary() {
		return monthsalary;
	}

	public void setMonthsalary(double monthsalary) {
		this.monthsalary = monthsalary;
	}

	public void pay() {
		//double yearsalary=super.getYearsalary();
		double yearsalary=monthsalary*12;
		if(monthsalary>=250) {
			bonus=yearsalary*(0.06);
		}
		else if(monthsalary>=200&&monthsalary<250) {
			bonus=yearsalary*(0.05);
		}
		else {
			bonus=yearsalary*(0.04);			
		}
		yearsalary=12*(monthsalary)+bonus;
		super.setYearsalary(yearsalary);
	}
	
	public Regular() {
		
	}
	
	public Regular(String name, double bonus, double monthsalary) {
		name = super.getName();
		this.bonus = bonus;
		this.monthsalary = monthsalary;
	}
	
	
	
}

class Temporary extends Employee {
	private int day;
	private double daysalary;
	
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public double getDaysalary() {
		return daysalary;
	}

	public void setDaysalary(double daysalary) {
		this.daysalary = daysalary;
	}

	public void pay() {
		double yearsalary=day*daysalary;
		super.setYearsalary(yearsalary);
	}
	
	public Temporary() {
		
	}
	
	public Temporary(String name, int day, double daysalary) {
		name = super.getName();
//		super.setName(name);
		this.day = day;
		this.daysalary = daysalary;
	}
	
	
}

public class EmployeeTest {
	public static void main(String[] args) {
		//Employee타입 참조변수 5칸짜리 배열 생성
		Employee[] e = new Employee[5];
		e[0] = new Temporary("김철수",5,8);
		e[1] = new Regular();
		
		e[0].setAge(18);
		
		//e1.pay();
		e[0].setName("김철수");
		e[0].print(e[0]);
		
		e[1].setAge(23);
		e[1].setName("김영희");
		Regular r1=(Regular) e[1];
		r1.setMonthsalary(200);
		e[1].print(e[1]);
		
	}
}
