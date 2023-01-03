package com.itwill.member.ui;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;

import com.itwill.member.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberMainFrame extends JFrame {
	/***************MemberService 멤버필드 선언*****************/
	private MemberService memberService;
	
	/**********************로그인한 회원************************/
	private Member loginMember = null;
	
	private JPanel contentPane;
	private JTextField idTF;
	private JTextField nameTF;
	private JTextField addressTF;
	private JPasswordField passTF;
	private JComboBox ageCB;
	private JCheckBox marriedCK;
	private JLabel idMsgLB;
	private JTextField loginIdTF;
	private JPasswordField loginPassTF;
	private JTextField infoIdTF;
	private JPasswordField infoPassTF;
	private JTextField infoNameTF;
	private JTextField infoAddressTF;
	private JTabbedPane memberTabbedPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberMainFrame frame = new MemberMainFrame();
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
	public MemberMainFrame() throws Exception {
		setTitle("회원관리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 318, 503);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu memberMenu = new JMenu("회원");
		menuBar.add(memberMenu);
		
		JMenuItem loginMenuItem = new JMenuItem("로그인");
		memberMenu.add(loginMenuItem);
		
		JMenuItem joinMenuItem = new JMenuItem("가입");
		memberMenu.add(joinMenuItem);
		
		JMenuItem logoutMenuItem = new JMenuItem("로그아웃");
		memberMenu.add(logoutMenuItem);
		
		JSeparator separator = new JSeparator();
		memberMenu.add(separator);
		
		JMenuItem exitMenuItem = new JMenuItem("종료");
		memberMenu.add(exitMenuItem);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar.add(menuBar_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		memberTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(memberTabbedPane, BorderLayout.CENTER);
		
		JPanel memberLoginPanel = new JPanel();
		memberLoginPanel.setBackground(new Color(255, 182, 193));
		memberTabbedPane.addTab("회원 로그인", null, memberLoginPanel, null);
		memberLoginPanel.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("아이디");
		lblNewLabel_6.setBounds(45, 104, 57, 15);
		memberLoginPanel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("패스워드");
		lblNewLabel_7.setBounds(45, 168, 57, 15);
		memberLoginPanel.add(lblNewLabel_7);
		
		loginIdTF = new JTextField();
		loginIdTF.setBounds(132, 101, 116, 21);
		memberLoginPanel.add(loginIdTF);
		loginIdTF.setColumns(10);
		
		loginPassTF = new JPasswordField();
		loginPassTF.setBounds(132, 165, 116, 21);
		memberLoginPanel.add(loginPassTF);
		
		JButton loginBtn = new JButton("로그인");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/************회원 로그인**************/
				try {
					String id = loginIdTF.getText();
					String pass = new String(loginPassTF.getPassword());
					
					int result = memberService.login(id, pass);
					if(result == 0) { 
						//로그인 성공
						loginProcess(id);
						
					}else {
						JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호가 올바르지 않습니다.");
						loginIdTF.setSelectionStart(0);
						loginIdTF.setSelectionEnd(id.length());
						loginIdTF.requestFocus();
					}
				}catch (Exception e1){
					
				}	
			}
		});
		loginBtn.setBounds(45, 244, 97, 23);
		memberLoginPanel.add(loginBtn);
		
		JButton cancleBtn = new JButton("회원가입");
		cancleBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				memberTabbedPane.setSelectedIndex(1);
			}
		});
		cancleBtn.setBounds(151, 244, 97, 23);
		memberLoginPanel.add(cancleBtn);
		
		JPanel memberjoinpanel = new JPanel();
		memberjoinpanel.setBackground(new Color(95, 158, 160));
		memberTabbedPane.addTab("회원가입", null, memberjoinpanel, null);
		memberjoinpanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(41, 77, 57, 15);
		memberjoinpanel.add(lblNewLabel);
		
		idTF = new JTextField();
		idTF.setBounds(127, 74, 130, 21);
		memberjoinpanel.add(idTF);
		idTF.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("패스워드");
		lblNewLabel_1.setBounds(41, 117, 57, 15);
		memberjoinpanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setBounds(41, 164, 57, 15);
		memberjoinpanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("주소");
		lblNewLabel_3.setBounds(41, 211, 57, 15);
		memberjoinpanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("나이");
		lblNewLabel_4.setBounds(41, 257, 57, 15);
		memberjoinpanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("결혼여부");
		lblNewLabel_5.setBounds(41, 303, 57, 15);
		memberjoinpanel.add(lblNewLabel_5);
		
		nameTF = new JTextField();
		nameTF.setBounds(127, 161, 130, 21);
		memberjoinpanel.add(nameTF);
		nameTF.setColumns(10);
		
		addressTF = new JTextField();
		addressTF.setBounds(127, 208, 130, 21);
		memberjoinpanel.add(addressTF);
		addressTF.setColumns(10);
		
		passTF = new JPasswordField();
		passTF.setBounds(127, 114, 130, 21);
		memberjoinpanel.add(passTF);
		
		ageCB = new JComboBox();
		ageCB.setModel(new DefaultComboBoxModel(new String[] {"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40"}));
		ageCB.setBounds(127, 253, 130, 23);
		memberjoinpanel.add(ageCB);
		
		marriedCK = new JCheckBox("");
		marriedCK.setBounds(127, 299, 26, 23);
		memberjoinpanel.add(marriedCK);
		
		JButton mamberJoinBtn = new JButton("가입");
		mamberJoinBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*********회원가입**********/
				try {
					/*********Textfield로부터 데이타 얻기***********/
					String id = idTF.getText();
					String password = new String(passTF.getPassword());
					String name = nameTF.getText();
					String address = addressTF.getText();
					/*********유효성 체크***********/
					if(id.equals("")) {
						idMsgLB.setText("아이디를 입력하세요.");
						idTF.requestFocus();
						return;
					}
					String ageStr = (String)ageCB.getSelectedItem();
					int age = Integer.parseInt(ageStr);
					
					String married = "";
					if(marriedCK.isSelected()) {
						married = "T";
					}else {
						married = "F";
					}
					
					
					Member newMember = new Member(id, password, name, address, age, married, null);
					boolean isAdd = memberService.addMember(newMember);
					if(isAdd) {
						//로그인화면전환
						memberTabbedPane.setSelectedIndex(1);
					}else {
						JOptionPane.showMessageDialog(null, "이미 사용 중인 아이디입니다.");
						idTF.requestFocus();
						idTF.setSelectionStart(0);
						idTF.setSelectionEnd(id.length());
					}
				}catch (Exception e1) {
					System.out.println("회원가입 -> " + e1.getMessage());
				}
			}
		});
		mamberJoinBtn.setBounds(41, 359, 97, 23);
		memberjoinpanel.add(mamberJoinBtn);
		
		JButton memberCancleBtn = new JButton("취소");
		memberCancleBtn.setBounds(160, 359, 97, 23);
		memberjoinpanel.add(memberCancleBtn);
		
		idMsgLB = new JLabel("");
		idMsgLB.setForeground(new Color(255, 0, 0));
		idMsgLB.setBounds(127, 99, 130, 15);
		memberjoinpanel.add(idMsgLB);
		
		JPanel memberInfoPanel = new JPanel();
		memberInfoPanel.setBackground(new Color(255, 228, 225));
		memberTabbedPane.addTab("회원정보", null, memberInfoPanel, null);
		memberInfoPanel.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("아이디");
		lblNewLabel_8.setBounds(35, 57, 57, 15);
		memberInfoPanel.add(lblNewLabel_8);
		
		infoIdTF = new JTextField();
		infoIdTF.setEnabled(false);
		infoIdTF.setColumns(10);
		infoIdTF.setBounds(121, 54, 130, 21);
		memberInfoPanel.add(infoIdTF);
		
		JLabel lblNewLabel_1_1 = new JLabel("패스워드");
		lblNewLabel_1_1.setBounds(35, 97, 57, 15);
		memberInfoPanel.add(lblNewLabel_1_1);
		
		infoPassTF = new JPasswordField();
		infoPassTF.setEditable(false);
		infoPassTF.setBounds(121, 94, 130, 21);
		memberInfoPanel.add(infoPassTF);
		
		JLabel lblNewLabel_2_1 = new JLabel("이름");
		lblNewLabel_2_1.setBounds(35, 144, 57, 15);
		memberInfoPanel.add(lblNewLabel_2_1);
		
		infoNameTF = new JTextField();
		infoNameTF.setEditable(false);
		infoNameTF.setColumns(10);
		infoNameTF.setBounds(121, 141, 130, 21);
		memberInfoPanel.add(infoNameTF);
		
		JLabel lblNewLabel_3_1 = new JLabel("주소");
		lblNewLabel_3_1.setBounds(35, 191, 57, 15);
		memberInfoPanel.add(lblNewLabel_3_1);
		
		infoAddressTF = new JTextField();
		infoAddressTF.setEditable(false);
		infoAddressTF.setColumns(10);
		infoAddressTF.setBounds(121, 188, 130, 21);
		memberInfoPanel.add(infoAddressTF);
		
		JLabel lblNewLabel_4_1 = new JLabel("나이");
		lblNewLabel_4_1.setBounds(35, 237, 57, 15);
		memberInfoPanel.add(lblNewLabel_4_1);
		
		JComboBox infoAgeCB = new JComboBox();
		infoAgeCB.setBounds(121, 233, 130, 23);
		memberInfoPanel.add(infoAgeCB);
		
		JLabel lblNewLabel_5_1 = new JLabel("결혼여부");
		lblNewLabel_5_1.setBounds(35, 283, 57, 15);
		memberInfoPanel.add(lblNewLabel_5_1);
		
		JCheckBox infoMarriedCK = new JCheckBox("");
		infoMarriedCK.setBounds(121, 279, 26, 23);
		memberInfoPanel.add(infoMarriedCK);
		
		/**************MemberService 멤버필드객체 생성******************/
		memberService = new MemberService();
	}//생성자 끝
	
	private void loginProcess(String id) throws Exception {
		/***************로그인 성공 시 해야 할 일*****************
		 1. 로그인 성공한 멤버객체를 멤버필드에 저장
		 2. MemberMainFrame 타이틀 변경
		 3. 로그인, 회원가입 탭 비활성화
		 4. 회원정보보기 화면 전환
		**********************************************************/
		//1. 로그인 성공한 멤버객체를 멤버필드에 저장
		this.loginMember = memberService.memberDetail(id);
		
		//2. MemberMainFrame 타이틀 변경
		setTitle(id + "님 로그인");
		
		//3. 로그인, 회원가입 탭 비활성화
		memberTabbedPane.setEnabledAt(0, false);
		memberTabbedPane.setEnabledAt(1, false);
		// 4. 회원정보보기 화면 전환
		memberTabbedPane.setSelectedIndex(2);
		
		/***********회원 상세데이타 보여주기************/
		infoIdTF.setText(loginMember.getM_id());
		infoPassTF.setText(loginMember.getM_password());
		infoNameTF.setText(loginMember.getM_name());
		infoAddressTF.setText(loginMember.getM_address());
		
	}
}
