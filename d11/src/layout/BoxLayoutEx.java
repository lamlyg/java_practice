package layout;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 	frame을 상속받아서 클래스 정의
 		frame 기본 설정 원하는대로!
 		panel 생성
 		button을 만듬
 		메인메소드 -> 클래스 안에 정의
 */
public class BoxLayoutEx extends JFrame implements ActionListener{
	
	
	JPanel panel;
	JButton button;
	
	
	public BoxLayoutEx() {
				
		panel = new JPanel();
		button = new JButton("BUTTON");
		
		
		//frame 기본 설정
		setTitle("BoxLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,500);
		setVisible(true);
		setResizable(true);
		
		
		//컨테이너 -> 레이아웃 설정
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));//Y축으로 쌓아주기 ( 위아래로 쌓아주기 )
		
		JButton btn = new JButton("Button1");
		JButton btn2 = new JButton("Button2");
		
		
		panel.add(btn);
		add(panel);
		btn.setAlignmentX(Component.CENTER_ALIGNMENT);//중앙정렬
		panel.add(btn2);
		add(panel);
		
		btn2.setAlignmentX(Component.CENTER_ALIGNMENT);//중앙정렬
		panel.add(button);
		add(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Button Pressed");
	}
	
	public static void main(String[] args) {
		new BoxLayoutEx();
	}

}
