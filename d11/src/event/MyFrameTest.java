package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 	1. 컴포넌트 생성
 	2. 이벤트 리스너를 작성
 	3. 이벤트 리스너를 컴포넌트에 등록
 	
 	이벤트 리스너의 위치
 	1. 별도의 클래스를 이벤트 리스너로 작성
 	2. 내부 클래스로 이벤트 리스너를 작성
 	3. 프레임 클래스를 이벤트 리스너로 구현하도록 만듬
 	4. 익명클래스로 구현
 */
class MyFrame extends JFrame{
	public MyFrame() {
		JButton btn = new JButton("Button");
		this.add(btn);//버튼이 나오도록 !!!*** -> 버튼 컴포넌트를 클릭하면 이벤트발생을 출력하고자 함
		
		//3. 컴포넌트에 리스너 등록
		btn.addActionListener(new MyListener());
		
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Event Example");
		setVisible(true);
		
	}
}

//2. 이벤트 처리클래스를 저으이(Listener 인터페이스를 구현하는 클래스 정의)
class MyListener implements ActionListener { //인터페이스 상속
	@Override
	public void actionPerformed(ActionEvent e) {//ActionListener가 반드시 생성해야하는 메소드?
		// TODO Auto-generated method stub
		System.out.println("Event Occur!");
	}
}

public class MyFrameTest {
	public static void main(String[] args) {
		new MyFrame();
	}
}
