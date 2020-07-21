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
import javax.swing.JTable;

public class LoginAdmin {

	private JFrame frame;
	private JTextField txtUsernameA;
	private JTextField txtPassAdmin;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginAdmin window = new LoginAdmin();
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
	public LoginAdmin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 441);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAdmin = new JLabel("Login as Admin");
		lblAdmin.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAdmin.setBounds(148, 39, 125, 28);
		frame.getContentPane().add(lblAdmin);
		
		JLabel lblUsernameA = new JLabel("Username:");
		lblUsernameA.setBounds(56, 107, 70, 14);
		frame.getContentPane().add(lblUsernameA);
		
		JLabel lblPassA = new JLabel("Password:");
		lblPassA.setBounds(56, 143, 70, 14);
		frame.getContentPane().add(lblPassA);
		
		txtUsernameA = new JTextField();
		txtUsernameA.setBounds(164, 104, 86, 20);
		frame.getContentPane().add(txtUsernameA);
		txtUsernameA.setColumns(10);
		
		txtPassAdmin = new JTextField();
		txtPassAdmin.setBounds(164, 140, 86, 20);
		frame.getContentPane().add(txtPassAdmin);
		txtPassAdmin.setColumns(10);
		
		JButton btnLogin1 = new JButton("Login");
		btnLogin1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String username = txtUsernameA.getText();
				String password = txtPassAdmin.getText();
				
				if (username.contains("admin") && password.contains("admin"))
				{
					txtUsernameA.setText(null);
					txtPassAdmin.setText(null);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error", JOptionPane.ERROR_MESSAGE);
					txtUsernameA.setText(null);
					txtPassAdmin.setText(null);
				}
		}
		});
		btnLogin1.setBounds(38, 199, 89, 23);
		frame.getContentPane().add(btnLogin1);
		
		JButton btnReset2 = new JButton("Reset");
		btnReset2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtUsernameA.setText(null);
				txtPassAdmin.setText(null);
				
			}
		});
		btnReset2.setBounds(161, 199, 89, 23);
		frame.getContentPane().add(btnReset2);
		
		JButton btnExit1 = new JButton("Exit");
		btnExit1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame("Exit");
					if(JOptionPane.showConfirmDialog(frame, "Corfirm if you want to exit", "Login System",
							JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
							System.exit(0);
					}
			}
		});
		btnExit1.setBounds(293, 199, 89, 23);
		frame.getContentPane().add(btnExit1);
		
		table = new JTable();
		table.setBounds(91, 296, 35, -23);
		frame.getContentPane().add(table);
	}
}
