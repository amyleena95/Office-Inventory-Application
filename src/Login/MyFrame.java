package Login;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class MyFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel lblUsername = new JLabel("Username:");
	private JTextField tfUsername;
	private JTextField tfPassword;
	private JButton btnLogin;
	private JButton btnReset;
	private final ButtonGroup btnGrp = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame frame = new MyFrame();
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
	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(24, 29, 98, 31);
		contentPane.add(lblUsername);
		
		tfUsername = new JTextField();
		tfUsername.setBounds(99, 34, 114, 20);
		contentPane.add(tfUsername);
		tfUsername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(24, 73, 61, 16);
		contentPane.add(lblPassword);
		
		tfPassword = new JTextField();
		tfPassword.setBounds(99, 73, 114, 20);
		contentPane.add(tfPassword);
		tfPassword.setColumns(10);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//declare variable
				String username = tfUsername.getText();
				String password = tfPassword.getText();
				
				System.out.println("Username: " + username);
				System.out.println("Password: " + password);
			}
		});
		btnLogin.setBounds(41, 128, 98, 26);
		contentPane.add(btnLogin);
		
		btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//declare reset button
				tfUsername.setText("");
				tfPassword.setText("");
				

			}
		});
		btnReset.setBounds(169, 128, 98, 26);
		contentPane.add(btnReset);
		
		JPanel pnllatas = new JPanel();
		pnllatas.setBorder(new TitledBorder(null, "User's Login", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnllatas.setBounds(12, 12, 294, 169);
		contentPane.add(pnllatas);
		
		JRadioButton rbJava = new JRadioButton("Java");
		btnGrp.add(rbJava);
		rbJava.setBounds(28, 199, 52, 24);
		contentPane.add(rbJava);
		
		JRadioButton rbCpp = new JRadioButton("C++");
		btnGrp.add(rbCpp);
		rbCpp.setBounds(92, 199, 61, 24);
		contentPane.add(rbCpp);
		
		JRadioButton rbPython = new JRadioButton("Python");
		btnGrp.add(rbPython);
		rbPython.setBounds(162, 199, 75, 24);
		contentPane.add(rbPython);
		
		JButton btnShowSelection = new JButton("Show Selection");
		btnShowSelection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rbJava.isSelected()){
					System.out.println("Java is selected");
				}
				else if(rbCpp.isSelected()){
					System.out.println("C++ is selected");
				}
				else if (rbPython.isSelected()){
					System.out.println("Python is selected");
				}
			}
		});
		btnShowSelection.setBounds(55, 231, 136, 26);
		contentPane.add(btnShowSelection);
	}
}
