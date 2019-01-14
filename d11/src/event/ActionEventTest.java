package event;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 	버튼클릭하면 바탕색이 버튼에 적혀있는 색상으로 변경되도록 프로그래밍
 */

class ActionFrame extends JFrame{
	
	//JTextField jf;
	JButton yellow_btn;
	JButton red_btn;
	JPanel panel;
	//JLabel label;
	
	public ActionFrame(){
		panel = new JPanel();
		
		//jf = new JTextField(10);
		yellow_btn = new JButton("노란색");
		yellow_btn.setBackground(Color.yellow);
		red_btn = new JButton("빨간색");
		red_btn.setBackground(Color.red);
		
		//this.add(jf);
		panel.add(yellow_btn);
		panel.add(red_btn);
		
		add(panel);
		
		yellow_btn.addActionListener(new MyListener());//내부클래스에 있어서 new MyListener()
		red_btn.addActionListener(new MyListener());
		
		setTitle("Color Button");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println(".");
			System.out.println(e.getActionCommand());//e.getActionCommand(e :ActionEvent e)
			System.out.println(e.getSource());//이벤트를 수행하는 객체가 무엇인지
			System.out.println(e.getID());
			
			if(e.getSource()==yellow_btn) {
				panel.setBackground(Color.yellow);
			}
			else if(e.getSource()==red_btn) {
				panel.setBackground(Color.red);				
			}
		}		
	}
}

public class ActionEventTest {
	public static void main(String[] args) {
		new ActionFrame();
	}
}
