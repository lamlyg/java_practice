package d10_2;

//finally문
public class FinallyTest3 {
	public static void main(String[] args) {
		//method1()은 static메소드이므로 인스턴스 생성없이 직접 호출 가능
		FinallyTest3.method1();
		System.out.println("method1()의 수행을 마치고 main메소드로 돌아왔습니다.");
	}//main메소드의 끝
	
	static void method1() {
		try {
			System.out.println("method1()이 호출되었습니다.");
			return;	//현재 실행 중인 메소드를 종료한다.
		}catch(Exception e) {
			e.printStackTrace();
		}finally {//try문과 함께 무조건 마지막에 수행됨
			System.out.println("method1()의 finally블럭이 실행되었습니다.");
		}
	}//method1메서드의 끝
}
