import java.util.ArrayList;


public class Specialization {
	
	public String name, dateOfObtain;
	public ArrayList<Doctor> doctor = new ArrayList<Doctor>();
	
	public Specialization(String name, String dateOfObtain, ArrayList<Doctor> doctor){
		this.name=name;
		this.dateOfObtain=dateOfObtain;
		this.doctor=doctor;
	}

}
