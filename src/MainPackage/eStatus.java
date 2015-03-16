package MainPackage;

public enum eStatus {
	freshmen(1),
	Sophomore(2),
    Junior(3),
    Senior(4);  
	private eStatus(final int status){
		this.status = status;
	}

	private int status;
	
	public int getStatus(){
		return status;  

}
}