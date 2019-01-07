package d06;

/*
 	속성 : 인구, 면적, 언어, 나라이름
 	getter/setter 작성하기
 	
 	+@
 	인구수가 1000명 이상인 경우에만 필드에 설정하고 그 이하일 경우 경고문 출력
 	
 	면적이 양수로 입력될때만 필드에 설정하고 음수일 때는 경고문 출력
 */

public class Country {
	
	//필드 - private
	private int people;
	private int area;
	private String language;
	private String name;
	
	//setter & getter - public 
	
	public int getPeople() {
		return people;
	}
	
	public void setPeople(int people) {
		this.people = people; //this : 현재 메소드가 속해있는 객체의 위치
	}
	
	public int getArea() {
		return area;
	}
	
	public void setArea(int area) {
		this.area = area;
	}
	
	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	
//	public void setPeople(int p) {
//		if(p>=1000) people = p;
//		else System.out.println("Error : People Error");
//	}
//	public void setArea(int s) {
//		if(s>0) area = s;
//		else System.out.println("Error : Area Error");
//	}
//	public void setLanguage(String l) {
//		language = l;
//	}
//	public void setName(String n) {
//		name = n;
//	}
//	
//	public int getPeople() {
//		return people;
//	}
//	public int getArea() {
//		return area;
//	}
//	public String getLanguage() {
//		return language;
//	}
//	public String getName() {
//		return name;
//	}
	
	@Override
	public String toString() {
		return "Country [people=" + people + ", area=" + area + ", language=" + language + ", name=" + name + "]";
	}

	
	
}

