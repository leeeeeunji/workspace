package basic;

import javax.swing.*;

public class ChildJFrameMain {

	public static void main(String[] args) {
		/*
		 * 1. JFrame 객체 생성
		 */
		ChildJFrame childJFrame = new ChildJFrame();
		
		/*
		 * 2. JFrame객체 생성
		 */
		JFrame jFrame = new JFrame();
		jFrame.setTitle("난 걍 프레임");
		jFrame.setSize(300, 400);
		
		/*
		 * JFrame객체를 화면에 보여주세요
		 */
		jFrame.setVisible(true);
		/*
		 * Container[JFrame].setVieible(true);
		 * 	- 메인쓰레드가 호출하면 JVM GUI쓰레드를 생성
		 * 	- GUI쓰레드는 무한대기하면서 이벤트와 그래픽처리를 담당
		 * 	- Container[JFrame]는 계속 떠있음(JVM이 종료되지 않음)
		 */
		
		/*
		jFrame.setSize(300, 400);
		jFrame.setVisible(true);
		*/

	}

}
