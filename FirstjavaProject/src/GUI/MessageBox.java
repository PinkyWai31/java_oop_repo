package GUI;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MessageBox {

	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner (System.in);
		System.out.print("Enter username");
		String username = sc.nextLine();
		System.out.print("Enter password");
		String pw = sc.next();*/
		
		String username = "Admin";
		String pw = "123!@#";
		
		if (username.equals("Admin")&& pw.equals("123!@#"))
			JOptionPane.showMessageDialog(null, "Login Successfully");
		
		else {
			JOptionPane.showMessageDialog(null, "Invalid Login", "Login Error", JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null, "Invalid Login", "Login Error", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Invalid Login", "Login Error", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "Invalid Login", "Login Error", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Invalid Login");
		}
		
		int option = JOptionPane.showConfirmDialog(null, "Do another yes/no?");
		if (option ==0)
			JOptionPane.showConfirmDialog(null, "DO you want to remove item?", "Delete title", JOptionPane.OK_CANCEL_OPTION);
		else if (option == 1)
			JOptionPane.showConfirmDialog(null, "NO");
		else if (option == 2)
			JOptionPane.showConfirmDialog(null, "CANCEL");
		
		int yes = JOptionPane.YES_OPTION;
		int no = JOptionPane.NO_OPTION;
		int cancel = JOptionPane.CANCEL_OPTION;
		JOptionPane.showConfirmDialog(null, yes + "" + no + "" + cancel);
		
		String name = JOptionPane.showInputDialog(null,"Enter your name");
		String age = JOptionPane.showInputDialog(null, "Enter your age", "Age title",JOptionPane.INFORMATION_MESSAGE);
		
		if (name.equals("Admin") && age.equals( "34"))
			JOptionPane.showMessageDialog(null, "Login successfully");
	}
	
	
	


}
