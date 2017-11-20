import java.util.ArrayList;

public class Patient extends Person{
	
	public String description, medications, results, dateOfBloodCollection;

	public ArrayList<Visit> visitsList = new ArrayList<Visit>();
	public Patient_room room;
	
	//konstruktor do gui
	public Patient(String name, String surname, String birthdate, String adress, String phone_no){
		super(name,surname,birthdate,adress,phone_no);
	}

	public Patient(String name, String surname, String birthdate,
			String phone_no, String adress, String description, String medications,
			String results,String dateOfBloodCollection, Patient_room room) {
		super(name, surname, birthdate, phone_no, adress);
		
		this.description=description;
		this.medications=medications;
		this.results=results;
		this.dateOfBloodCollection=dateOfBloodCollection;
		this.room=room;
 
	}
	public void addVisit(Visit visit){
		if(!visitsList.contains(visit)){
			visitsList.add(visit);
		}
	}
	public ArrayList<String> treatmentsHistory = new ArrayList<String>();
	
	public void addTreatment(String tr){
		treatmentsHistory.add(tr);
	}
	public void registerPatient(){
		
	}
	public void showData(){
		
	}
	public void updateData(){
		
	}
	public String toString(){
		return name + "  "+ surname;
	}
}
