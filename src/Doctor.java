import java.io.Serializable;
import java.util.ArrayList;


public class Doctor extends Employee implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String medicalLicense;
	public String permission;
	public boolean available;
	 
	public Doctor(String name, String surname) {
		super(name, surname);
	}
	
	public Doctor(String name, String surname, String birthdate, String phone_no, String adress, int age, int salary,
			  int yearOfBirth, String date_of_employment, String medicalLicense, String permission, boolean available) {
	super(name, surname, birthdate, phone_no, adress, age, salary, yearOfBirth, date_of_employment);
	this.medicalLicense = medicalLicense;
	this.permission = permission;
	this.available = available;
	}
	
	public Doctor(String name, String surname, String birthDate, String phone_no, String adress, int age, int salary,
				  int yearOfBirth, String date_of_employment, String date_of_exemption, String medicalLicense, String permisson, boolean available) {
		super(name, surname, birthDate, phone_no, adress, age, salary, yearOfBirth, date_of_employment, date_of_exemption);

		this.medicalLicense = medicalLicense;
		this.permission = permisson;
		this.available = available;
	}

	ArrayList<TreatmentTeam> team = new ArrayList<TreatmentTeam>();
	 public void addTeam(TreatmentTeam tm){
		 if(!team.contains(tm)){
			 team.add(tm);
			 
			 tm.addDoctor(this);
		 }
	 }
	 
	 ArrayList<Specialization> specializations = new ArrayList<Specialization>();
	 
	 public void addSpecialization(Specialization spec){
		 if(!specializations.contains(spec)){
			 specializations.add(spec);		 
		 }
	 }
	 
	 ArrayList<Visit> visits = new ArrayList<Visit>();
	 
	 public void addVisit(Visit visit){
		 if(!visits.contains(visit)){
			 visits.add(visit);		 
		 }
	 }
	 public boolean checkAvailability(){
			
		return available;	 
	 }
	 public void changeSalary(int salary){
		 this.salary=salary;
	 }
	 public String toString(){
		 return name + " " + surname;
	 }
}
