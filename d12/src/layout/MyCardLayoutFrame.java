package layout;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyCardLayoutFrame extends JFrame{
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JButton btn5;

	JPanel buttonpanel;
	JPanel panel1;
	JPanel panel2;
	JPanel panel3;
	JPanel panel4;
	JPanel panel5;
	JPanel panel6;
	JPanel panel7;
	JPanel panel8;
	JPanel panel9;
	JPanel panel10;
	
	public MyCardLayoutFrame() {
		buttonpanel = new JPanel();
		panel1 = new JPanel();

		btn1 = new JButton("<<");
		btn2 = new JButton("<");
		btn3 = new JButton(">>");
		btn4 = new JButton(">");
		btn5 = new JButton("EXIT");

		buttonpanel.add(btn1);
		buttonpanel.add(btn2);
		buttonpanel.add(btn3);
		buttonpanel.add(btn4);
		buttonpanel.add(btn5);
		
		buttonpanel.setLayout(new GridLayout(1,5));
		
		add(buttonpanel,BorderLayout.NORTH);
		add(panel1,BorderLayout.SOUTH);
		
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		panel5 = new JPanel();
		panel6 = new JPanel();
		panel7 = new JPanel();
		panel8 = new JPanel();
		panel9 = new JPanel();
		panel10 = new JPanel();
		
		
		
		setTitle("Card Layout");
		setSize(700,500);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new CardLayoutFrame();
	}
}
