import java.util.ArrayList;

public class Assistant extends Employee {


		public TreatmentTeam TreatmentTeam;
		public String opinion;
		public boolean available;
		 
	public Assistant(String name, String surname, String birthdate, String phone_no, String adress, int age, int salary,
				int yearOfBirth, String date_of_employment, String date_of_exemption, String opinia, TreatmentTeam TreatmentTeam, boolean dostepny) {
			super(name, surname, birthdate, phone_no, adress, age, salary, yearOfBirth, date_of_employment, date_of_exemption);
			this.opinion = opinia;
			this.TreatmentTeam=TreatmentTeam;
			this.available = dostepny;
 
		}
	
	public Assistant(String name, String surname, String birthdate, String phone_no, String adress, int age, int salary,
			int yearOfBirth, String date_of_employment, String opinion, TreatmentTeam TreatmentTeam, boolean available) {
		super(name, surname, birthdate, phone_no, adress, age, salary, yearOfBirth, date_of_employment);
		this.opinion = opinion;
		this.TreatmentTeam=TreatmentTeam;
		this.available = available;
	}
	
	public ArrayList<String> assistsList = new ArrayList<String>();
	
	public void addAssist(String assist) {
		if(!assistsList.contains(assist)){
			assistsList.add(assist);
		}
	}
	public String checkOpinion(){
		return opinion;
	}
	public void assignOpinion(String opinion){
		this.opinion=opinion;
	}
	public void changeSalary(int salary){
		this.salary=salary;
	}
	public boolean checkAvailability(){
	
			return available;
	}
	public String toString(){
		return name + " " + surname;
	}


}
