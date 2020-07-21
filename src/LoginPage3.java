import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginPage3 extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	//Connection con;
	//PreparedStatement pst;
	//ResultSet rs;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage3 frame = new LoginPage3();
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
	public LoginPage3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLoginPage = new JLabel("Login Page");
		lblLoginPage.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblLoginPage.setBounds(138, 11, 125, 28);
		contentPane.add(lblLoginPage);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblUsername.setBounds(69, 72, 66, 21);
		contentPane.add(lblUsername);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtUsername.setBounds(194, 66, 150, 33);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblPassword.setBounds(69, 129, 66, 14);
		contentPane.add(lblPassword);
		
		JLabel lblRole = new JLabel("Role:");
		lblRole.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblRole.setBounds(69, 186, 46, 14);
		contentPane.add(lblRole);
		
		JComboBox cbRole = new JComboBox();
		cbRole.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		cbRole.setModel(new DefaultComboBoxModel(new String[] {"Select", "Admin", "Staff"}));
		cbRole.setBounds(194, 177, 150, 33);
		contentPane.add(cbRole);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = txtUsername.getText();
				String password = txtPassword.getText();
				String role = cbRole.getSelectedItem().toString();
				
				if (username.equals("") || password.equals("") || role.equals("Select"))
				{
					JOptionPane.showMessageDialog(rootPane, "Some field are empty", "Error", 1);
				}
				else
				{
					try
					{   
					    //con = Connections.getConnection();
						//pst = con.prepareStatement("select * from login where username=? and password=?");
						//pst.setString(1, username);
						//pst.setString(2, password);
						Class.forName("com.mysql.jdbc.Driver");
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb", "root","");
						Statement st = con.createStatement();
						String sql = "Select * from login where username= '"+username+"' and password= '"+password+"'"; 
						
						ResultSet rs = st.executeQuery(sql);
						
						//rs = pst.executeQuery();
						
						if(rs.next())
						{
							String s1 = rs.getString("role");
							String un = rs.getString("username");
							
							if(role.equalsIgnoreCase("Admin") && s1.equalsIgnoreCase("admin"))
							{
								AdminPage ap = new AdminPage();
								ap.setVisible(true);
								setVisible(false);
							}
								
								if(role.equalsIgnoreCase("Staff") && s1.equalsIgnoreCase("staff"))
								{
									StaffPage sp = new StaffPage();
									sp.setVisible(true);
									setVisible(false);
								}
							} 
						else 
						{
							JOptionPane.showMessageDialog(rootPane, "Username or Password are not matched", "Error", 1);
							con.close();
						}
					}
					catch (Exception ex)
					{
						System.out.println("" +ex);
					}
				}
			}
		});
		btnLogin.setBounds(127, 237, 89, 37);
		contentPane.add(btnLogin);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(0);
			}
		});
		btnCancel.setBounds(255, 237, 89, 37);
		contentPane.add(btnCancel);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtPassword.setBounds(194, 122, 150, 33);
		contentPane.add(txtPassword);
	}
}
