package component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyFrame2 extends JFrame{
	public MyFrame2() {
		//JFrame 속성 설정
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("ComponentTesr2");
		setVisible(true);//setVisible안하면 안뜸
		
		//패널생성 : 컴포넌트를 담을 수 있는 컨테이너
		JPanel jp = new JPanel();
		
		//레이블 : 편집이 불가능한 텍스트
		JLabel label = new JLabel("Hello");
		
		//버튼 : 사용자가 클릭했을 경우, 이벤트를 발생하여 원하는 동작을 하게하는데 이용됨
		JButton btn = new JButton("Button");
		
		//패널에 컴포넌트 추가
		jp.add(label);
		jp.add(btn);
		add(jp); //프레임에 패널 추가
		
		
		JButton btn1 = new JButton("Second Button");
		btn1.setText("Second Button");
		JButton btn2 = new JButton("Third Button");
		btn2.setText("Third Button");
		btn2.setEnabled(false);
		
		jp.add(btn1);
		jp.add(btn2);
		add(jp);
		
		//텍스트 필드 : 입력이 가능한 한줄의 텍스트 창
		JTextField jf1 = new JTextField(10);
		JTextField jf2 = new JTextField(20);
		
		jf2.setEditable(false);//setEditable: 입력의 가능여부 판단 메소드 
		
		jp.add(jf1);
		jp.add(jf2);//패널에 올리기
		add(jp);
		
		setVisible(true);
	}
}

public class CompenentTest2 {
	public static void main(String[] args) {
		new MyFrame2();
	}
}
