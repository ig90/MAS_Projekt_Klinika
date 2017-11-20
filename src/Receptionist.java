import java.util.ArrayList;


public class Receptionist extends Employee {
	
	
	public Receptionist(String name, String surname, String birthdate,
			String phone_no, String adress, int age, int salary,
			int year_of_birth, String date_of_employment) {
		super(name, surname, birthdate, phone_no, adress, age, salary,
				year_of_birth, date_of_employment);
	}
	
	public Receptionist(String name, String surname, String birthdate,
			String phone_no, String adress, int age, int salary,
			int year_of_birth, String date_of_employment, String date_of_exemption) {
		super(name, surname, birthdate, phone_no, adress, age, salary,
				year_of_birth, date_of_employment, date_of_exemption);
	}

	public ArrayList<Treatment> treatmentsList = new ArrayList<Treatment>();
	
	public void addTreatment(Treatment tr){
		if(!treatmentsList.contains(tr)){
			treatmentsList.add(tr);
		}
	}
	 ArrayList<Visit> visits = new ArrayList<Visit>();
	 
	 public void addSpecialization(Visit visit){
		 if(!visits.contains(visit)){
			 visits.add(visit);		 
		 }
	 }
	public void changeSalary(int salary){
		this.salary=salary;
	}
	
}
