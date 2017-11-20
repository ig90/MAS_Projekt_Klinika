
public abstract class Person {
	
	public String name, surname, birthdate,adress, phone_no;
	 

		public Person(String name, String surname, String birthdate, String phone_no, String adress){
			this.name=name;
			this.surname=surname;
			this.birthdate=birthdate;
			this.phone_no=phone_no;
			this.adress=adress;
			 
		}
		public Person(String name, String surname) {
			this.name = name;
			this.surname = surname;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSurname() {
			return surname;
		}
		public void setSurname(String surname) {
			this.surname = surname;
		}
		public String getBirthdate() {
			return birthdate;
		}
		public void setBirthdate(String birthdate) {
			this.birthdate = birthdate;
		}
		public String getAdress() {
			return adress;
		}
		public void setAdress(String adress) {
			this.adress = adress;
		}
		public String getPhoneNo() {
			return phone_no;
		}
		public void setPhoneNo(String phone_no) {
			this.phone_no = phone_no;
		}
		 
}
