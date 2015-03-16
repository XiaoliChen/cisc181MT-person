package MainPackage;

import java.util.Date;
//* An employee has an office, salary, and date hired.
public class Employee extends person{
	private String office;
	private String salary;
	private Date date_hired;
	
	public Employee(){
	}
	public Employee(String office, String salary, Date date_hired){
	this.office= office;
	this.salary=salary;
	this.date_hired= date_hired;
}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public Date getDate_hired() {
		return date_hired;
	}
	public void setDate_hired(Date date_hired) {
		this.date_hired = date_hired;
	}
	public String toString(){
		return this+"\n"+this.getName();
		
	}
	
}
