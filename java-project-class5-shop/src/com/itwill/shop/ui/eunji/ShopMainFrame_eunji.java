package com.itwill.shop.ui.eunji;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;

public class ShopMainFrame_eunji extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShopMainFrame_eunji frame = new ShopMainFrame_eunji();
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
	public ShopMainFrame_eunji() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 380, 557);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		ProductListPanel productListPanel = new ProductListPanel();
		contentPane.add(productListPanel, BorderLayout.CENTER);
	}

}
