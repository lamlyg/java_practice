package component;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class TextFrameAnswer extends JFrame implements ActionListener{
	
	//컴포넌트를 필드로 선언
	JTextField id;//텍스트 입력 가능
	JPasswordField pw;//텍스트 입력 시 가려지면서 입력됨
	JFormattedTextField date;//형식을 주고 형식에 맞게 입력받기
	JTextArea textArea;//입력받은 정보들을 출력하는 공간
	
	public TextFrameAnswer() throws ParseException {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,2));//격자형 배치 : GridLayout(col,row)배치관리자 사용
		
		id = new JTextField();
		panel.add(new JLabel("ID : "));
		panel.add(id);
		
		id.addActionListener(this);
		
		pw = new JPasswordField();
		panel.add(new JLabel("PW : "));
		panel.add(pw);
		pw.addActionListener(this);
		
		MaskFormatter mf = new MaskFormatter("####.##.##");//parsing 예외처리
		mf.setPlaceholderCharacter('_');
		
		
		date = new JFormattedTextField(mf);//JFormattedTextField(Format format)
		panel.add(new JLabel("DATE : "));
		panel.add(date);
		date.addActionListener(this);
		
		
		textArea = new JTextArea(10,30);
//		panel.add(textArea);
		
		add(panel,BorderLayout.NORTH);
		add(textArea, BorderLayout.SOUTH);
		
		//기본세팅
		setTitle("TextFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,300);
		setVisible(true);
		setResizable(false);
	}
	
	public static void main(String[] args) {
		try {
			new TextFrameAnswer();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == id || e.getSource()== pw || e.getSource() == date) {
			String text = "id : "+id.getText() + "\n"
					+"pw : "+pw.getText() + "\n"+"date : "+date.getText() + "\n";
			textArea.append(text);//append : 점점 추가하는 기능
		}
	}
}
