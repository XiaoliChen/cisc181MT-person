package MainPackage;
/*Design a class named Person and its two subclasses named Student and Employee.
 *  Make Faculty and Staff subclasses of Employee. 
 * A person has a name, address, phone number, and email address. 
 * A student has a class status (freshman, sophomore, junior, or senior)Define the status as a constant. 
 * An employee has an office, salary, and date hired.
 *  Define a class named MyDate that contains the fields year, month, and day. 
 *  A faculty member has office hours and a rank. 
 *  A staff member has a title. Override the toString method 
 *  in each class to display the class name and the person's name.


 */

public class person {
	private String name, address, phone , email;
	public person(){
	}
	public person(String name, String address, String phone, String email){
	this.name=name;
	this.address=address;
	this.phone=phone;
	this.email=email;
	
}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString(){
		return getClass().getName()+name;
	}
	
}
