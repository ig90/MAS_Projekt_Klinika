import java.util.ArrayList;


public class Treatment {
	
	public String name, start_hour, end_hour, date_of_treatment, complaint;
	public int price;
	public TreatmentTeam team;
	public Receptionist reception;
 
	public Treatment(String name) {
		this.name = name;
	}

	public Treatment (String name, String start_hour, String end_hour, String date_of_treatment,
			int price, String complaint, TreatmentTeam team, Receptionist reception){
		this.name=name;
		this.end_hour=end_hour;
		this.start_hour=start_hour;
		this.date_of_treatment=date_of_treatment;
		this.complaint=complaint;
		this.price=price;
		this.team=team;
		this.reception=reception;

	}
	
	public String checkComplaint(){
		return complaint;
	}
	
	public String getName(){
		return name;
	}
	
	public ArrayList<TreatmentInRoom> treatments = new ArrayList<TreatmentInRoom>();

	public void addTreatment(TreatmentInRoom treatmentInRoom) {
		if(!treatments.contains(treatmentInRoom)){
			treatments.add(treatmentInRoom);
		}
	}

}
