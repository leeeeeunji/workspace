package layout;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GridLayoutJFrame extends JFrame {

	private JPanel contentPane;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton bplus;
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JButton bminus;
	private JButton b7;
	private JButton b8;
	private JButton b9;
	private JButton bmul;
	private JButton b0;
	private JButton bac;
	private JButton bdivide;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GridLayoutJFrame frame = new GridLayoutJFrame();
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
	public GridLayoutJFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 337, 474);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(73, 156, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 4, 3, 3));
		
		b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("1");
			}
		});
		contentPane.add(b1);
		
		b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("2");
			}
		});
		contentPane.add(b2);
		
		b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("3");
			}
		});
		contentPane.add(b3);
		
		bplus = new JButton("+");
		bplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("+");
			}
		});
		contentPane.add(bplus);
		
		b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("4");
			}
		});
		contentPane.add(b4);
		
		b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("5");
			}
		});
		contentPane.add(b5);
		
		b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("6");
			}
		});
		contentPane.add(b6);
		
		bminus = new JButton("-");
		bminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("-");
			}
		});
		contentPane.add(bminus);
		
		b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("7");
			}
		});
		contentPane.add(b7);
		
		b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("8");
			}
		});
		contentPane.add(b8);
		
		b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("9");
			}
		});
		contentPane.add(b9);
		
		bmul = new JButton("*");
		bmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("*");
			}
		});
		contentPane.add(bmul);
		
		b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("0");
			}
		});
		contentPane.add(b0);
		
		JButton bresult = new JButton("=");
		bresult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("=");
			}
		});
		contentPane.add(bresult);
		
		bac = new JButton("AC");
		bac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("AC");
			}
		});
		contentPane.add(bac);
		
		bdivide = new JButton("/");
		bdivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("/");
			}
		});
		contentPane.add(bdivide);
	}

}
