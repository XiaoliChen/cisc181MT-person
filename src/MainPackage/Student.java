package MainPackage;


/* A student has a class status (freshman, sophomore, junior, or senior). 
 * Define the status as a constant. */
public class Student extends person{
	private eStatus status;
	
	private Student()
	{
	}
	
	public void Card(eStatus status) {
		eStatus Status = status; 
	}


	public eStatus getStatus() {
		return this.status;
	}
	public String toString(){
		return this+"\n"+this.getName();
		
	}
	
		
	}


