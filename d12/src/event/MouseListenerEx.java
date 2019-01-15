package event;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

//마우스의 움직임을 콘솔창에 출력하는 프로그램 작성
/*
 	MouseListener, MouseMotionListener

 	좌표 + 행동 (클릭, 들어감, 나감, 눌림, 풀림, 드래그)
 */
class MouseFrame extends JFrame{

	
	public MouseFrame() {
		JPanel panel = new JPanel();
		
		//frame 기본 설정
		setTitle("BoxLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,500);
		setVisible(true);
		setResizable(true);
		
		add(panel);
		
		this.addMouseListener(new MyListener());
		 

	}




	class MyListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("mouseClicked");
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("mouseEntered");
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("mouseExited");
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("mousePressed");
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("mouseReleased");
		}
		
		

	}
}


public class MouseListenerEx {
	public static void main(String[] args) {
		new MouseFrame();
	}
}
