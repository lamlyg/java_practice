package swingcomponent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyFrame1 extends JFrame{
	private JButton button;
	private JTextField text, result;
	
	public MyFrame1() {
		setSize(300,130);
		setTitle("제곱 계산하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		ButtonListener listener = new ButtonListener(); //리스너 객체 생성
		
		JPanel panel = new JPanel();
		panel.add(new JLabel("숫자 입력 : "));
		text = new JTextField(15);
		text.addActionListener(listener);
		panel.add(text);
		
		
		
	}
	
	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==button || e.getSource()==text) {
				String name = text.getText();
				int value = Integer.parseInt(name);
				result.setText(" "+value*value);
				text.requestFocus();
			}
		}
		
	}
}
public class TextFieldTest1 extends JFrame {
	public static void main(String[] args) {
		new MyFrame1();
	}
}
