import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JScrollBar;

public class DoctorsTeamGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoctorsTeamGUI window = new DoctorsTeamGUI();
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
	public DoctorsTeamGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Zespoły lekarzy");
		frame.setBounds(100, 100, 500, 421);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
				
		//Lekarze
		Doctor doctor_1 = new Doctor("Przemysław", "Kowalski");
		Doctor doctor_2 = new Doctor("Piotr", "Wiśniewski");
		Doctor doctor_3 = new Doctor("Andrzej", "Kucharczyk");
		Doctor doctor_4 = new Doctor("Joanna", "Zielińska");
		Doctor doctor_5 = new Doctor("Grzegorz", "Kozłowski");
		Doctor doctor_6 = new Doctor("Jan", "Kopciński");
		Doctor doctor_7 = new Doctor("Mariusz", "Mazur");
		Doctor doctor_8 = new Doctor("Helena", "Jabłońska");
		Doctor doctor_9 = new Doctor("Robert", "Dudek");
		Doctor doctor_10 = new Doctor("Monika", "Grzelak");		
		
		//zespoly do zabiegu
		TreatmentTeam team1 = new TreatmentTeam("Zespół chirurgów","2017");
		TreatmentTeam team2 = new TreatmentTeam("Zespół dermatologów","2017");
		TreatmentTeam team3 = new TreatmentTeam("Zespół specjalistów","2017");
		 
		team1.addDoctor(doctor_1);
		team1.addDoctor(doctor_2);
		team1.addDoctor(doctor_3);
		
		team2.addDoctor(doctor_4);
		team2.addDoctor(doctor_5);
		team2.addDoctor(doctor_6);
		team2.addDoctor(doctor_7);
		
		team3.addDoctor(doctor_8);
		team3.addDoctor(doctor_9);
		team3.addDoctor(doctor_10);

		final DefaultListModel lista = new DefaultListModel();
	 
		lista.addElement(team1);
		lista.addElement(team2);
		lista.addElement(team3);
		
		final JList list = new JList(lista);
		list.setBounds(10, 50, 161, 298);
		frame.getContentPane().add(list);
		
		final DefaultListModel display = new DefaultListModel();
		
		JList list_1 = new JList(display);
		JScrollPane scroll = new JScrollPane(list_1);
		scroll.setBounds(181, 50, 300, 298);
		frame.getContentPane().add(scroll);
		
		JButton btnShowTeam = new JButton("Pokaż zespół");
		btnShowTeam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

//				try {
//					ObjectInputStream ois = new ObjectInputStream(new FileInputStream("lekarz.txt"));
//					ArrayList<Lekarz> spis_lekarzy = (ArrayList<Lekarz>) ois.readObject();
//					ois.close();
//				} catch (IOException e1) {
//				} catch (ClassNotFoundException e1) {
//				}	
				
				if(!(list.getSelectedValue()==null)){ 	
					display.removeAllElements();	
					TreatmentTeam team = (TreatmentTeam)list.getSelectedValue();
				
					//arraylist lista_lekarzy
					for(int x=0;x<team.showDoctorsInTeam().size();x++){
				 
						display.addElement("Lekarz " + (x+1));		
						display.addElement(team.showDoctorsInTeam().get(x));
		
					}
				}
			}
		});
		btnShowTeam.setMnemonic('S');
		btnShowTeam.setBounds(10, 359, 161, 23);
		frame.getContentPane().add(btnShowTeam);
		
		JLabel lblTeamList = new JLabel("Lista zespołów");
		lblTeamList.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblTeamList.setBounds(10, 11, 169, 28);
		frame.getContentPane().add(lblTeamList);
		
		JButton btnBack = new JButton("Wróć");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Menu menu = new Menu();					 
                menu.show().setVisible(true);
                frame.setVisible(false);		 
			}
		});
		btnBack.setMnemonic('B');
		btnBack.setBounds(181, 359, 161, 23);
		frame.getContentPane().add(btnBack);
		
		JLabel lblDoctorsInTeamList = new JLabel("Lista lekarzy w zespole");
		lblDoctorsInTeamList.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblDoctorsInTeamList.setBounds(188, 11, 294, 28);
		frame.getContentPane().add(lblDoctorsInTeamList);
		 
	}
	public Component returnComp() {
		// TODO Auto-generated method stub
		return frame;
	}
	public Window show() {
		// TODO Auto-generated method stub
		return frame;
	}
}
