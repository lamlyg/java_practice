package event;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 	200*200크기의 프레임 생성
 	50*20 크기의 레이블 생성
 	레이블의 초기 위치는 30,30
  	레이블안에는 "Hello" 문자입력
 	마우스로 프레임 안을 클릭하면 레이블이 해당 위치로 움직임
 */

public class MouseEventEx extends JFrame implements MouseListener {
	
	JPanel panel;
	JLabel label;
	
	public MouseEventEx() {

		setTitle("MouseEvent-Ex");
		setSize(500,500);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		panel = new JPanel();
		
		panel.addMouseListener(this);//리스너 등록
		
		label = new JLabel();

		//배치관리자 - container
		panel.setLayout(null);//레이블을 절대좌표에 위치시키기 위함->null값으로 배치관리자를 제거
		label.setLocation(30, 30);
		label.setSize(50, 20);
		
		label.setText("Hello");
		
		panel.add(label);
		add(panel);
		
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setLocation(e.getX(),e.getY());
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	public static void main(String[] args) {
		new MouseEventEx();
	}
}
