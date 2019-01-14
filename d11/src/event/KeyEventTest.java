package event;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

class MyFrame4 extends JFrame implements KeyListener {
	
	public MyFrame4() {
		setTitle("Keyboard Event");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField jtf = new JTextField(10);
		jtf.addKeyListener(this); //키보드 이벤트 리스너 등록
		
		add(jtf);
		
		setVisible(true);
	}
	//키보드의 상태를 출력하기 위한 메소드
	public void display(KeyEvent e, String keyword) {
		char c = e.getKeyChar();
		int keycode = e.getKeyCode();
		String modifiers = e.isAltDown() + " " + e.isControlDown() + " " + e.isShiftDown();
		System.out.println(keyword+" "+c+" "+keycode+" "+modifiers);
	}
	
	@Override
	public void keyPressed(KeyEvent e) {//키가 눌렸을때
		// TODO Auto-generated method stub
		display(e,"KeyPressed");
	}

	@Override
	public void keyReleased(KeyEvent e) {//키가 눌렸다가 떼어질때
		// TODO Auto-generated method stub
		display(e,"KeyReleased");
	}

	@Override
	public void keyTyped(KeyEvent e) {//키가 입력이 되었을 때
		// TODO Auto-generated method stub
		display(e,"KeyTyped");
	}//KeyListener : 키보드에 따른 이벤트
	
}

public class KeyEventTest {
	public static void main(String[] args) {
		new MyFrame4();
	}
}
