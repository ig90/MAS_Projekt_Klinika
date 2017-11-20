
public class Visit {
	
	public String date, hour, type, price;
	public Receptionist reception;
	public Patient patient;
	public Doctor doctor;
	public Doctors_office doctors_office;
	
	public Visit(String date, String hour, String type, String price,
			Receptionist reception, Patient patient, Doctor doctor, Doctors_office doctors_office){
		
			this.date=date;
			this.hour=hour;
			this.type=type;
			this.price=price;
			this.reception=reception;
			this.patient=patient;
			this.doctor=doctor;
			this.doctors_office=doctors_office;
		
	}

}
