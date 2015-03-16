package MainPackage;

public class faculty extends Employee{
	
	private String Office_Hours,rank;
	public faculty(){
	}
	public faculty(String Office_Hours,String rank){
	this.Office_Hours=Office_Hours;
	this.rank=rank;
}
	public String getOffice_Hours() {
		return Office_Hours;
	}
	public void setOffice_Hours(String office_Hours) {
		Office_Hours = office_Hours;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String toString(){
		return this+"\n"+this.getName();

}
	}