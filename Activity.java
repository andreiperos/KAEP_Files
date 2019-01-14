import java.awt.*;
import javax.swing.*;

public class Activity{
	public static void main(String args[]){
		// object creation

		JPanel panel = new JPanel(new BorderLayout());

		JFrame frame = new JFrame("Activity");
		JLabel label = new JLabel("");

		JTextField userName = new JTextField("");
		JLabel l1 = new JLabel ("Username: ");
		
		JPasswordField pass = new JPasswordField("");
		JLabel l2 = new JLabel ("Password: ");
		
		JButton button = new JButton("Login");

		//username
		l1.setBounds(50, 50, 80, 30);
		l1.setForeground(Color.gray);
		userName.setBounds(130, 50, 100, 30);


		//password
		l2.setBounds(50, 100, 80, 30);
		l2.setForeground(Color.gray);
		pass.setBounds(130, 100, 100, 30);

		// button resizing
		button.setBounds(85, 150, 100, 25);
		button.setForeground(Color.gray);
		
		//panel
		panel.setBackground(Color.pink);
		//button function #1
		frame.getContentPane().add(button);
		frame.getContentPane().add(userName);
		frame.getContentPane().add(pass);
		frame.getContentPane().add(l2);
		frame.getContentPane().add(l1);
		frame.getContentPane().add(label);
		frame.getContentPane().add(panel);

		//setting frame
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		System.out.println("GUI Running...");
	}
}