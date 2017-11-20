import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.ImageIcon;


public class Registration_GUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration_GUI window = new Registration_GUI();
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
	public Registration_GUI() throws FileNotFoundException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws FileNotFoundException 
	 */
	private void initialize() throws FileNotFoundException {
		frame = new JFrame("Rejestracja nowego klienta");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 484, 300);
		frame.setDefaultCloseOperation(1);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		
	 
		
		JLabel lblImi = new JLabel("Imię:");
		lblImi.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblImi.setBounds(24, 46, 46, 14);
		frame.getContentPane().add(lblImi);
		
		JLabel label = new JLabel("Nazwisko:");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label.setBounds(24, 71, 74, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Data urodzenia:");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_1.setBounds(24, 96, 108, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Adres:");
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_2.setBounds(24, 121, 46, 14);
		frame.getContentPane().add(label_2);
		
		JLabel lblTelefon = new JLabel("Telefon:");
		lblTelefon.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblTelefon.setBounds(24, 146, 46, 14);
		frame.getContentPane().add(lblTelefon);
		
		textField = new JTextField();
		textField.setBounds(64, 44, 142, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(93, 69, 113, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(120, 94, 86, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(64, 121, 142, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(80, 144, 126, 20);
		frame.getContentPane().add(textField_4);
		
		JLabel lblEnterClientData = new JLabel("Wpisz dane klienta");
		lblEnterClientData.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblEnterClientData.setBounds(24, 11, 155, 24);
		frame.getContentPane().add(lblEnterClientData);
		
		JButton btnNewButton = new JButton("Zatwierdź");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(textField.getText().equals("") || textField_1.getText().equals("")||
						textField_2.getText().equals("")|| textField_3.getText().equals("")||
						textField_4.getText().equals("")){
					
				}		 		 
				String zapis = textField.getText()+" "+ textField_1.getText()+" ;"+
							 textField_2.getText()+" "+textField_3.getText()+" "+textField_4.getText();
					 
					 FileWriter fw = null;
						try {
							fw = new FileWriter("klienci.txt", true);
						} catch (IOException e2) {
							 
							e2.printStackTrace();
						}
						BufferedWriter bfw = new BufferedWriter(fw);			
						try { 
							//zapis do pliku
							bfw.write(zapis+"");
							bfw.newLine(); 
						} catch (IOException e1) {
							e1.printStackTrace();
						}
						try {
							bfw.close();
						} catch (IOException e1) {	
							e1.printStackTrace();
						}	
						Valid correct = new Valid();					 
		                correct.getFrame().setVisible(true);
		                frame.setVisible(false);				 	
			}
		});
		btnNewButton.setBounds(24, 227, 110, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCancel = new JButton("Anuluj");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Menu menu = new Menu();					 
                menu.show().setVisible(true);
                frame.setVisible(false);
			}
		});
		btnCancel.setBounds(144, 227, 110, 23);
		frame.getContentPane().add(btnCancel);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("zd3.jpg"));
		label_3.setBounds(223, 11, 245, 188);
		frame.getContentPane().add(label_3);
	}
	public Window show() {
		return frame;
	}
}