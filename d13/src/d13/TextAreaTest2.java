package d13;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;


class MyFrame2 extends JFrame implements ActionListener {
	protected JTextField textField;
	protected JTextArea textArea;
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String text = textField.getText();
		textArea.append(text + "\n");
		textField.selectAll();
		textArea.setCaretPosition(textArea.getDocument().getLength());
	}
	
	
}
public class TextAreaTest2 extends JFrame {
	public static void main(String[] args) {
		new MyFrame2();
	}
}
