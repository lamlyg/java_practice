package Exchange;
/*
 	달러를 입력창에 입력하고
 	변환 버튼을 누르면 원화로 얼마인지 
 	계산하여 출력하는 프로그램
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


class ExchangeFrame extends JFrame{

	JTextField jf;
	JButton btn;
	JLabel label;

	public ExchangeFrame() {

		JPanel panel = new JPanel();

		jf = new JTextField(10);
		btn = new JButton("변환");
		label = new JLabel("??");

		panel.add(jf);
		panel.add(btn);
		panel.add(label);
		this.add(panel);

		btn.addActionListener(new ExchangeListener());

		//프레임 기본설정
		setTitle("Exchange");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	
	 class ExchangeListener implements ActionListener{
         
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            // TODO Auto-generated method stub
	        	String dollarStr = jf.getText();
	        	double dollarDouble = Double.parseDouble(dollarStr);
	        	int won = (int)(dollarDouble*1122.38);
	        	label.setText(won+"won");
	        }
	    }
	 
}
public class ExchangeTest1 {
	public static void main(String[] args) {
		//new Exchange();
		new ExchangeFrame();
	}
}
