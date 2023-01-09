package com.itwill.shop.ui;

import javax.swing.*;

public class memberJoinPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public memberJoinPanel() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("가입");
		btnNewButton.setBounds(57, 338, 97, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소");
		btnNewButton_1.setBounds(216, 338, 97, 23);
		add(btnNewButton_1);

	}
}
