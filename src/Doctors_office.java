
public class Doctors_office extends Room{

	public Visit visit;
  
	public Doctors_office(int room_no, int floor_no, int area, Visit visit) {
		super(room_no, floor_no, area);
		 this.visit=visit;
	}

}
