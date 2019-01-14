package event;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame3 extends JFrame implements ActionListener{
	JButton btn;
	JLabel label;//컴포넌트 객체의 주소를 저장할 참조변수를 필드의 선언

	public MyFrame3() {
		//버튼등록
		btn = new JButton("Button");//<- 객체 생성 후 메소드 대입
		//레이블 
		label = new JLabel("???");//<- 객체 생성 후 메소드 대입
		
		//btn에 리스너 등록
		btn.addActionListener(this);//액션리스너 구현클래스가 자기자신이므로 

		label.setText("!!!");//레이블 텍스트 변경 메소드
		//레이블에 문자열을 초기화해도 setText를 통한 문자열이 출력

		add(btn);		
		add(label);

		setSize(200, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("if you press the button, then print on console.");
		setLayout(new FlowLayout());//<-어떻게 배치될지에 대한
		setVisible(true);
		setResizable(true);	
	}

	public void actionPerformed(ActionEvent e) {//ActionListener가 반드시 생성해야하는 메소드?
		// TODO Auto-generated method stub
		System.out.println("Button Press!");
	}
}

public class EventTest3 {
	public static void main(String[] args) {
		new MyFrame3();
	}
}
