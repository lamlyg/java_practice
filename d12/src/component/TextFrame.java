package component;

import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 	id -> JTextField
 	pw -> JPasswordField
 	date -> JFormattedTextField
 	입력된 내용들이 출력되게... -> JTextArea
 	
 	격자배치 - GridLayout
 */

public class TextFrame extends JFrame {
	
	
	JPanel panel;
	JButton btn1;
	JButton btn2;
	JButton btn3;
	
	
	JLabel id_label;
	JLabel pw_label;
	JLabel date_label;
	JTextField id;
	JPasswordField pw;
	JFormattedTextField date;
	JTextArea area;
	
	
	public TextFrame() {
		
		panel = new JPanel();
		id_label = new JLabel("id",id_label.CENTER);
		id = new JTextField(15);

		pw_label = new JLabel("password",pw_label.CENTER);
		pw = new JPasswordField(15);
		
		date_label = new JLabel("date",date_label.CENTER);
		date = new JFormattedTextField();
		
		
		area.setSize(20, 400);
		btn1 = new JButton();
		btn2 = new JButton();
		btn3 = new JButton();
		
		//기본세팅
		setTitle("TextFrame");
		setSize(500,200);
		setVisible(true);
		setResizable(false);
		
		panel.add(id_label);
		panel.add(id);
		panel.add(pw_label);
		panel.add(pw);
		panel.add(date_label);
		panel.add(date);

		panel.add(area);
		panel.setLayout(new GridLayout(4,1,5,20));//행,열,갭,갭
		
		panel.addKeyListener(new KeyboardListener());
		add(panel);
	}
	
	class KeyboardListener implements KeyListener {
		
		public void display(KeyEvent e, String keyword) {
			char c = e.getKeyChar();
			int keycode = e.getKeyCode();
			String modifiers = e.isAltDown() + " " + e.isControlDown() + " " + e.isShiftDown();
			System.out.println(keyword+" "+c+" "+keycode+" "+modifiers);
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public static void main(String[] args) {
		new TextFrame();
	}
}
