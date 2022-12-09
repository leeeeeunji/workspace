package event;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

public class ChatingJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField chatTF;
	private JButton sendBtn;
	private TextArea chatTA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatingJFrame frame = new ChatingJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChatingJFrame() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("window Closing");
				
				/*
				 * exit : Terminates the currently running Java Virtual Machine. 
				 */
				System.exit(0);
			}
		});
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 338, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 223, 239));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\2022-11-JAVA-DEVELOPER\\workspace\\20.입출력[ID]\\sample\\subsample2\\w.png"));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 128, 192));
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		chatTF = new JTextField();
		chatTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("TextField enter key~~");
				/*
				 * frame의 TextField와 TextArea에 접근해야 함
				 */
				String chatStr = chatTF.getText(); // = ChatingJFrame.this.getText();
				chatTF.setText("");
				chatTA.append(chatStr + "\n");
				chatTF.requestFocus();
			}
		});
		panel_1.add(chatTF);
		chatTF.setColumns(20);
		
		sendBtn = new JButton("전송");
		panel_1.add(sendBtn);
		
		chatTA = new TextArea();
		chatTA.setEditable(false);
		chatTA.setText("안녕\r\nHi~\n");
		contentPane.add(chatTA, BorderLayout.CENTER);
		
		/*
		 * 이벤트쏘스에 이벤트핸들러객체 등록
		 */
		ChatSendActionEventHandler handler = new ChatSendActionEventHandler();
		sendBtn.addActionListener(handler);
		
	}//생성자
	/**************************Inner class****************************/
	
	public class ChatSendActionEventHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("send button click~~");
			/*
			 * frame의 TextField와 TextArea에 접근해야 함
			 */
			String chatStr = chatTF.getText(); // = ChatingJFrame.this.getText();
			chatTF.setText("");
			chatTA.append(chatStr + "\n");
			chatTF.requestFocus();
		}
	}

}
