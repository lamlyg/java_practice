package d07;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1,e2,e3;//스택영역에 저장할 공간을 미리 만들어주는것
		
		e1 = new Employee("김영희",100000);
		e2 = new Employee("박철수",200000);
		e3 = new Employee("홍길동",300000);	
		
		System.out.println(Employee.getNumberofemployees());
	}
}
