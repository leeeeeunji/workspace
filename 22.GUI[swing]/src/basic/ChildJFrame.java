package basic;

import java.awt.*;

import javax.swing.*;

/*
 * GUI프로그래밍 방법
 * 	1. 컨테이너클래스 준비(JFrame) 상속
 * 	2. 컨테이너클래스(JFrame) 객체 생성
 * 	3. 컨테이너(JFrame) 객체의 크기 설정
 *  4. 컴포넌트 생성(컨테이너(JFrame)의 멤버필드) 	-> 디자인
 *  5. 컨테이너(JFrame) 에 컴포넌트 붙이기(add)		-> 디자인
 *  6. 컨테이너 객체 보여주기
 */
public class ChildJFrame extends JFrame {
	private JPanel contentPane;
	/*
	 * 컴포넌트를 멤버필드로 선언
	 * (4. 컴포넌트 생성(컨테이너(JFrame)의 멤버필드) 	-> 디자인))
	 */
	private JButton okBtn;
	private JButton cancleBtn;
	
	public ChildJFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("나의 첫번째 프레임");
		this.contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		this.setContentPane(contentPane);
		
		/*
		 * 4. 컴포넌트 생성(컨테이너(JFrame)의 멤버필드) 	-> 디자인
		 */
		okBtn = new JButton("확인");
		cancleBtn = new JButton("취소");
		
		/*
		 * 5. 컨테이너(JFrame) 에 컴포넌트 붙이기(add)		-> 디자인
		 */
		contentPane.setLayout(null); // -> 배치관리하는 애가 기본적으로 있으나, 이 명령으로 없어짐
		okBtn.setBounds(40, 40, 80, 40);
		cancleBtn.setBounds(130, 40, 80, 40);
		
		contentPane.add(okBtn);
		contentPane.add(cancleBtn);
		
		
		
		this.setSize(300, 400);
		
		/*
		 * JFrame객체를 화면에 보여주세요
		 */
		this.setVisible(true);
		/*
		 * Container[JFrame].setVieible(true);
		 * 	- 메인쓰레드가 호출하면 JVM GUI쓰레드를 생성
		 * 	- GUI쓰레드는 무한대기하면서 이벤트와 그래픽처리를 담당
		 * 	- Container[JFrame]는 계속 떠있음(JVM이 종료되지 않음)
		 */
	}
}
