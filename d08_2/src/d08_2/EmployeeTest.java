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
	
	void print(Employee e) {
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

	void pay() {
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
	
	public Regular(double bonus, double monthsalary) {
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

	void pay() {
		double yearsalary=day*daysalary;
		super.setYearsalary(yearsalary);
	}
	
	public Temporary() {
		
	}
	
	public Temporary(int day, double daysalary) {
		this.day = day;
		this.daysalary = daysalary;
	}
	
	
}

public class EmployeeTest {
	public static void main(String[] args) {
		Temporary e1 = new Temporary(5,8);
		Regular e2 = new Regular();
		
		e1.setAge(18);
		e1.setName("김철수");
		//e1.pay();
		e1.print(e1);
		
		e2.setAge(23);
		e2.setName("김영희");
		e2.setMonthsalary(200);
		e2.print(e2);
		
	}
}
