package d07;

/*
 사용자에게 아이디를 입력받아서 입력한 아이디가 
 hong일 경우 true를 아닐경우 false를 리턴하는 메소드 checkId()를 설계한다.
 아이디 입력은 메인함수에서 구현하고 아이디체크는 checkId메소드에서 진행
 결과값으로 나온 boolean값을 메인함수에서 출력
 
 */

//실행클래스
import java.util.Scanner;

public class UserTest {
	public static void main(String[] args) {
		
		User user = new User();
		
		Scanner input = new Scanner(System.in);
		
		String id;
		boolean check;
		
		System.out.println("Input ID : ");
		id=input.nextLine();
		user.setId(id);
		
		System.out.println("ID check : ");
		
		check = user.checkId(user.getId());//cf. 인자 : 매개변수 자리에 넣어주는 값
		System.out.println(check);
		
		input.close();
	}
}
