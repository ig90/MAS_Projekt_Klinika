import java.util.ArrayList;

public class Patient_room extends Room{
	
	public int numberOfBeds;
	
	public String facilities;

	public Patient_room(int room_no, int floor_no, int area, String bathroom, int numberOfBeds, String facilities) {
		super(room_no, floor_no, area, bathroom);
 
		this.numberOfBeds=numberOfBeds;
		this.facilities=facilities;
	 
	}
	public Patient_room(int room_no, int floor_no, int area, int numberOfBeds) {
		super(room_no, floor_no, area);
		this.numberOfBeds=numberOfBeds;
	
	}
	public ArrayList<String> equipment = new ArrayList<String>();
	
	public void addEquipment(String eq){
		 
		equipment.add(eq);	 
	}
	
	public ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public void addPatient(Patient patient){
		if(!patients.contains(patient)){
			patients.add(patient);
		}
	}
	public void assignRoom(){
		
	}
}
