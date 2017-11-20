import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import java.awt.Color;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import com.github.lgooddatepicker.components.DateTimePicker;


public class Register_visit {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register_visit window = new Register_visit();
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
	public Register_visit() throws FileNotFoundException {
		try {
			initialize();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	@SuppressWarnings("unchecked")
	private void initialize() throws IOException {
		frame = new JFrame("Rejestruj wizytę");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 378, 262);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		
		
		//zabiegi
		Treatment z1 = new Treatment("Korekta kształtu nosa");
		Treatment z2 = new Treatment("Powiększanie ust");
		Treatment z3 = new Treatment("Usuwanie zmarszczek");
		Treatment z4 = new Treatment("Leczenie trądziku");
		Treatment z5 = new Treatment("Usuwanie tkanki tłuszczowej");
		Treatment z6 = new Treatment("Leczenie blizn");
		Treatment z7 = new Treatment("Trwała depilacja");
		Treatment z8 = new Treatment("Plastyka powiek");
		
		String[] typesOfTreatments = {z1.getName(),z2.getName(),z3.getName(),z4.getName(), z5.getName(), z6.getName(),
									z7.getName(), z8.getName()};

		Patient p1 = new Patient("Anna", "Krawczyk", "1990", "adres", "323321123");
		Patient p2 = new Patient("Karolina", "Kowalczyk", "1995", "adres", "678543456");
		Patient p3 = new Patient("Rafał", "Jankowski", "1967", "adres", "987657321");
				
		/*
		//odczytujemy klientów z pliku
		BufferedReader input = new BufferedReader(new FileReader("klienci.txt"));
		ArrayList<String> str = new ArrayList<>();
		try {
		  String line = null;
		  while (( line = input.readLine()) != null){
			  str.add(line);
		  }
		}
		catch (FileNotFoundException e) {
		    System.err.println("Error, file " + "klienci.txt" + " didn't exist.");
		}
		finally {
		    input.close();
		}
		
		*/
		
		Scanner s = new Scanner(new File("klienci.txt"));
		s.useDelimiter("[;.*]");
	    	String sl;
		ArrayList<String> str = new ArrayList<String>();
		while (s.hasNext()){
				sl = s.nextLine();
				str.add(sl);
				//s.nextLine();
			//str.add(s.next());		    	
		    
		}
		s.close();
		
		String[] lineArray = str.toArray(new String[]{});
			
		// dodajemy klientów z pliku do comboboxa
		final JComboBox comboBox = new JComboBox(lineArray);
		comboBox.setBounds(22, 31, 303, 20);
		frame.getContentPane().add(comboBox);
		
		comboBox.addItem(p1);
		comboBox.addItem(p2);
		comboBox.addItem(p3);
		
		final JComboBox comboBox_1 = new JComboBox();		
		comboBox_1.setBounds(22, 155, 303, 20);
		// dodajemy nazwy zabiegow do comboboxa
		for(int x=0;x<typesOfTreatments.length;x++){		
		comboBox_1.addItem(typesOfTreatments[x]);
		}
		
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblChooseClient = new JLabel("Wybierz klienta");
		lblChooseClient.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblChooseClient.setBounds(22, 10, 164, 20);
		frame.getContentPane().add(lblChooseClient);
		
		JLabel lblChooseDate = new JLabel("Wybierz datę i godzinę wizyty");
		lblChooseDate.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblChooseDate.setBounds(22, 77, 257, 15);
		frame.getContentPane().add(lblChooseDate);
		
		JLabel lblChoosePurpose = new JLabel("Wybierz cel wizyty");
		lblChoosePurpose.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblChoosePurpose.setBounds(22, 135, 189, 20);	
		frame.getContentPane().add(lblChoosePurpose);
		
		DateTimePicker dateTimePicker = new DateTimePicker();
		dateTimePicker.setBounds(22, 97, 303, 24);
		frame.getContentPane().add(dateTimePicker);
		
		JButton btnNewButton = new JButton("Akceptuj");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 
				FileWriter fw5 = null;
				try {
					fw5 = new FileWriter("wizyta.txt", true);
				} catch (IOException e2) {	 
					e2.printStackTrace();
				}	
				BufferedWriter bfw = new BufferedWriter(fw5);			
				try { 
					bfw.newLine();
					bfw.write("Klient: "+ comboBox.getSelectedItem());
					bfw.newLine();
					bfw.write("Zapisany na: "+ comboBox_1.getSelectedItem());
					bfw.newLine();		
					bfw.write("Termin: "+  dateTimePicker.getDatePicker().toString()+" godz. "+dateTimePicker.getTimePicker().toString());
					bfw.newLine();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				try {
					bfw.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}			
				JOptionPane.showMessageDialog(null, "Pacjent: " +comboBox.getSelectedItem()+ "\nZapisany na: "
						+comboBox_1.getSelectedItem()+ "\nW terminie: "+ dateTimePicker.getDatePicker().toString()+" godz. "+dateTimePicker.getTimePicker().toString());
		
				Menu menu = new Menu();					 
                menu.show().setVisible(true);
                frame.setVisible(false);
							
			}
		});
		btnNewButton.setBounds(22, 199, 117, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCancel = new JButton("Anuluj");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Menu menu = new Menu();					 
                menu.show().setVisible(true);
                frame.setVisible(false);
			}
		});
		btnCancel.setBounds(151, 199, 117, 23);
		frame.getContentPane().add(btnCancel);
		
		
	}

	public Window show() {	 
		return frame;
	}
}
