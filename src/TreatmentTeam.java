import java.util.ArrayList;
import java.io.Serializable;
public class TreatmentTeam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int bonus;
	public String starts;
	public String ends; 
	public String name;
	
	public TreatmentTeam(String name, int bonus, String starts, String ends){
		this.name=name;
		this.bonus=bonus;
		this.starts=starts;
		this.ends=ends;
  
	}
	public TreatmentTeam(String name, String starts){
		this.name=name;
		this.starts=starts;
	}
	public ArrayList<Assistant> assistantsList = new ArrayList<Assistant>();
	
	public void addAssistant(Assistant assistant){
		if(!assistantsList.contains(assistant)){
			assistantsList.add(assistant);
			
		}
	}
	public ArrayList<Doctor> doctorsList = new ArrayList<Doctor>();
	
	public void addDoctor(Doctor doctor){
		if(!doctorsList.contains(doctor)){
			doctorsList.add(doctor);
			
			doctor.addTeam(this);
		}
	}
	public ArrayList<Treatment> treatmentsList = new ArrayList<Treatment>();
	
	public void addTreatment(Treatment tr){
		if(!treatmentsList.contains(tr)){
			treatmentsList.add(tr);
		}
	}
	public ArrayList<Doctor> showDoctorsInTeam(){
		return doctorsList;
	}
	public void assignAssistant(){
		
	} 
	public String toString(){
		return name;
	}
	
}
