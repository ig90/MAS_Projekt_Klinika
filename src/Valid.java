import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Valid {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Valid window = new Valid();
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
	public Valid() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 250, 250, 125);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		 
		
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		JLabel lblClientAdded = new JLabel("Dodano klienta");
		lblClientAdded.setVerticalAlignment(SwingConstants.TOP);
		lblClientAdded.setHorizontalAlignment(SwingConstants.CENTER);
		lblClientAdded.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblClientAdded.setBounds(0, 10, 234, 45);
		frame.getContentPane().add(lblClientAdded);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
 
				Menu register = new Menu();			 					 
                register.show().setVisible(true);
                frame.setVisible(false);
			}
		});
		btnOk.setBounds(69, 53, 90, 23);
		frame.getContentPane().add(btnOk);
	}

	public Component getFrame() {
		return frame;
	}
}
