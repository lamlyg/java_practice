package event;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;

class MyAdapterFrame extends JFrame {
	
	public MyAdapterFrame() {
		//frame
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField jf = new JTextField();
		jf.addKeyListener(new KeyAdapter() {
			//입력창에 키보드 리스너 장착 -> 익명클래스 
			//원래 : 리스너 -> 구현불필요 / 메소드 구현해야함
			//->Adapter -> 필요한 메소드만 구현하면 됨
			
			public void keyReleased(KeyEvent e) {
				System.out.println(e.getSource());
			}
			
		});
		add(jf);
		setVisible(true);
		
	}
}

public class AdapterTest {
	public static void main(String[] args) {
		new MyAdapterFrame();
	}
}
