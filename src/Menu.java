import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;

public class Menu {
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Menu główne");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 600, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);	
		
		JButton btnNewButton = new JButton("Rejestruj klienta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//stworzenie nowego okna, pokazanie go, zamkniecie poprzedniego
				Registration_GUI registration = null;
				try {
					registration = new Registration_GUI();
				} catch (FileNotFoundException e) {
					 
					e.printStackTrace();
				}			 
				registration.show().setVisible(true);
				    
			}
		});
		btnNewButton.setBounds(10, 10, 200, 30);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Rejestruj wizytę");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//stworzenie nowego okna, pokazanie go, zamkniecie poprzedniego
				Register_visit register = null;
				try {
					register = new Register_visit();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}					 
                register.show().setVisible(true);
                frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(10, 50, 200, 30);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Pokaż zespoły lekarzy");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				DoctorsTeamGUI rejestruj = new DoctorsTeamGUI();			 					 
                rejestruj.show().setVisible(true);
                frame.setVisible(false);		
				
			}
		});
		btnNewButton_2.setBounds(10, 90, 200, 30);
		frame.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Generuj raport");
		btnNewButton_3.setBounds(10, 130, 200, 30);
		frame.getContentPane().add(btnNewButton_3);
		btnNewButton_3.setEnabled(false);
		
		JButton btnNewButton_4 = new JButton("Wyświetl wizyty");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//stworzenie nowego okna, pokazanie go, zamkniecie poprzedniego
				Show_visits menu = null;
				try {
					menu = new Show_visits();
				} catch (FileNotFoundException e) {		 
					e.printStackTrace();
				}					 
                menu.show().setVisible(true);
                frame.setVisible(false);				
			}
		});
		btnNewButton_4.setBounds(10, 170, 200, 30);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Przeglądaj dane");
		btnNewButton_5.setBounds(10, 210, 200, 30);
		frame.getContentPane().add(btnNewButton_5);
		btnNewButton_5.setEnabled(false);
				
		JButton btnNewButton_6 = new JButton("Przydziel salę");
		btnNewButton_6.setBounds(10, 250, 200, 30);
		frame.getContentPane().add(btnNewButton_6);
		btnNewButton_6.setEnabled(false);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("logo.jpg"));
		label.setBounds(323, 50, 267, 244);
		frame.getContentPane().add(label);
			
	}
	public Window show() { 
		return frame;
	}
}
