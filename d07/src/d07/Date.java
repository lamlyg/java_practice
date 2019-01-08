package d07;

public class Date {
	private int year;
	private String month;
	private int day;
	
	//Method
	public void setDate(int year, String month, int day)
	{
		this.year=year;
		this.month = month;
		this.day = day;
	}
	
	public void printDate() {
		System.out.println("Date : "+year+month+day);
	}
	
	public Date() {//기본생성자
		year = 0;
		month= "Jan";
		day=0;
	}
	public Date(int year,String month,int day) {
		this.year=year;
		this.month=month;
		this.day=day;
	}
	public Date(int year) {
		this(year,"1월",1);
	}
	public Date(int year,String month) {
		this(year,month,1);
	}
	
}

	///////////////////////
	// Date				 // 클래스 이름
	///////////////////////
	// -year : int		 //
	// -month : string	 // 필드
	// -day : int		 //
	///////////////////////
	// +setDate()		 // 메소드
	// +printDate()	  	 //
	///////////////////////