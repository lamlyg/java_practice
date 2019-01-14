package d11;

import javax.swing.JFrame;

/*
	GUI
		Graphical User Interface
		사용자가 편리하게 입출력할 수 있도록 그래픽으로 화면을 구성하고, 
		마우스나 키보드로 입력받을 수 있도록 지원하는 사용자 인터페이스
	CLI
		Command Line Interface
		
	AWT : 운영체제가 제공하는 자원을 이용해서 컴포넌트를 생성
	중량 컴포넌트
	 	- AWT 컴포넌트의 그리기는 운영체제에 의해 이뤄지며, 운영체제의 자원을 많이 소모하고 부담을 줌
	 	- 호환성의 문제 
	
	SWING : AWT기술을 기반으로 작성된 자바 라이브러리
			자바로 작성되어 있기 때문에 어떤 플랫폼에서도 일관된 화면을 보여줄 수 있음
			경량 컴포넌트
				-스윙컴포넌트는 운영체제의 도움을 받지 않고 직접 그리기 때문에 운영체제에 부담을 주지않음
			스윙 프로그램은 컴포넌트를 이용해서 조립하듯이 작성
			
	컨테이너 
		- 다른 컴포넌트를 포함할 수 있는 GUI컴포넌트
		- 다른 컨테이너에 포함될 수 있음
		- Swing 컨테이너 : JFrame, JPanel, JDialog
		
	컴포넌트
		- 컨테이너에 포함되어야만 화면에 출력할 수 있는 GUI 객체
		- 다른 컴포넌트를 포함할 수 없는 순수 컴포넌트
		
	최상위 컨테이너
		- 다른 컨테이너에 포함되지 않고도 화면에 출력되며, 독립적으로 존재 가능한 컨테이너
		- 스스로 화면에 자신을 출력하는 컨테이너 : JFrame, JDialog
		
	JFrame : 모든 스윙 컴포넌트를 담는 최상위 컨테이너
			  컴포넌트를 화면에 보이려면 스윙 프레임에 부착되어야 함.
*/

/*
 	Frame 생성방법
 */
public class FrameTest {
	public static void main(String[] args) {
		//JFrame 객체를 생성
		JFrame jf = new JFrame("FrameTest");
		jf.setSize(400, 300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//(JFrame.EXIT_ON_CLOSE==3,상수)
		//창을 닫을 때 어떻게 할 것이냐
		jf.setAlwaysOnTop(true);
		jf.setResizable(false);
		jf.setVisible(true);
	}
}
