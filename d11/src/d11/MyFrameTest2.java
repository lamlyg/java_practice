package d11;

import javax.swing.JFrame;//상속할 때 import

class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("MyFrameTest");
		//Frame 셋팅 호출
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//OFF시 옵션
		setResizable(true);
		//리사이즈
		setSize(300, 400);
		//사이즈
		setVisible(true);
		//비저블
		
	}
}//JFrame 상속받아서 정의한 MyFrame 클래스

public class MyFrameTest2 {
	public static void main(String[] args) {
		MyFrame mf = new MyFrame();
	}
}//실행클래스 main메소드 -> MyFrame 객체 생성
