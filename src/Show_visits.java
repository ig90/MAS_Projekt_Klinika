import java.awt.EventQueue;
import java.awt.Window;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;


//umówione wizyty
public class Show_visits {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Show_visits window = new Show_visits();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws FileNotFoundException 
	 */
	public Show_visits() throws FileNotFoundException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws FileNotFoundException 
	 */
	private void initialize() throws FileNotFoundException {
		frame = new JFrame();
		frame.setBounds(100, 100, 480, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);

		//wczytujemy plik i dodajemy do listy
		final Scanner sc2 = new Scanner(new FileReader("wizyta.txt"));
		 
		final DefaultListModel element2 = new DefaultListModel();
		
		while(sc2.hasNextLine()){
			 	final String line=sc2.nextLine();					
				element2.addElement(line + "\n");
				
		 }
		//dodajemy liste do Jlisty i wyswietlamy
		JList list = new JList(element2);
		JScrollPane scroll = new JScrollPane(list);
		scroll.setBounds(10, 50, 452, 183);
		frame.getContentPane().add(scroll);
		
		JButton btnNewButton = new JButton("Wróć");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Menu menu = new Menu();					 
                menu.show().setVisible(true);
                frame.setVisible(false);		
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(176, 238, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblVisits = new JLabel("Umówione wizyty:");
		lblVisits.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblVisits.setBounds(10, 11, 202, 28);
		frame.getContentPane().add(lblVisits);
	}
	public Window show() {
		return frame;
	}
}
