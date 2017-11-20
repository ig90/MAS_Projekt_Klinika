import java.util.Calendar;
public abstract class Employee extends Person{
	
	public int age, salary;
	public String date_of_employment, date_of_exemption;
	int yearOfBirth;
	
	public Employee(String name, String surname, String birthdate,
			String phone_no, String adress, int age, int salary, int year_of_birth,
			String date_of_employment, String date_of_exemption) {
		super(name, surname, birthdate, phone_no, adress);
		this.yearOfBirth=year_of_birth;
		this.age=calcAge(year_of_birth);
		this.salary = salary;
		this.date_of_employment = date_of_employment;
		this.date_of_exemption = date_of_exemption;
	}
	
	public Employee(String name, String surname, String birthdate,
			String phone_no, String adress, int age, int salary, int yearOfBirth,
			String date_of_employment) {
		super(name, surname, birthdate, phone_no, adress);
		this.yearOfBirth=yearOfBirth;
		this.age=calcAge(yearOfBirth);
		this.salary = salary;
		this.date_of_employment = date_of_employment;
	
	}
	public Employee(String name, String surname) {
		super(name, surname);
	}
	private int calcAge(int year_of_birth) {
		int year = Calendar.getInstance().get(Calendar.YEAR);
		return year-year_of_birth;
	}

}
