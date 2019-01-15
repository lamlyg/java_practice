package layout;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 	CardLayout
 	: 컨테이너의 공간에 카드를 쌓아놓듯이 컴포넌트를 포개어 배치하는 배치관리자
 */
public class CardLayoutFrame extends JFrame implements ActionListener {
		Cards cards;
	
	public CardLayoutFrame() {


		JPanel panel = new JPanel(new GridLayout(0,5,10,0));//열,행,갭,갭

		addBtn("<<",panel);
		addBtn("<",panel);
		addBtn(">",panel);
		addBtn(">>",panel);
		addBtn("종료",panel);

		add(panel,BorderLayout.NORTH);

		cards = new Cards();
		add(cards, BorderLayout.CENTER);

		//		JPanel panel2 = new JPanel();
		//		panel2.add(new JButton("1번카드"));
		//		add(panel2, BorderLayout.SOUTH);//->내부클래스를 이용하여 카드 생성 

		//버튼에 리스너 장착(리스너 구현)
		//리스너가 할 일
		//<< : 처음 , < : 이전, >: 다음 >>:마지막 , 종료:끄기
		//카드레이아웃 메소드 이용해서 구현 : first(), previous(), next(), last(), 끄기 : System.exit
		setTitle("카드 레이아웃 예제");
		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
	}

	//버튼을 추가하기 위한 메소드
	void addBtn(String str, Container target) {
		JButton btn = new JButton(str);
		btn.addActionListener(this); //버튼들에게 이벤트리스너 장착
		target.add(btn);
	}

	//카드를 생성하기 위한 내부클래스
	private class Cards extends JPanel{

		CardLayout layout = new CardLayout();

		public Cards() {
			setLayout(layout);

			for(int i=1;i<=10;i++) {
				add(new JButton(i+"번카드"),BorderLayout.SOUTH);
			}
		}
	}

	public static void main(String[] args) {
		new CardLayoutFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("<<")) {
			cards.layout.first(cards);
		}
		else if(e.getActionCommand().equals("<")) {
			cards.layout.previous(cards);
		}
		else if(e.getActionCommand().equals(">")) {
			cards.layout.next(cards);
		}
		else if(e.getActionCommand().equals(">>")) {
			cards.layout.last(cards);
		}
		else if(e.getActionCommand().equals("종료")) {
			System.exit(0);
		}
		else {

		}
	}




}
