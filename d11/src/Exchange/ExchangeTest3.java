package Exchange;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 	달러를 입력창에 입력하고
 	변환 버튼을 누르면 원화로 얼마인지 
 	계산하여 출력하는 프로그램
 */

class ExchangeFrame3 extends JFrame{

	JTextField jf;
	JButton btn;
	JLabel label;

	public ExchangeFrame3() {

		JPanel panel = new JPanel();

		jf = new JTextField(10);
		btn = new JButton("Convert");
		label = new JLabel("??");
		
		btn.addActionListener(new ActionListener(){//익명클래스로 구현	
			public void actionPerformed(ActionEvent e) {//Actionperformed메소드가 바로 클래스 안에
				// TODO Auto-generated method stub
				String dollarStr = jf.getText();
				double dollarDouble = Double.parseDouble(dollarStr);
				int won = (int)(dollarDouble*1122.38);
				label.setText(won+"won");
			}
		});
		
		panel.add(jf);
		panel.add(btn);
		panel.add(label);
		this.add(panel);


		//프레임 기본설정
		setTitle("Exchange");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
public class ExchangeTest3 {
	public static void main(String[] args) {
		new ExchangeFrame3();
	}
}
