package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		
		frame.setSize(new Dimension(500,350));
		frame.setLocation(new Point(200,100));
		frame.setTitle("Window Page");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("GridLayout Page");
		
		frame.setIconImage(new ImageIcon("src/img.png").getImage());	
		
		frame.setLayout(new GridLayout());
		
		JButton btnlogin = new JButton();
		btnlogin.setText("Login Button");
		btnlogin.setBackground(Color.white);
		frame.add(btnlogin);
		
		JButton btncancel = new JButton();
		btncancel.setText("Cancel");
		btncancel.setBackground(Color.pink);
		frame.add(btncancel);
		
		JLabel lbl= new JLabel();
		lbl.setText("Hello Word");
		lbl.setForeground(Color.black);
		frame.add(lbl);
		
		JButton btnOK = new JButton();
		btnOK.setText("OK");
		btnOK.setBackground(Color.pink);
		frame.add(btnOK);
		
		

	}

}
