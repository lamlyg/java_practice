package d07;

public class Employee {
	private String name;
	private int money;
	
	private static int numberofemployees=0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public static int getNumberofemployees() {
		return numberofemployees;
	}
	
	Employee(String name, int money){
		this.name=name;
		this.money=money;
		numberofemployees++;
	}
	
}
