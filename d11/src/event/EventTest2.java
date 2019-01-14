package event;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 	1. 버튼하나 등록해서 클릭되면, "버튼 눌림" 콘솔창에 출력
 	2. 레이블 하나 만들어서 레이블에 버튼이 눌린 횟수 출력하기 	
 */

class Event extends JFrame{
	
	JButton btn;
	JLabel label;//컴포넌트 객체의 주소를 저장할 참조변수를 필드의 선언
	int count = 1;
	
	public Event() {
		
		//버튼등록
		btn = new JButton("Button");//<- 객체 생성 후 메소드 대입
		//레이블 - 버튼 횟수
		label = new JLabel("???");//<- 객체 생성 후 메소드 대입

		btn.addActionListener(new Listener());
		
		label.setText("!!!");//레이블 텍스트 변경 메소드
		//레이블에 문자열을 초기화해도 setText를 통한 문자열이 출력
		
		add(btn);		
		add(label);
		
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("if you press the button, then print on console.");
		setLayout(new FlowLayout());//<-어떻게 배치될지에 대한
		setVisible(true);
		setResizable(true);	
	}
	
	//이벤트리스너를 내부클래스로 -> 버튼횟수를 count하고 출력하기 위함
	class Listener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("Button Press");
			label.setText(count+" ");//버튼 눌린 횟수 출력 cf. setText->문자열 => count+"" : 꼼수 ㅋㅋ
			count++;
		};
	}
	
}

public class EventTest2 {
	public static void main(String[] args) {
		new Event();
	}
}
