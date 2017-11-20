
public class TreatmentInRoom {
	
	public Treatment treatment;
	public Treatment_room room;
	public String date, hour;

	public TreatmentInRoom(Treatment treatment, Treatment_room room, String date,
			String hour) {
		this.treatment = treatment;
		treatment.addTreatment(this);
		this.room = room;
		room.addTreatment(this);
		this.date = date;
		this.hour = hour;
	}
	
}
