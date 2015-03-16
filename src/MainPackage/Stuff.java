package MainPackage;

public class Stuff extends Employee {
	private String title;
	public Stuff(){
	}
	public Stuff(String title){
		this.title=title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String toString(){
		return this+"\n"+this.getName();
}
}
