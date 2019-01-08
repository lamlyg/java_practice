package d07;

public class Member {
	private String name;
	private String id;
	private String password;
	private int age;
	
	//getter&setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//constructor
	public Member() { //기본생성자
		name = "";
		id = "";
		password = "";
		age = 0;
	}
	
	public Member(String name) {
		this(name,"","",0);
	}
	
	public Member(String name,String id) {
		this("",id,"",0);
	}
	
	public Member(String name, String id,String password, int age) {
		this.name=name;
		this.id=id;
		this.password=password;
		this.age=age;
	}
	
}
