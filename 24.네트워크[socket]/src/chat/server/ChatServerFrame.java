package chat.server;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import chat.common.*;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.*;
import java.awt.event.ActionEvent;

public class ChatServerFrame extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTextField noticeTF;
	private JTextArea displayTA;
	/*****접속된 클라이언트 객체를 보관할 서비스 객체*****/
	private ServerClientService clientService;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		ChatServerFrame frame = new ChatServerFrame();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public ChatServerFrame() {
		setTitle("ChatServer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 634, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		displayTA = new JTextArea();
		displayTA.setFont(new Font("나눔고딕코딩", Font.BOLD, 18));
		displayTA.setEditable(false);
		scrollPane.setViewportView(displayTA);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);

		noticeTF = new JTextField();
		noticeTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		panel.add(noticeTF);
		noticeTF.setColumns(45);

		JButton noticeB = new JButton("\uACF5\uC9C0");
		noticeB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(noticeB);
		
		/***********ServerClientThread 객체 생성***********/
		clientService = new ServerClientService();
		
		/****** ChatServerThread start ******/
		new ChatServerThread().start();
		

	}

	private void setLog(String log) {
		displayTA.append(log + "\n");
		int maxSize = scrollPane.getVerticalScrollBar().getMaximum();
		scrollPane.getVerticalScrollBar().setValue(maxSize);
	}

	/***********************************************
	 * 특정포트를 열고 클라이언트의 소켓연결요청을 처리해서 소켓을 생성하는 클래스
	 ***********************************************/
	public class ChatServerThread extends Thread {
		@Override
		public void run() {
			try {
				ServerSocket serverSocket = new ServerSocket(8888);
				setLog("0.ChatServerThread:8888번 포트에 ServerSocket 생성");
				while(true) {
					setLog("1.ChatServerThread:클라이언트 소켓 연결요청대기");
					Socket socket = serverSocket.accept();
					setLog("2.ChatServerThread:접속 클라이언트" + socket);
					
					ServerClientThread client = new ServerClientThread(socket);
					client.start();
					clientService.addClient(client);
					setLog("3.ChatServerThread:clientService 객체에 ServerClientThread 객체 추가 쓰레드 start");
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/********************************************
	 * 한명의 클라이언트와 통신을 담당하는 클래스(VO = Value Object) 
	 * - 클라이언트와 연결된 소켓1개를 가지고 있는 클래스 
	 * - 클라이언트의 정보를 가지고 있는 클래스
	 * - 클라이언트 당 1개의 객체가 생성
	 ********************************************/
	public class ServerClientThread extends Thread {
		private String id; // 접속 클라이언트 아이디
		private Socket socket; // 서버쪽 소켓
		private PrintWriter out;
		private BufferedReader in;

		public ServerClientThread(Socket socket) throws Exception {
			this.socket = socket;
			this.id =socket.getInetAddress().getHostAddress() + "[" + socket.getPort() + "]";
			this.in = new BufferedReader(
						new InputStreamReader(
							socket.getInputStream(), "UTF-8"));
			this.out = new PrintWriter(
						new OutputStreamWriter(
							socket.getOutputStream(), "UTF-8"));
		}

		public String getUserId() {
			return id;
		}
		
		public void send(String msg) {
			out.println(msg);
			out.flush();
		}
		
		
		@Override
		public void run() {
			try {
				
				while(true) {
					//System.out.println("가.ServerClientThread " + id + "로부터 데이타를 읽기 위해 쓰레드 대기");
					setLog("가.ServerClientThread " + id + "로부터 데이타를 읽기 위해 쓰레드 대기");
					String readStr = in.readLine();
					//System.out.println("나.ServerClientThread : " + id + "로부터 읽은 데이타 : " + readStr);
					setLog("나.ServerClientThread : " + id + "로부터 읽은 데이타 : " + readStr);
					clientService.sendBroadcasting(ChatProtocol.PLAIN_MSG + "#" + readStr);
					//System.out.println("다.ServerClientThread : 연결된 모든 클라이언트에 읽은 데이타 전송");
					setLog("다.ServerClientThread : 연결된 모든 클라이언트에 읽은 데이타 전송");
					
				}
				
			}catch (Exception e) {
				//e.printStackTrace();
				try {
					clientService.removeClient(this);
				} catch (Exception e1) {
					//e1.printStackTrace();
					System.out.println(e1.getMessage());
				}
			}
		}
		
		
	}
	/************************************
	 * 서버에 연결된 클라이언트 객체(Service)를 관리할 클래스 
	 * - 클라이언트객체 추가 
	 * - 클라이언트객체 찾기 
	 * - 클라이언트객체 삭제 
	 * - 모든 클라이언트 객체에 데이타 전송
	 ************************************/
	public class ServerClientService {
		/*
		 * 클라이언트 객체 보관 리스트
		 */
		private List<ServerClientThread> clientList = new ArrayList<ServerClientThread>();
		/*********클라이언트 아이디 리스트 생성***********/
		private String makeClientList() {
			String clientListStr = "";
			for (ServerClientThread serverClientThread : this.clientList) {
				clientListStr += serverClientThread.getUserId() + "%";
			}
			clientListStr.substring(0, clientListStr.length()-1);
			return clientListStr;
		}
		
		/*
		 * 클라이언트 객체 추가
		 */
		public void addClient(ServerClientThread newClient) throws Exception {
			clientList.add(newClient);
			sendBroadcasting(ChatProtocol.PLAIN_MSG + "#" + newClient.getUserId() + "님 입장");
			sendBroadcasting(ChatProtocol.LIST_MSG + "#" + makeClientList());
			setLog("A. ServerClientService : " + newClient.getUserId() + "님 입장");
			setLog("B. ServerClientService : 현재 접속자 수 " + clientList.size() + "명");
		}

		/*
		 * 클라이언트 객체 삭제
		 */
		public void removeClient(ServerClientThread removeClient) throws Exception {
			clientList.remove(removeClient);
			sendBroadcasting(ChatProtocol.PLAIN_MSG + "#" + removeClient.getUserId() + "님 퇴장");
			sendBroadcasting(ChatProtocol.LIST_MSG + "#" + makeClientList());
			setLog("A. ServerClientService : " + removeClient.getUserId() + "님 퇴장");
			setLog("B. ServerClientService : 현재 접속자 수 " + clientList.size() + "명");
		}

		/*
		 *모든 클라이언트에 메세지 전송
		 */
		public void sendBroadcasting(String msg) throws Exception {
			for (ServerClientThread serverClientThread : clientList) {
				serverClientThread.send(msg);
			}
		}
	}
}
