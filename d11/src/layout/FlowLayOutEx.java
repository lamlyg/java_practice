package layout;
import java.awt.FlowLayout;
/*
 	배치관리자
 		- FlowLayout 배치관리자
 			: 컴포넌트가 삽입되는 순서대로 왼쪽에서 오른쪽으로 배치
 			: 배치할 공간이 없으면 아래로 내려와서 반복
 			
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 	패널하나 생성
 	패널위에 버튼 다섯개
 	프레임 JFrame상속받아서 생성
 	메인 메소드가 포함되는 방법으로 
 */
public class FlowLayOutEx extends JFrame implements ActionListener{
	
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JButton btn5;
	
	public FlowLayOutEx() {
		//기본세팅
		setTitle("Flow LayOut 예제");
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		
		JPanel panel;
		panel = new JPanel();
		
		panel.setLayout(new FlowLayout());//패널에 배치를 담당하는 배치관지라들을 flowLayOut으로 하겠다는 의미
		panel.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));//정렬, 수평갭, 수직갭
		
		
//		btn1 = new JButton();
//		btn2 = new JButton();
//		btn3 = new JButton();
//		btn4 = new JButton();
//		btn5 = new JButton();
//		panel.add(btn1);
//		panel.add(btn2);
//		panel.add(btn3);
//		panel.add(btn4);
//		panel.add(btn5);
		
		panel.add(new JButton("Button1"));
		panel.add(new JButton("Button2"));
		panel.add(new JButton("Button3"));
		panel.add(new JButton("Button4"));
		panel.add(new JButton("Button5"));
		
		add(panel);
		setVisible(true);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);

	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(".");
	}

	public static void main(String[] args) {
		new FlowLayOutEx();
	}
}
