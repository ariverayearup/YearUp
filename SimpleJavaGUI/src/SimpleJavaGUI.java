import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class SimpleJavaGUI {

	private JFrame frame;
	private JTextField nameTextField;
	private JLabel ageLabel;
	private JTextField ageTextField;
	private JLabel StudentLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleJavaGUI window = new SimpleJavaGUI();
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
	public SimpleJavaGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel nameLabel = new JLabel("My Name is:");
		nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nameLabel.setBounds(10, 45, 94, 48);
		panel.add(nameLabel);
		
		nameTextField = new JTextField();
		nameTextField.setFont(new Font("Tahoma", Font.BOLD, 14));
		nameTextField.setBounds(101, 46, 284, 48);
		panel.add(nameTextField);
		nameTextField.setColumns(10);
		
		ageLabel = new JLabel("I am: ");
		ageLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ageLabel.setBounds(47, 119, 44, 36);
		panel.add(ageLabel);
		
		ageTextField = new JTextField();
		ageTextField.setBounds(101, 104, 284, 53);
		panel.add(ageTextField);
		ageTextField.setColumns(10);
		
		StudentLabel = new JLabel("I am a student at Year Up");
		StudentLabel.setBounds(156, 168, 194, 36);
		panel.add(StudentLabel);
		
		JButton WhoButton = new JButton("Who are you?");
		WhoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (WhoButton.getText().equals("Who are you?"))
				{
					nameTextField.setText("Abraham Rivera");
					ageTextField.setText("20");
					WhoButton.setText("Clear me!");
				}
				else if (WhoButton.getText().equals("Clear me!"))
				{
					nameTextField.setText("");
					ageTextField.setText("");
					WhoButton.setText("Who are you?");
				}
			}
			
		});
		WhoButton.setBounds(156, 215, 138, 23);
		panel.add(WhoButton);
	}
}
