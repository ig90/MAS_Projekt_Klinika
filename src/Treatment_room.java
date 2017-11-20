import java.util.ArrayList;

public class Treatment_room extends Room{

	public Treatment treatment;
 
	public Treatment_room(int room_no, int floor_no, int area, String bathroom, Treatment treatment) {
		super(room_no, floor_no, area, bathroom);
		 
		this.treatment=treatment;
	}
	public Treatment_room(int room_no, int floor_no, int area, Treatment treatment) {
		 super(room_no, floor_no, area);
		 
		 this.treatment=treatment;
	}
	public ArrayList<String> equipment = new ArrayList<String>();
	
	public void addEquipment(String eq){		 
		equipment.add(eq);		 
	}
	public ArrayList<TreatmentInRoom> treatments = new ArrayList<TreatmentInRoom>();

	public void addTreatment(TreatmentInRoom treatmentInRoom) {
		if(!treatments.contains(treatmentInRoom)){
			treatments.add(treatmentInRoom);
		}
	}
	public void assignRoom(){
		
	}
}