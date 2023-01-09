package com.itwill.shop.ui;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShopMainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShopMainFrame frame = new ShopMainFrame();
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
	public ShopMainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 387, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel globalsouthMenuPanel = new JPanel();
		globalsouthMenuPanel.setBackground(new Color(250, 128, 114));
		contentPane.add(globalsouthMenuPanel, BorderLayout.SOUTH);
		
		JButton globalMemberMenu_2 = new JButton("");
		globalMemberMenu_2.setIcon(new ImageIcon("C:\\Users\\itwill\\Desktop\\1추가111.png"));
		globalsouthMenuPanel.add(globalMemberMenu_2);
		
		JButton globalMemberMenu_1 = new JButton("");
		globalMemberMenu_1.setIcon(new ImageIcon("C:\\Users\\itwill\\Desktop\\1제거111.png"));
		globalsouthMenuPanel.add(globalMemberMenu_1);
		
		JButton globalMemberMenu = new JButton("");
		globalMemberMenu.setIcon(new ImageIcon("C:\\Users\\itwill\\Desktop\\1카트1.png"));
		globalsouthMenuPanel.add(globalMemberMenu);
		
		JTabbedPane shopTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(shopTabbedPane, BorderLayout.CENTER);
		
		JTabbedPane productTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		shopTabbedPane.addTab("제품", null, productTabbedPane, null);
		
		PopularProductPanel popularProductPanel = new PopularProductPanel();
		productTabbedPane.addTab("인기제품", null, popularProductPanel, null);
		
		JTabbedPane memberTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		shopTabbedPane.addTab("회원", null, memberTabbedPane, null);
		
		memberJoinPanel memberJoinPanel_ = new memberJoinPanel();
		memberTabbedPane.addTab("New tab", null, memberJoinPanel_, null);
	}

}
