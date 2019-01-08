package d07;

//설계클래스
public class User {
	
	private String ID;
	
	public void setId(String ID) {
		this.ID=ID;
	}
	public String getId() {
		return ID;
	}
	
	public boolean checkId(String name) { 
		if(name.equals("hong")) return true; //***Java에서 문자열 비교는 (문자열).equals("비교문자열") 을 이용하자!***
		else return false;
	}
	
}
