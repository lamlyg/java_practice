package event;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

//마우스의 움직임을 콘솔창에 출력하는 프로그램 작성
/*
 	MouseListener, MouseMotionListener

 	좌표 + 행동 (클릭, 들어감, 나감, 눌림, 풀림, 드래그)
 */
class MouseFrame extends JFrame implements MouseListener, MouseMotionListener{


	public MouseFrame() {
		JPanel panel = new JPanel();
		panel.addMouseListener(this);
		panel.addMouseMotionListener(this);

		//frame 기본 설정
		setTitle("Mouse-Event");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,500);
		setVisible(true);
		setResizable(true);

		add(panel);
	}
	
	public void display(String s, MouseEvent e) {
		System.out.println(s + e.getX()+ ", "+e.getY());
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		display("mouseClicked: ",e);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		display("mouseEntered: ",e);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		display("mouseExited: ",e);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		display("mousePressed: ",e);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		display("mouseReleased: ",e);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		display("mouseDragged: ",e);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		//display("mouseMoved: ",e);
	}

}


public class MouseListenerEx {
	public static void main(String[] args) {
		new MouseFrame();
	}
}
