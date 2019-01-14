package layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutEx extends JFrame {
	public BorderLayoutEx() {
		setTitle("Flow LayOut 예제");
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panel = new JPanel();
		
		//Borderlayout으로 배치관리자 지정
		/*
		 	컨테이너의 공간을 동,서,남,북,중앙으로 5개의 영역으로 나눔 -> 5개의 영역에 컴포넌트를 배치
		 */
		panel.setLayout(new BorderLayout());
		panel.add(new JButton("Button1"),BorderLayout.CENTER);
		panel.add(new JButton("Button2"),BorderLayout.NORTH);
		panel.add(new JButton("Button3"),BorderLayout.SOUTH);
		panel.add(new JButton("Button4"),BorderLayout.EAST);
		panel.add(new JButton("Button5"),BorderLayout.WEST);
		
		add(panel);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BorderLayoutEx();
	}

}
