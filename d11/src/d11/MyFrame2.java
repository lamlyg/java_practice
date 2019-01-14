package d11;

import javax.swing.JFrame;

public class MyFrame2 extends JFrame{
	public MyFrame2() {
		setTitle("MyFrameTest");
		//Frame 셋팅 호출
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//OFF시 옵션
		setResizable(true);
		//리사이즈
		setSize(500, 400);
		//사이즈
		setVisible(true);
		//비저블
	}
	
	public static void main(String[] args) {
		MyFrame2 mf = new MyFrame2();
	}//그안에 main메소드 만들어서 객체 생성
	
}//JFrame상속받아서 MyFrame2정의
