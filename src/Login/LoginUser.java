package Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginUser {

	private JFrame frame;
	private JTextField txtUsername;
	private JTextField txtPassUser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUser window = new LoginUser();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginUser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUser = new JLabel("Login as User");
		lblUser.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUser.setBounds(168, 41, 108, 28);
		frame.getContentPane().add(lblUser);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(75, 87, 89, 29);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPass = new JLabel("Password:");
		lblPass.setBounds(75, 134, 77, 14);
		frame.getContentPane().add(lblPass);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(208, 91, 86, 20);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassUser = new JTextField();
		txtPassUser.setBounds(208, 131, 86, 20);
		frame.getContentPane().add(txtPassUser);
		txtPassUser.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username = txtUsername.getText();
				String password = txtPassUser.getText(); //cmne nk potong dia????
				
				//utk set terus
				if ( username.contains("one") && password.contains("king"))
				{
					txtUsername.setText(null);
					txtPassUser.setText(null);
					
					//for next page, copy paste je page
					//Travelling info = new Travelling(); nanti import
					//Travelling.main(null);
					
					MyFrame info = new MyFrame();
					MyFrame.main(null);
					
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error", JOptionPane.ERROR_MESSAGE);
					txtUsername.setText(null);
					txtPassUser.setText(null);
				}
			}
		});
		btnLogin.setBounds(75, 202, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame("Exit");
					if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Login System", 
							JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
						System.exit(0);
						}
			}
		});
		btnExit.setBounds(314, 202, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtUsername.setText(null);
				txtPassUser.setText(null);
			}
		});
		btnReset.setBounds(193, 202, 89, 23);
		frame.getContentPane().add(btnReset);
	}
}
