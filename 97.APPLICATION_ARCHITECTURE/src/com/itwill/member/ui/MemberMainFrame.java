package com.itwill.member.ui;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

import javax.swing.*;
import javax.swing.border.*;

import com.itwill.member.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class MemberMainFrame extends JFrame {
	/***************MemberService 멤버필드 선언*****************/
	private MemberService memberService;
	
	/**********************로그인한 회원************************/
	private Member loginMember = null;
	
	private int selected_Index = 0;
	
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
	private JComboBox infoAgeCB;
	private JCheckBox infoMarriedCK;
	private JMenuItem loginMenuItem;
	private JMenuItem joinMenuItem;
	private JMenuItem logoutMenuItem;
	private JButton updateFormBtn;
	private JButton updateBtn;
	private JTable memberListTB;
	private JButton memberDeleteBtn;
	private JComboBox memberListCB;
	private JList memberListLT;

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
		setBounds(100, 100, 385, 576);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu memberMenu = new JMenu("회원");
		menuBar.add(memberMenu);
		
		loginMenuItem = new JMenuItem("로그인");
		loginMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				memberTabbedPane.setSelectedIndex(1);
			}
		});
		memberMenu.add(loginMenuItem);
		
		joinMenuItem = new JMenuItem("가입");
		joinMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				memberTabbedPane.setSelectedIndex(2);
			}
		});
		memberMenu.add(joinMenuItem);
		
		logoutMenuItem = new JMenuItem("로그아웃");
		logoutMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logoutProcess();
			}
		});
		memberMenu.add(logoutMenuItem);
		
		JSeparator separator = new JSeparator();
		memberMenu.add(separator);
		
		JMenuItem exitMenuItem = new JMenuItem("종료");
		exitMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent E) {
				System.exit(0);
			}
		});
		memberMenu.add(exitMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		memberTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		memberTabbedPane.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int selectedIndex = memberTabbedPane.getSelectedIndex();
				if(selectedIndex == 4) {
					displayMemberList();
				}
			}
		});
		contentPane.add(memberTabbedPane, BorderLayout.CENTER);
		
		JPanel memberMainPanel = new JPanel();
		memberTabbedPane.addTab("회원메인", null, memberMainPanel, null);
		memberMainPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel memberMainLB = new JLabel("");
		memberMainLB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(loginMember == null) {
					memberTabbedPane.setSelectedIndex(1);
				}else {
					memberTabbedPane.setSelectedIndex(3);
				}
			}
		});
		memberMainLB.setHorizontalAlignment(SwingConstants.CENTER);
		memberMainLB.setIcon(new ImageIcon(MemberMainFrame.class.getResource("/images/donut.gif")));
		memberMainPanel.add(memberMainLB, BorderLayout.CENTER);
		
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
						loginIdTF.setText("");
						loginPassTF.setText("");
						
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
		
		infoAgeCB = new JComboBox();
		infoAgeCB.setEnabled(false);
		infoAgeCB.setModel(new DefaultComboBoxModel(new String[] {"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40"}));
		infoAgeCB.setBounds(121, 233, 130, 23);
		memberInfoPanel.add(infoAgeCB);
		
		JLabel lblNewLabel_5_1 = new JLabel("결혼여부");
		lblNewLabel_5_1.setBounds(35, 283, 57, 15);
		memberInfoPanel.add(lblNewLabel_5_1);
		
		infoMarriedCK = new JCheckBox("");
		infoMarriedCK.setEnabled(false);
		infoMarriedCK.setBounds(121, 279, 26, 23);
		memberInfoPanel.add(infoMarriedCK);
		
		updateFormBtn = new JButton("수정폼");
		updateFormBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnText = updateFormBtn.getText();
				if(btnText.equals("수정폼")) {
					updateFormEnable(true);
				}else if(btnText.equals("수정취소")) {
					displayMemberInfo(loginMember);
					updateFormEnable(false);
				}
			}
		});
		updateFormBtn.setBounds(35, 338, 97, 23);
		memberInfoPanel.add(updateFormBtn);
		
		updateBtn = new JButton("수정");
		updateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**********회원수정**********/
				try {
					/*********Textfield로부터 데이타 얻기***********/
					String id = infoIdTF.getText();
					String password = new String(infoPassTF.getPassword());
					String name = infoNameTF.getText();
					String address = infoAddressTF.getText();
					
					String ageStr = (String)infoAgeCB.getSelectedItem();
					int age = Integer.parseInt(ageStr);
					String married = "";
					if(infoMarriedCK.isSelected()) {
						married = "T";
					}else {
						married = "F";
					}
					
					Member member = new Member(id, password, name, address, age, married, null);
					memberService.memberUpdate(member);
					loginMember = memberService.memberDetail(id);
					updateFormEnable(false);
				}catch (Exception e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		updateBtn.setBounds(154, 338, 97, 23);
		memberInfoPanel.add(updateBtn);
		
		JPanel memberAdminPanel = new JPanel();
		memberTabbedPane.addTab("회원관리", null, memberAdminPanel, null);
		memberAdminPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 36, 330, 142);
		memberAdminPanel.add(scrollPane);
		
		memberListTB = new JTable();
		memberListTB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selected_Index = memberListTB.getSelectedRow();
				memberDeleteBtn.setEnabled(true);
				
			}
		});
		memberListTB.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"\uC544\uC774\uB514", "\uD328\uC2A4\uC6CC\uB4DC", "\uC774\uB984", "\uC8FC\uC18C", "\uB098\uC774", "\uACB0\uD63C\uC5EC\uBD80", "\uB4F1\uB85D\uC77C"
			}
		) {
			Class[] columnTypes = new Class[] {
				Long.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(memberListTB);
		
		memberListCB = new JComboBox();
		memberListCB.setModel(new DefaultComboBoxModel(new String[] {"김가나", "김다라", "김마바", "김사아", "김자차", "김카타", "김파하"}));
		memberListCB.setBounds(190, 235, 152, 28);
		memberAdminPanel.add(memberListCB);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 235, 152, 215);
		memberAdminPanel.add(scrollPane_1);
		
		memberListLT = new JList();
		memberListLT.setModel(new AbstractListModel() {
			String[] values = new String[] {"김가나", "김다라", "김마바", "김사아", "김자차", "김카타", "김파하", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane_1.setViewportView(memberListLT);
		
		JButton memberListBtn = new JButton("회원리스트");
		memberListBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayMemberList();
			}
		});		
		memberListBtn.setBounds(49, 188, 103, 23);
		memberAdminPanel.add(memberListBtn);
		
		memberDeleteBtn = new JButton("회원삭제");
		memberDeleteBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					int selectedRow = memberListTB.getSelectedRow();
					if(selected_Index >= 0) {
						String selectedId = (String)memberListTB.getValueAt(selectedRow, 0);
						memberService.memberDelete(selectedId);
						displayMemberList();
					}else {
						memberDeleteBtn.setEnabled(false);
					}
				}catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		memberDeleteBtn.setBounds(205, 188, 103, 23);
		memberAdminPanel.add(memberDeleteBtn);
		
		/**************MemberService 멤버필드객체 생성******************/
		memberService = new MemberService();
		logoutProcess();
	}//생성자 끝
	
	/*******************************************************************/
	private void displayMemberList() {
		try {
			List<Member> memberList = memberService.memberList();
			
			/*************회원리스트보기[JTable]***************/
			
			Vector columnVector = new Vector();
			columnVector.add("아이디");
			columnVector.add("패스워드");
			columnVector.add("이름");
			columnVector.add("주소");
			columnVector.add("나이");
			columnVector.add("결혼여부");
			columnVector.add("등록일");
			
			Vector tableVector = new Vector();
			
			for(Member member : memberList) {
			Vector rowVector = new Vector();
			rowVector.add(member.getM_id());
			rowVector.add(member.getM_password());
			rowVector.add(member.getM_name());
			rowVector.add(member.getM_address());
			rowVector.add(member.getM_age());
			rowVector.add(member.getM_married());
			rowVector.add(member.getM_regdate());
			tableVector.add(rowVector);
			}
			
			DefaultTableModel tableModel = new DefaultTableModel(tableVector, columnVector);
			
			memberListTB.setModel(tableModel);
			memberDeleteBtn.setEnabled(false);
			
			/*************회원리스트보기[JList]***************/
			DefaultListModel listModel = new DefaultListModel();
			for(Member member : memberList) {
				listModel.addElement(member.getM_id());
			}
			memberListLT.setModel(listModel);
			
			/*************회원리스트보기[JCombobox]***************/
			DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
			for(Member member : memberList) {
				comboBoxModel.addElement(member.getM_name() + "[" + member.getM_id() + "]");
			}
			memberListCB.setModel(comboBoxModel);
			
			
		}catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
		
		
		
		
	}
	
	
	/*******************회원 수정폼 활성화, 비활성화********************/
	public void updateFormEnable(boolean b) {
		if(b) {
			//활성화
			//infoIdTF.setEnabled(true);
			//infoPassTF.setEnabled(true);
			infoNameTF.setEnabled(true);
			infoAddressTF.setEnabled(true);
			infoAgeCB.setEnabled(true);
			infoMarriedCK.setEnabled(true);
			
			updateFormBtn.setText("수정취소");
			updateBtn.setEnabled(true);
		}else {
			//비활성화
			infoIdTF.setEnabled(false);
			infoPassTF.setEnabled(false);
			infoNameTF.setEnabled(false);
			infoAddressTF.setEnabled(false);
			infoAgeCB.setEnabled(false);
			infoMarriedCK.setEnabled(false);
			
			updateFormBtn.setText("수정폼");
			updateBtn.setEnabled(false);
		}
	}
	
	/********************로그아웃 시 호출할 메소드*********************/
	private void logoutProcess() {
		/***************로그아웃 시 해야 할 일*****************
		 1. 로그인 성공한 멤버객체를 멤버필드에서 제거
		 2. MemberMainFrame 타이틀 변경
		 3. 로그인, 회원가입 탭 활성화, 회원정보탭 비활성화
		 	로그아웃 메뉴아이템 비활성화
		 	로그인, 회원가입 메뉴아이템 활성화
		 4. 메인 화면 전환
		**********************************************************/
		this.loginMember = null;
		setTitle("회원관리");
		memberTabbedPane.setEnabledAt(1, true);
		memberTabbedPane.setEnabledAt(2, true);
		memberTabbedPane.setEnabledAt(3, false);
		loginMenuItem.setEnabled(true);
		joinMenuItem.setEnabled(true);
		logoutMenuItem.setEnabled(false);
	}
	
	/********************로그인 성공 시 호출할 메소드*********************/
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
		memberTabbedPane.setEnabledAt(1, false);
		memberTabbedPane.setEnabledAt(2, false);
		memberTabbedPane.setEnabledAt(3, true);
		loginMenuItem.setEnabled(false);
		joinMenuItem.setEnabled(false);
		logoutMenuItem.setEnabled(true);
		// 4. 회원정보보기 화면 전환
		memberTabbedPane.setSelectedIndex(3);
		displayMemberInfo(this.loginMember);
		updateFormEnable(false);
	}
		
	private void displayMemberInfo(Member member) {
		/***********회원 상세데이타 보여주기************/
		infoIdTF.setText(loginMember.getM_id());
		infoPassTF.setText(loginMember.getM_password());
		infoNameTF.setText(loginMember.getM_name());
		infoAddressTF.setText(loginMember.getM_address());
		infoAgeCB.setSelectedItem(loginMember.getM_age() + "");
		if(loginMember.getM_married().equals("T")) {
			infoMarriedCK.setSelected(true);			
		}else {
			infoMarriedCK.setSelected(false);
		}
		
	}
}
