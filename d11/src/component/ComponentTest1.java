package component;

import javax.swing.JButton;
import javax.swing.JFrame;//cf. J는 스윙객체

class MyFrame extends JFrame{
	public MyFrame(){
		//버튼객체 생성
		JButton button = new JButton("Button");
		//버튼을 frame에 추가
		
		this.add(button);
		
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("ComponentTest");
		setVisible(true);
	}
}
public class ComponentTest1 {
	public static void main(String[] args) {
		MyFrame mf = new MyFrame();
	}
}
